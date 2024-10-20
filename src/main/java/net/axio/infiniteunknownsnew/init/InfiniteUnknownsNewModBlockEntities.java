
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

import net.axio.infiniteunknownsnew.block.entity.StandardMachiningTableBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.StandardGravelFilterBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleMachiningTableBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleGravelFilterBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleEnegyNetworkIncorporatedEquipmentBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.SimpleCompressionFurnaceBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.GravitationalMachiningTableBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.GravitationalGravelFilterBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.ExhancedMachiningTableBlockEntity;
import net.axio.infiniteunknownsnew.block.entity.ExhancedGravelFilterBlockEntity;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class InfiniteUnknownsNewModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, InfiniteUnknownsNewMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_GRAVEL_FILTER = register("simple_gravel_filter", InfiniteUnknownsNewModBlocks.SIMPLE_GRAVEL_FILTER, SimpleGravelFilterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> STANDARD_GRAVEL_FILTER = register("standard_gravel_filter", InfiniteUnknownsNewModBlocks.STANDARD_GRAVEL_FILTER, StandardGravelFilterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> EXHANCED_GRAVEL_FILTER = register("exhanced_gravel_filter", InfiniteUnknownsNewModBlocks.EXHANCED_GRAVEL_FILTER, ExhancedGravelFilterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRAVITATIONAL_GRAVEL_FILTER = register("gravitational_gravel_filter", InfiniteUnknownsNewModBlocks.GRAVITATIONAL_GRAVEL_FILTER, GravitationalGravelFilterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_MACHINING_TABLE = register("simple_machining_table", InfiniteUnknownsNewModBlocks.SIMPLE_MACHINING_TABLE, SimpleMachiningTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> STANDARD_MACHINING_TABLE = register("standard_machining_table", InfiniteUnknownsNewModBlocks.STANDARD_MACHINING_TABLE, StandardMachiningTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> EXHANCED_MACHINING_TABLE = register("exhanced_machining_table", InfiniteUnknownsNewModBlocks.EXHANCED_MACHINING_TABLE, ExhancedMachiningTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRAVITATIONAL_MACHINING_TABLE = register("gravitational_machining_table", InfiniteUnknownsNewModBlocks.GRAVITATIONAL_MACHINING_TABLE,
			GravitationalMachiningTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT = register("simple_enegy_network_incorporated_equipment",
			InfiniteUnknownsNewModBlocks.SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT, SimpleEnegyNetworkIncorporatedEquipmentBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SIMPLE_COMPRESSION_FURNACE = register("simple_compression_furnace", InfiniteUnknownsNewModBlocks.SIMPLE_COMPRESSION_FURNACE, SimpleCompressionFurnaceBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_GRAVEL_FILTER.get(), (blockEntity, side) -> ((SimpleGravelFilterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STANDARD_GRAVEL_FILTER.get(), (blockEntity, side) -> ((StandardGravelFilterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EXHANCED_GRAVEL_FILTER.get(), (blockEntity, side) -> ((ExhancedGravelFilterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAVITATIONAL_GRAVEL_FILTER.get(), (blockEntity, side) -> ((GravitationalGravelFilterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_MACHINING_TABLE.get(), (blockEntity, side) -> ((SimpleMachiningTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STANDARD_MACHINING_TABLE.get(), (blockEntity, side) -> ((StandardMachiningTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EXHANCED_MACHINING_TABLE.get(), (blockEntity, side) -> ((ExhancedMachiningTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAVITATIONAL_MACHINING_TABLE.get(), (blockEntity, side) -> ((GravitationalMachiningTableBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT.get(), (blockEntity, side) -> ((SimpleEnegyNetworkIncorporatedEquipmentBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIMPLE_COMPRESSION_FURNACE.get(), (blockEntity, side) -> ((SimpleCompressionFurnaceBlockEntity) blockEntity).getItemHandler());
	}
}
