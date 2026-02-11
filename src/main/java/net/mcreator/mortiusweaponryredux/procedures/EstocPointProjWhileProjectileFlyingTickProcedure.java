package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class EstocPointProjWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.ESTOC_POINT.get()), x, y, z, 1, 0, 0, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.REVERSE_PORTAL, (x + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), (y + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), (z + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), 2, 1, 1, 1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), (y + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), (z + Mth.nextDouble(RandomSource.create(), -0.4, 0.4)), 2, 1, 1, 1, 0.1);
		immediatesourceentity.setNoGravity(true);
		MortiusWeaponryReduxMod.queueServerWork(25, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
