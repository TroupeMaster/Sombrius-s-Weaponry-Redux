package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class FieryMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
		entity.setSecondsOnFire(5);
	}
}
