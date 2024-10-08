package net.axio.infiniteunknownsnew.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.axio.infiniteunknownsnew.world.inventory.SimpleGravelFilterGUIMenu;
import net.axio.infiniteunknownsnew.procedures.ProcessGravelFilterFuelDisplayProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SimpleGravelFilterGUIScreen extends AbstractContainerScreen<SimpleGravelFilterGUIMenu> {
	private final static HashMap<String, Object> guistate = SimpleGravelFilterGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SimpleGravelFilterGUIScreen(SimpleGravelFilterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("infinite_unknowns_new:textures/screens/simple_gravel_filter_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("infinite_unknowns_new:textures/screens/gravel_filter_gui.png"), this.leftPos + 79, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.infinite_unknowns_new.simple_gravel_filter_gui.label_sscsimple_gravel_filter"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.infinite_unknowns_new.simple_gravel_filter_gui.label_fuel"), 6, 70, -12829636, false);
		guiGraphics.drawString(this.font,

				ProcessGravelFilterFuelDisplayProcedure.execute(world, x, y, z), 42, 70, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
