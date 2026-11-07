package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.sombrius.mortiusweaponryredux.entity.WaterWaveEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class WaterWaveProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * (-1)), 0.6, (Math.cos(Math.toRadians(entity.getYRot())) * (-1))));
		if (!(!world.getEntitiesOfClass(WaterWaveEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty())) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new WaterWaveEntity(MortiusWeaponryReduxModEntities.WATER_WAVE.get(), 0, 0, 0, projectileLevel), 1, (byte) 0), sourceentity, 4, true, false, false,
						AbstractArrow.Pickup.DISALLOWED);
				_entityToSpawn.setPos((x + Mth.nextDouble(RandomSource.create(), -1, 1)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), -1, 1)));
				_entityToSpawn.shoot((Math.sin(Math.toRadians(entity.getYRot() + 180)) * (-1)), 0.2, (Math.cos(Math.toRadians(entity.getYRot())) * (-1)), 1, 1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.setSecondsOnFire(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static AbstractArrow createArrowWeaponItemStack(AbstractArrow entityToSpawn, int knockback, byte piercing) {
		if (knockback > 0)
			entityToSpawn.setKnockback(knockback);
		if (piercing > 0)
			entityToSpawn.setPierceLevel(piercing);
		return entityToSpawn;
	}
}