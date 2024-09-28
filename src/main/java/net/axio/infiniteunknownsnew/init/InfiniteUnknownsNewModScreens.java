
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.axio.infiniteunknownsnew.client.gui.SimpleMachiningTableGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InfiniteUnknownsNewModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(InfiniteUnknownsNewModMenus.SIMPLE_MACHINING_TABLE_GUI.get(), SimpleMachiningTableGUIScreen::new);
	}
}
