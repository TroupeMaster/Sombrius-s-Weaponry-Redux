package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.SpikedMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.SlugEntity;
import net.mcreator.mortiusweaponryredux.entity.PhantomBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.MusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.HellfireMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.HeavyMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.FieryMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.ExplosiveMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.EnderBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CrystallizedMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CrackedMusketBallProjEntity;

public class FlintlockPistolShootBallProcedure {
	public static void execute(Entity entity, ItemStack itemstack, double damage, double inaccuracy, double piercing, double speed) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("musketBall") == 0) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new MusketBallProjEntity(MortiusWeaponryReduxModEntities.MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 1) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CrackedMusketBallProjEntity(MortiusWeaponryReduxModEntities.CRACKED_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 2) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new CrystallizedMusketBallProjEntity(MortiusWeaponryReduxModEntities.CRYSTALLIZED_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (damage + 0.25), 0, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 3) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new FieryMusketBallProjEntity(MortiusWeaponryReduxModEntities.FIERY_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 4) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new HellfireMusketBallProjEntity(MortiusWeaponryReduxModEntities.HELLFIRE_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 5) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new SpikedMusketBallProjEntity(MortiusWeaponryReduxModEntities.SPIKED_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (damage + 1), 0, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 6) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new EnderBallProjEntity(MortiusWeaponryReduxModEntities.ENDER_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (damage > 1 ? damage - 1 : 1), 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (speed + 1), (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 7) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new ExplosiveMusketBallProjEntity(MortiusWeaponryReduxModEntities.EXPLOSIVE_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 8) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new HeavyMusketBallProjEntity(MortiusWeaponryReduxModEntities.HEAVY_MUSKET_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (damage + 3), 1, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (speed - 0.6), (float) inaccuracy);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 9) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new PhantomBallProjEntity(MortiusWeaponryReduxModEntities.PHANTOM_BALL_PROJ.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 0, (byte) (piercing + 1));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) speed, (float) (inaccuracy >= 3 ? inaccuracy - 3 : 0));
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 10) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new SlugEntity(MortiusWeaponryReduxModEntities.SLUG.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (damage + 1), 1, (byte) piercing);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (speed + 1), (float) (inaccuracy >= 9 ? inaccuracy - 9 : 0));
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
