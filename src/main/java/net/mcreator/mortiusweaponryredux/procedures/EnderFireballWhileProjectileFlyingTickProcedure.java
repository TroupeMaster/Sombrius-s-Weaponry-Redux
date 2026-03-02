package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class EnderFireballWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 1, 0, 0, 0, 0);
		immediatesourceentity.setNoGravity(true);
		MortiusWeaponryReduxMod.queueServerWork(60, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
