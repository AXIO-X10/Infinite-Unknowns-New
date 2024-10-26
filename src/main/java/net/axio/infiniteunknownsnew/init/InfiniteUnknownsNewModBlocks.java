
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknownsnew.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.axio.infiniteunknownsnew.block.StandardMachiningTableBlock;
import net.axio.infiniteunknownsnew.block.StandardGravelFilterBlock;
import net.axio.infiniteunknownsnew.block.StandardFrameworkBlock;
import net.axio.infiniteunknownsnew.block.SimpleMachiningTableBlock;
import net.axio.infiniteunknownsnew.block.SimpleGravelFilterBlock;
import net.axio.infiniteunknownsnew.block.SimpleFrameworkBlock;
import net.axio.infiniteunknownsnew.block.SimpleEnegyNetworkIncorporatedEquipmentBlock;
import net.axio.infiniteunknownsnew.block.SimpleCompressionFurnaceBlock;
import net.axio.infiniteunknownsnew.block.LogicGateANDBlock;
import net.axio.infiniteunknownsnew.block.GravitationalMachiningTableBlock;
import net.axio.infiniteunknownsnew.block.GravitationalGravelFilterBlock;
import net.axio.infiniteunknownsnew.block.GravitationalFrameworkBlock;
import net.axio.infiniteunknownsnew.block.ExhancedMachiningTableBlock;
import net.axio.infiniteunknownsnew.block.ExhancedGravelFilterBlock;
import net.axio.infiniteunknownsnew.block.DeathBlock;
import net.axio.infiniteunknownsnew.block.AdvancedFrameworkBlock;
import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

public class InfiniteUnknownsNewModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(InfiniteUnknownsNewMod.MODID);
	public static final DeferredBlock<Block> SIMPLE_FRAMEWORK = REGISTRY.register("simple_framework", SimpleFrameworkBlock::new);
	public static final DeferredBlock<Block> STANDARD_FRAMEWORK = REGISTRY.register("standard_framework", StandardFrameworkBlock::new);
	public static final DeferredBlock<Block> ADVANCED_FRAMEWORK = REGISTRY.register("advanced_framework", AdvancedFrameworkBlock::new);
	public static final DeferredBlock<Block> GRAVITATIONAL_FRAMEWORK = REGISTRY.register("gravitational_framework", GravitationalFrameworkBlock::new);
	public static final DeferredBlock<Block> SIMPLE_GRAVEL_FILTER = REGISTRY.register("simple_gravel_filter", SimpleGravelFilterBlock::new);
	public static final DeferredBlock<Block> STANDARD_GRAVEL_FILTER = REGISTRY.register("standard_gravel_filter", StandardGravelFilterBlock::new);
	public static final DeferredBlock<Block> EXHANCED_GRAVEL_FILTER = REGISTRY.register("exhanced_gravel_filter", ExhancedGravelFilterBlock::new);
	public static final DeferredBlock<Block> GRAVITATIONAL_GRAVEL_FILTER = REGISTRY.register("gravitational_gravel_filter", GravitationalGravelFilterBlock::new);
	public static final DeferredBlock<Block> SIMPLE_MACHINING_TABLE = REGISTRY.register("simple_machining_table", SimpleMachiningTableBlock::new);
	public static final DeferredBlock<Block> STANDARD_MACHINING_TABLE = REGISTRY.register("standard_machining_table", StandardMachiningTableBlock::new);
	public static final DeferredBlock<Block> EXHANCED_MACHINING_TABLE = REGISTRY.register("exhanced_machining_table", ExhancedMachiningTableBlock::new);
	public static final DeferredBlock<Block> GRAVITATIONAL_MACHINING_TABLE = REGISTRY.register("gravitational_machining_table", GravitationalMachiningTableBlock::new);
	public static final DeferredBlock<Block> SIMPLE_ENEGY_NETWORK_INCORPORATED_EQUIPMENT = REGISTRY.register("simple_enegy_network_incorporated_equipment", SimpleEnegyNetworkIncorporatedEquipmentBlock::new);
	public static final DeferredBlock<Block> DEATH = REGISTRY.register("death", DeathBlock::new);
	public static final DeferredBlock<Block> SIMPLE_COMPRESSION_FURNACE = REGISTRY.register("simple_compression_furnace", SimpleCompressionFurnaceBlock::new);
	public static final DeferredBlock<Block> LOGIC_GATE_AND = REGISTRY.register("logic_gate_and", LogicGateANDBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
