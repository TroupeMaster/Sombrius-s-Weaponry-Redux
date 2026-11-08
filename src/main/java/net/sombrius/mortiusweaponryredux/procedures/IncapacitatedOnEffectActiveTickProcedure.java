package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class IncapacitatedOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, (-0.8), 0));
		if (entity.isSprinting()) {
			entity.setSprinting(true);
		}
		if (entity instanceof LivingEntity _livEnt3 && _livEnt3.isFallFlying()) {
			if (entity instanceof Player _plr && _plr.isFallFlying()) {
				_plr.stopFallFlying();
			}
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20,
						entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.INCAPACITATED.get()).getAmplifier() : 0, false, false));
		}
	}
}