
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.axio.infiniteunknownsnew.client.gui.StandardMachiningTableGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.StandardGravelFilterGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.SimpleMachiningTableGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.SimpleGravelFilterGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.SimpleCompressionFurnaceGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.GravitationalMachiningTableGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.GravitationalGravelFilterGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.ExhancedMachiningTableGUIScreen;
import net.axio.infiniteunknownsnew.client.gui.ExhancedGravelFilterGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InfiniteUnknownsNewModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(InfiniteUnknownsNewModMenus.SIMPLE_MACHINING_TABLE_GUI.get(), SimpleMachiningTableGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.SIMPLE_GRAVEL_FILTER_GUI.get(), SimpleGravelFilterGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.SIMPLE_COMPRESSION_FURNACE_GUI.get(), SimpleCompressionFurnaceGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.STANDARD_MACHINING_TABLE_GUI.get(), StandardMachiningTableGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.EXHANCED_MACHINING_TABLE_GUI.get(), ExhancedMachiningTableGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.GRAVITATIONAL_MACHINING_TABLE_GUI.get(), GravitationalMachiningTableGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.STANDARD_GRAVEL_FILTER_GUI.get(), StandardGravelFilterGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.EXHANCED_GRAVEL_FILTER_GUI.get(), ExhancedGravelFilterGUIScreen::new);
		event.register(InfiniteUnknownsNewModMenus.GRAVITATIONAL_GRAVEL_FILTER_GUI.get(), GravitationalGravelFilterGUIScreen::new);
	}
}
