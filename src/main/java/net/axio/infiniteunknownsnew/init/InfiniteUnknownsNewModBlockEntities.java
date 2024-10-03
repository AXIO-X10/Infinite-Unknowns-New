
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.axio.infiniteunknownsnew.block.entity.Test1BlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleMachiningTableBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleGravelFilterBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleEnegyNetworkIncorporatedEquipmentBlockEntity;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class InfiniteUnknownsNewModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, InfiniteUnknownsNewMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_GRAVEL_FILTER = register("simple_gravel_filter", InfiniteUnknownsNewModBlocks.SIMPLE_GRAVEL_FILTER, SimpleGravelFilterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_MACHINING_TABLE = register("simple_machining_table", InfiniteUnknownsNewModBlocks.SIMPLE_MACHINING_TABLE, SimpleMachiningTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT = register("simple_enegy_network_incorporated_equipment",
			InfiniteUnknownsNewModBlocks.SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT, SimpleEnegyNetworkIncorporatedEquipmentBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TEST_1 = register("test_1", InfiniteUnknownsNewModBlocks.TEST_1, Test1BlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_GRAVEL_FILTER.get(), (blockEntity, side) -> ((SimpleGravelFilterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_MACHINING_TABLE.get(), (blockEntity, side) -> ((SimpleMachiningTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT.get(), (blockEntity, side) -> ((SimpleEnegyNetworkIncorporatedEquipmentBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TEST_1.get(), (blockEntity, side) -> ((Test1BlockEntity) blockEntity).getItemHandler());
	}
}
