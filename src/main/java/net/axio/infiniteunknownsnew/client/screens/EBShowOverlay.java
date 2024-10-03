
package net.axio.infiniteunknownsnew.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.axio.infiniteunknownsnew.procedures.ProcessEBShowProcedure;
import net.axio.infiniteunknownsnew.procedures.ProcessEBShowLogicProcedure;

@EventBusSubscriber({Dist.CLIENT})
public class EBShowOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (ProcessEBShowLogicProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ProcessEBShowProcedure.execute(entity), w / 2 + -36, h / 2 + 59, -1, false);
		}
	}
}
