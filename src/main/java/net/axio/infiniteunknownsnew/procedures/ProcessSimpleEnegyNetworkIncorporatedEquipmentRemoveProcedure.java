package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

public class ProcessSimpleEnegyNetworkIncorporatedEquipmentRemoveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.temporary_uuid = new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "owner");
			_vars.syncPlayerVariables(entity);
		}
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.temporary_ebneed = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.temporary_ebstorage = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.temporary_ebneed = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "EB_need");
			_vars.syncPlayerVariables(entity);
		}
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.temporary_ebstorage = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "EB_storage");
			_vars.syncPlayerVariables(entity);
		}
	}
}
