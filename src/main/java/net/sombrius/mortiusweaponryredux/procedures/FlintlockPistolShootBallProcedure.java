package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.sombrius.mortiusweaponryredux.entity.*;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

public class FlintlockPistolShootBallProcedure {
	public static void execute(Entity entity, ItemStack itemstack, double damage, double inaccuracy, double piercing, double speed) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("musketBall") == 0) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new MusketBallProjEntity(MortiusWeaponryReduxModEntities.MUSKET_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 0, (byte) piercing), entity, (float) damage,
							true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(new CrackedMusketBallProjEntity(MortiusWeaponryReduxModEntities.CRACKED_MUSKET_BALL_PROJ.get(), projectileLevel), entity, (float) damage, true, false, false,
							AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new CrystallizedMusketBallProjEntity(MortiusWeaponryReduxModEntities.CRYSTALLIZED_MUSKET_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 0, (byte) piercing),
							entity, (float) (damage + 0.25), true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new FieryMusketBallProjEntity(MortiusWeaponryReduxModEntities.FIERY_MUSKET_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 0, (byte) piercing), entity,
							(float) damage, true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(new HellfireMusketBallProjEntity(MortiusWeaponryReduxModEntities.HELLFIRE_MUSKET_BALL_PROJ.get(), projectileLevel), entity, (float) damage, true, false, false,
							AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new SpikedMusketBallProjEntity(MortiusWeaponryReduxModEntities.SPIKED_MUSKET_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 0, (byte) piercing), entity,
							(float) (damage + 1), true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(new EnderBallProjEntity(MortiusWeaponryReduxModEntities.ENDER_BALL_PROJ.get(), projectileLevel), entity, (float) (damage > 1 ? damage - 1 : 1), true, false, false,
							AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(new ExplosiveMusketBallProjEntity(MortiusWeaponryReduxModEntities.EXPLOSIVE_MUSKET_BALL_PROJ.get(), projectileLevel), entity, (float) damage, true, false, false,
							AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new HeavyMusketBallProjEntity(MortiusWeaponryReduxModEntities.HEAVY_MUSKET_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 1, (byte) piercing), entity,
							(float) (damage + 3), true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new PhantomBallProjEntity(MortiusWeaponryReduxModEntities.PHANTOM_BALL_PROJ.get(), 0, 0, 0, projectileLevel), 0, (byte) (piercing + 1)), entity,
							(float) damage, true, false, false, AbstractArrow.Pickup.DISALLOWED);
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
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new SlugEntity(MortiusWeaponryReduxModEntities.SLUG.get(), 0, 0, 0, projectileLevel), 1, (byte) piercing), entity, (float) (damage + 1), true, false,
							false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (speed + 1), (float) (inaccuracy >= 9 ? inaccuracy - 9 : 0));
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
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