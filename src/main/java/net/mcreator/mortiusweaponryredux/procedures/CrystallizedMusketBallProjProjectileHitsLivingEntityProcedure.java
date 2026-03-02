package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.CrystalPieceProjEntity;

public class CrystallizedMusketBallProjProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.AMETHYST_BLOCK.defaultBlockState()));
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, 0, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(0, 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, 0, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(0, 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot(1, 0.1, 1, (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
					AbstractArrow entityToSpawn = new CrystalPieceProjEntity(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, sourceentity, 1, 0);
			_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			_entityToSpawn.shoot((-1), 0.1, (-1), (float) 1.2, 5);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
