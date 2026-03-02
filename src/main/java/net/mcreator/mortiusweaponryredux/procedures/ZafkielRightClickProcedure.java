package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.item.ZafkielItem;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.TimeBulletEntity;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class ZafkielRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("timeLeft") <= 11) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			if (itemstack.getItem() instanceof ZafkielItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.zafkiel_shoot");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_trigger")), SoundSource.PLAYERS, 1,
							(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02));
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_trigger")), SoundSource.PLAYERS, 1,
							(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02), false);
				}
			}
			MortiusWeaponryReduxMod.queueServerWork(1, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 1.05, 1.1));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 1.05, 1.1), false);
					}
				}
			});
			MortiusWeaponryReduxMod.queueServerWork(2, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:zafkiel_shoot")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:zafkiel_shoot")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new TimeBulletEntity(MortiusWeaponryReduxModEntities.TIME_BULLET.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, (float) 5.15, 0, (byte) 4);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 4.2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				ZafkielShowTimeLeftProcedure.execute(world, x, y, z, entity);
				entity.getPersistentData().putDouble("timeLeft", (entity.getPersistentData().getDouble("timeLeft") + 1));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.5 * 0.5, entity.getZ() + entity.getLookAngle().z * 0.5,
							Mth.nextInt(RandomSource.create(), 8, 12), (Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1), (Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_DUST.get()), entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.5 * 0.5,
							entity.getZ() + entity.getLookAngle().z * 0.5, Mth.nextInt(RandomSource.create(), 8, 12), (Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1),
							(Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.1);
			});
		} else {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:out_of_time")))), 45);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:heartbeat")), SoundSource.PLAYERS, 1,
							(float) Mth.nextDouble(RandomSource.create(), 0.9, 1));
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:heartbeat")), SoundSource.PLAYERS, 1,
							(float) Mth.nextDouble(RandomSource.create(), 0.9, 1), false);
				}
			}
		}
	}
}
