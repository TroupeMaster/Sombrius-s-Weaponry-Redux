package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

public class DragonbornToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DRAGONBORN.get())
					&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
					&& !(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MortiusWeaponryReduxModMobEffects.TITANBORN.get()))) {
				if (!(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get(), 30, 1, false, false));
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DRAGONBORN.get())
					&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
					&& !(entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(MortiusWeaponryReduxModMobEffects.TITANBORN.get()))) {
				if (!(entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get(), 30, 1, false, false));
				}
			}
		}
	}
}
