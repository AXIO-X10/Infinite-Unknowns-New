
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.axio.infiniteunknownsnew.world.inventory.SimpleMachiningTableGUIMenu;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

public class InfiniteUnknownsNewModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, InfiniteUnknownsNewMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SimpleMachiningTableGUIMenu>> SIMPLE_MACHINING_TABLE_GUI = REGISTRY.register("simple_machining_table_gui", () -> IMenuTypeExtension.create(SimpleMachiningTableGUIMenu::new));
}
