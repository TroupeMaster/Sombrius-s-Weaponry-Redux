package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class EstocPointProjWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity.getPersistentData().getBoolean("estocPointSetDamage") == false) {
			immediatesourceentity.getPersistentData().putBoolean("estocPointSetDamage", true);
			if (immediatesourceentity instanceof AbstractArrow _abstractArrow)
				_abstractArrow.setBaseDamage(((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0) * 0.58));
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.ESTOC_POINT.get()), x, y, z, 1, 0, 0, 0, 0);
		if (immediatesourceentity.tickCount >= 25) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}