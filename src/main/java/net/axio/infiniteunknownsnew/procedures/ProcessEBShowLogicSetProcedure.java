package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.axio.infiniteunknownsnew.network.InfiniteUnknownsNewModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class ProcessEBShowLogicSetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			InfiniteUnknownsNewModVariables.PlayerVariables _vars = entity.getData(InfiniteUnknownsNewModVariables.PLAYER_VARIABLES);
			_vars.EBShow = BoolArgumentType.getBool(arguments, "set");
			_vars.syncPlayerVariables(entity);
		}
	}
}
