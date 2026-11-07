package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.sombrius.mortiusweaponryredux.entity.CrystalPieceProjEntity;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class CrystallizedMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.AMETHYST_BLOCK.defaultBlockState()));
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, 0, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(0, 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, 0, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(0, 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), projectileLevel), sourceentity, 1, true, false, false, AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
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
}