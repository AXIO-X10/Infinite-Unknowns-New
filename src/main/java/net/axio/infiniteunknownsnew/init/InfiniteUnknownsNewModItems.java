
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.axio.infiniteunknownsnew.item.StandardEnergizingGlovesItem;
import net.axio.infiniteunknownsnew.item.IronMachiningHammerItem;
import net.axio.infiniteunknownsnew.item.GravitationalEnergizingGlovesItem;
import net.axio.infiniteunknownsnew.item.ExhancedEnergizingGlovesItem;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

public class InfiniteUnknownsNewModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(InfiniteUnknownsNewMod.MODID);
	public static final DeferredItem<Item> SIMPLE_FRAMEWORK = block(InfiniteUnknownsNewModBlocks.SIMPLE_FRAMEWORK);
	public static final DeferredItem<Item> STANDARD_FRAMEWORK = block(InfiniteUnknownsNewModBlocks.STANDARD_FRAMEWORK);
	public static final DeferredItem<Item> ADVANCED_FRAMEWORK = block(InfiniteUnknownsNewModBlocks.ADVANCED_FRAMEWORK);
	public static final DeferredItem<Item> GRAVITATIONAL_FRAMEWORK = block(InfiniteUnknownsNewModBlocks.GRAVITATIONAL_FRAMEWORK);
	public static final DeferredItem<Item> SIMPLE_GRAVEL_FILTER = block(InfiniteUnknownsNewModBlocks.SIMPLE_GRAVEL_FILTER);
	public static final DeferredItem<Item> STANDARD_GRAVEL_FILTER = block(InfiniteUnknownsNewModBlocks.STANDARD_GRAVEL_FILTER);
	public static final DeferredItem<Item> EXHANCED_GRAVEL_FILTER = block(InfiniteUnknownsNewModBlocks.EXHANCED_GRAVEL_FILTER);
	public static final DeferredItem<Item> GRAVITATIONAL_GRAVEL_FILTER = block(InfiniteUnknownsNewModBlocks.GRAVITATIONAL_GRAVEL_FILTER);
	public static final DeferredItem<Item> STANDARD_ENERGIZING_GLOVES = REGISTRY.register("standard_energizing_gloves", StandardEnergizingGlovesItem::new);
	public static final DeferredItem<Item> EXHANCED_ENERGIZING_GLOVES = REGISTRY.register("exhanced_energizing_gloves", ExhancedEnergizingGlovesItem::new);
	public static final DeferredItem<Item> GRAVITATIONAL_ENERGIZING_GLOVES = REGISTRY.register("gravitational_energizing_gloves", GravitationalEnergizingGlovesItem::new);
	public static final DeferredItem<Item> IRON_MACHINING_HAMMER = REGISTRY.register("iron_machining_hammer", IronMachiningHammerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
