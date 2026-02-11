package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

public class SpikedMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.BLEED_OUT.get(), 200, 0));
	}
}
