
package net.axio.infiniteunknownsnew.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.axio.infiniteunknownsnew.procedures.ProcessGravitationalEnergizingGlovesProcedure;
import net.axio.infiniteunknownsnew.procedures.ProcessGravitationalEnergizingGlovesAutoProcedure;

public class GravitationalEnergizingGlovesItem extends Item {
	public GravitationalEnergizingGlovesItem() {
		super(new Item.Properties().durability(512).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ProcessGravitationalEnergizingGlovesProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ProcessGravitationalEnergizingGlovesProcedure.execute(context.getLevel(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ProcessGravitationalEnergizingGlovesAutoProcedure.execute(world, entity, itemstack);
	}
}
