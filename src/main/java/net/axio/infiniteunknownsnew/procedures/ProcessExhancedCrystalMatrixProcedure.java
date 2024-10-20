package net.axio.infiniteunknownsnew.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class ProcessExhancedCrystalMatrixProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			if (itemstack.getMaxDamage() - itemstack.getDamageValue() >= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)), _level, null, _stkprov -> {
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			} else {
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak((int) (itemstack.getMaxDamage() - itemstack.getDamageValue()), _level, null, _stkprov -> {
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + itemstack.getMaxDamage() - itemstack.getDamageValue()));
			}
		}
	}
}
