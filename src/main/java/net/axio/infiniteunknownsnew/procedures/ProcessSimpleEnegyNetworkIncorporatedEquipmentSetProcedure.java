package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

import java.util.ArrayList;

public class ProcessSimpleEnegyNetworkIncorporatedEquipmentSetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, BlockPos.containing(x, y, z), "owner")).equals(entityiterator.getStringUUID())) {
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EB = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB - (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_storage"));
					_vars.syncPlayerVariables(entityiterator);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("EB_storage",
								((((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip4
										? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip4)
										: -1) == 0
												? ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip6
														? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip6)
														: -1)
												: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip8
												? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip8)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip10
																? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip10)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip12
												? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip12)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip14
																? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip14)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip16
												? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip16)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip18
																? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip18)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip20
												? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip20)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip22
																? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip22)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip24
												? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip24)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip26
																? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip26)
																: -1)
														: 0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EB = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_storage");
					_vars.syncPlayerVariables(entityiterator);
				}
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EBNeed = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed - (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_need"));
					_vars.syncPlayerVariables(entityiterator);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("EB_need",
								((((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip31
										? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip31)
										: -1) == 1
												? ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip33
														? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip33)
														: -1)
												: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip35
												? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip35)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip37
																? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip37)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip39
												? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip39)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip41
																? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip41)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip43
												? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip43)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip45
																? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip45)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip47
												? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip47)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip49
																? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip49)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip51
												? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip51)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip53
																? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip53)
																: -1)
														: 0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EBNeed = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_need");
					_vars.syncPlayerVariables(entityiterator);
				}
			}
		}
	}
}
