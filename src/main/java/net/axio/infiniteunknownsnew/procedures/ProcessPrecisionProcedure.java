package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class ProcessPrecisionProcedure {
	public static String execute(ItemStack itemstack) {
		return itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("precision") > 0
				? Component.translatable("process.precision").getString() + "" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("precision") + "%"
				: Component.translatable("process.precision").getString() + "" + Component.translatable("process.precision.not_determined").getString();
	}
}
