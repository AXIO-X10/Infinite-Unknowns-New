package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

public class ProcessDebugProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.EB = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.EBNeed = 0;
			_vars.syncPlayerVariables(entity);
		}
	}
}
