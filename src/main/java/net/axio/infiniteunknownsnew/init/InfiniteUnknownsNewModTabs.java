
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

public class InfiniteUnknownsNewModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfiniteUnknownsNewMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_ITEMS = REGISTRY.register("page_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns_new.page_items")).icon(() -> new ItemStack(InfiniteUnknownsNewModItems.STANDARD_ENERGIZING_GLOVES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsNewModItems.STANDARD_ENERGIZING_GLOVES.get());
				tabData.accept(InfiniteUnknownsNewModItems.EXHANCED_ENERGIZING_GLOVES.get());
				tabData.accept(InfiniteUnknownsNewModItems.GRAVITATIONAL_ENERGIZING_GLOVES.get());
				tabData.accept(InfiniteUnknownsNewModItems.IRON_MACHINING_HAMMER.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_BLOCKS = REGISTRY.register("page_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns_new.page_blocks")).icon(() -> new ItemStack(InfiniteUnknownsNewModBlocks.SIMPLE_FRAMEWORK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsNewModBlocks.SIMPLE_FRAMEWORK.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.STANDARD_FRAMEWORK.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.ADVANCED_FRAMEWORK.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.GRAVITATIONAL_FRAMEWORK.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.SIMPLE_GRAVEL_FILTER.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.STANDARD_GRAVEL_FILTER.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.EXHANCED_GRAVEL_FILTER.get().asItem());
				tabData.accept(InfiniteUnknownsNewModBlocks.GRAVITATIONAL_GRAVEL_FILTER.get().asItem());
			})

					.build());
}
