
package net.axio.infiniteunknownsnew.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.axio.infiniteunknownsnew.procedures.ProcessExhancedCrystalMatrixProcedure;

public class EnhancedCrystalMatrixItem extends Item {
	public EnhancedCrystalMatrixItem() {
		super(new Item.Properties().durability(400).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ProcessExhancedCrystalMatrixProcedure.execute(world, entity, itemstack);
	}
}
