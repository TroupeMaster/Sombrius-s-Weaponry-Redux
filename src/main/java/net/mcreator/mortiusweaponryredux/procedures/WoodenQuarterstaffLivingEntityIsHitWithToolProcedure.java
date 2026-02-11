package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

public class WoodenQuarterstaffLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get(), 10, 0));
	}
}
