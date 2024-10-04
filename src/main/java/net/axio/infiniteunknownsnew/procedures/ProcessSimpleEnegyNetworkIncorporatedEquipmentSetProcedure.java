package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Marker;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

import java.util.Comparator;
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
				if (!world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("backup_ebstorage", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_storage")));
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("EB_storage",
								((((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip8
										? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip8)
										: -1) == 0
												? ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip10
														? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip10)
														: -1)
												: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip12
												? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip12)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip14
																? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip14)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip16
												? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip16)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip18
																? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip18)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip20
												? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip20)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip22
																? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip22)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip24
												? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip24)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip26
																? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip26)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip28
												? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip28)
												: -1) == 0
														? ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip30
																? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip30)
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
				if (!world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("backup_ebneed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "EB_need")));
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("EB_need",
								((((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip39
										? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip39)
										: -1) == 1
												? ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip41
														? (world.getBlockState(BlockPos.containing(x, y + 1, z))).getValue(_getip41)
														: -1)
												: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip43
												? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip43)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip45
																? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip45)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip47
												? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip47)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip49
																? (world.getBlockState(BlockPos.containing(x + 1, y, z))).getValue(_getip49)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip51
												? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip51)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip53
																? (world.getBlockState(BlockPos.containing(x - 1, y, z))).getValue(_getip53)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip55
												? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip55)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip57
																? (world.getBlockState(BlockPos.containing(x, y, z + 1))).getValue(_getip57)
																: -1)
														: 0)
										+ (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("eb_type") instanceof IntegerProperty _getip59
												? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip59)
												: -1) == 1
														? ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock().getStateDefinition().getProperty("ebin") instanceof IntegerProperty _getip61
																? (world.getBlockState(BlockPos.containing(x, y, z - 1))).getValue(_getip61)
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
