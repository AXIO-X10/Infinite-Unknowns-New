package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Marker;
import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

import java.util.Comparator;
import java.util.ArrayList;

public class ProcessSimpleEnegyNetworkIncorporatedEquipmentRemoveNProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (!world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).isEmpty()) {
				if ((((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("owner")).equals(entityiterator.getStringUUID())) {
					{
						InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
						_vars.EB = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB - ((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("backup_ebstorage");
						_vars.syncPlayerVariables(entityiterator);
					}
					{
						InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
						_vars.EBNeed = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed
								- ((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getDouble("backup_ebneed");
						_vars.syncPlayerVariables(entityiterator);
					}
					if (!((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(Marker.class, AABB.ofSize(new Vec3(x, y, z), 0.1, 0.1, 0.1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
	}
}
