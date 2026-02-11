package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

public class IncapacitatedOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, (-0.8), 0));
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0) - 1),
						false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0) - 1),
						false, false));
		}
	}
}
