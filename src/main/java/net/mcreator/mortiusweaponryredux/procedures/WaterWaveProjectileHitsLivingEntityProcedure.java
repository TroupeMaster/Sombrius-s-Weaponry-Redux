package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.WaterWaveEntity;

public class WaterWaveProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * (-1)), 0.6, (Math.cos(Math.toRadians(entity.getYRot())) * (-1))));
		if (!(!world.getEntitiesOfClass(WaterWaveEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty())) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new WaterWaveEntity(MortiusWeaponryReduxModEntities.WATER_WAVE.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, sourceentity, 4, 1);
				_entityToSpawn.setPos((x + Mth.nextDouble(RandomSource.create(), -1, 1)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -1, 1)));
				_entityToSpawn.shoot((Math.sin(Math.toRadians(entity.getYRot() + 180)) * (-1)), 0.2, (Math.cos(Math.toRadians(entity.getYRot())) * (-1)), 1, 1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
