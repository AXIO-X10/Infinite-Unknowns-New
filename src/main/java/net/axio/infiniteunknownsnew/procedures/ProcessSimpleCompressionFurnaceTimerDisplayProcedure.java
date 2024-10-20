package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ProcessSimpleCompressionFurnaceTimerDisplayProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("timer") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) > 0
				? ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("timer") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1) + "s"
				: "";
	}
}
