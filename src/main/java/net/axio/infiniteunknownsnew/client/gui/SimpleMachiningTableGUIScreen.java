package net.axio.infiniteunknownsnew.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.axio.infiniteunknownsnew.world.inventory.SimpleMachiningTableGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SimpleMachiningTableGUIScreen extends AbstractContainerScreen<SimpleMachiningTableGUIMenu> {
	private final static HashMap<String, Object> guistate = SimpleMachiningTableGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_machining;

	public SimpleMachiningTableGUIScreen(SimpleMachiningTableGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("infinite_unknowns_new:textures/screens/simple_machining_table_gui.png");

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

		guiGraphics.blit(ResourceLocation.parse("infinite_unknowns_new:textures/screens/machining_table_gui.png"), this.leftPos + 96, this.topPos + 43, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.infinite_unknowns_new.simple_machining_table_gui.label_sscsimple_machining_table"), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_machining = Button.builder(Component.translatable("gui.infinite_unknowns_new.simple_machining_table_gui.button_machining"), e -> {
		}).bounds(this.leftPos + 87, this.topPos + 61, 36, 20).build();
		guistate.put("button:button_machining", button_machining);
		this.addRenderableWidget(button_machining);
	}
}