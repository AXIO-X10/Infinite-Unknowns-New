package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

public class ProcessEBShowProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "EB: " + entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed + " / " + entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB + " ( "
				+ (entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EB - entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES).EBNeed) + " )";
	}
}
