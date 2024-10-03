package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

import java.util.ArrayList;

public class ProcessSimpleEnegyNetworkIncorporatedEquipmentRemoveNProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).temporary_uuid).equals(entityiterator.getStringUUID())) {
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EB = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB - entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).temporary_ebstorage;
					_vars.syncPlayerVariables(entityiterator);
				}
				{
					InfiniteUnknownsNewModVariables.PlayerVariables _vars = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
					_vars.EBNeed = entityiterator.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed - entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).temporary_ebneed;
					_vars.syncPlayerVariables(entityiterator);
				}
			}
		}
	}
}
