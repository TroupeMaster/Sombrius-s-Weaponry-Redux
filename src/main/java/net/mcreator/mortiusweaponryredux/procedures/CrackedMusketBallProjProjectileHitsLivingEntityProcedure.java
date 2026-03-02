package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.MusketBallPieceProjEntity;

public class CrackedMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity, Entity sourceentity) {
		if (immediatesourceentity == null || sourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
		for (int index0 = 0; index0 < 6; index0++) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new MusketBallPieceProjEntity(MortiusWeaponryReduxModEntities.MUSKET_BALL_PIECE_PROJ.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, sourceentity, 1, 0);
				_entityToSpawn.setPos(x, (y + 0.5), z);
				_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -1, 1)), (Mth.nextDouble(RandomSource.create(), 0, 0.3)), (Mth.nextDouble(RandomSource.create(), -1, 1)), 1, 100);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
