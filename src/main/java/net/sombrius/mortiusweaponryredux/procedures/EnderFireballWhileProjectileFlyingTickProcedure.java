package net.sombrius.mortiusweaponryredux.procedures;

import org.joml.Vector3f;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.DustParticleOptions;

public class EnderFireballWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel)
			((ServerLevel) world).sendParticles((new DustParticleOptions(new Vector3f(220 / 255.0F, 117 / 255.0F, 250 / 255.0F), 1)), x, y, z, 1, 0, 0, 0, 0);
		if (immediatesourceentity.tickCount >= 60) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}