package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class FieryMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
