
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.axio.infiniteunknownsnew.world.inventory.StandardMachiningTableGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.StandardGravelFilterGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.SimpleMachiningTableGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.SimpleGravelFilterGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.SimpleCompressionFurnaceGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.GravitationalMachiningTableGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.GravitationalGravelFilterGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.ExhancedMachiningTableGUIMenu;
import net.axio.infiniteunknownsnew.world.inventory.ExhancedGravelFilterGUIMenu;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

public class InfiniteUnknownsNewModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, InfiniteUnknownsNewMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SimpleMachiningTableGUIMenu>> SIMPLE_MACHINING_TABLE_GUI = REGISTRY.register("simple_machining_table_gui", () -> IMenuTypeExtension.create(SimpleMachiningTableGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SimpleGravelFilterGUIMenu>> SIMPLE_GRAVEL_FILTER_GUI = REGISTRY.register("simple_gravel_filter_gui", () -> IMenuTypeExtension.create(SimpleGravelFilterGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SimpleCompressionFurnaceGUIMenu>> SIMPLE_COMPRESSION_FURNACE_GUI = REGISTRY.register("simple_compression_furnace_gui",
			() -> IMenuTypeExtension.create(SimpleCompressionFurnaceGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<StandardMachiningTableGUIMenu>> STANDARD_MACHINING_TABLE_GUI = REGISTRY.register("standard_machining_table_gui", () -> IMenuTypeExtension.create(StandardMachiningTableGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ExhancedMachiningTableGUIMenu>> EXHANCED_MACHINING_TABLE_GUI = REGISTRY.register("exhanced_machining_table_gui", () -> IMenuTypeExtension.create(ExhancedMachiningTableGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GravitationalMachiningTableGUIMenu>> GRAVITATIONAL_MACHINING_TABLE_GUI = REGISTRY.register("gravitational_machining_table_gui",
			() -> IMenuTypeExtension.create(GravitationalMachiningTableGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<StandardGravelFilterGUIMenu>> STANDARD_GRAVEL_FILTER_GUI = REGISTRY.register("standard_gravel_filter_gui", () -> IMenuTypeExtension.create(StandardGravelFilterGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ExhancedGravelFilterGUIMenu>> EXHANCED_GRAVEL_FILTER_GUI = REGISTRY.register("exhanced_gravel_filter_gui", () -> IMenuTypeExtension.create(ExhancedGravelFilterGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GravitationalGravelFilterGUIMenu>> GRAVITATIONAL_GRAVEL_FILTER_GUI = REGISTRY.register("gravitational_gravel_filter_gui",
			() -> IMenuTypeExtension.create(GravitationalGravelFilterGUIMenu::new));
}
