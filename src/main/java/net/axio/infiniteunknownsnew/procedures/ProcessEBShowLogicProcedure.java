package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

public class ProcessEBShowLogicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBShow;
	}
}
