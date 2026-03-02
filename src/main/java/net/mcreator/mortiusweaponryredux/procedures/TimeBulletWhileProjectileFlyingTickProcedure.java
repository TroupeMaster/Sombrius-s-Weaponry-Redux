package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class TimeBulletWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME.get()), x, y, z, 1, 0, 0, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_DUST.get()), x, y, z, Mth.nextInt(RandomSource.create(), 0, 3), 0.1, 0.1, 0.1, 0.1);
		MortiusWeaponryReduxMod.queueServerWork(10, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
