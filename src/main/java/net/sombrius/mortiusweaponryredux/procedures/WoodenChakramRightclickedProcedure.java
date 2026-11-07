package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.sombrius.mortiusweaponryredux.entity.*;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

public class WoodenChakramRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.WOODEN_CHAKRAM.get(), 7);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.STONE_CHAKRAM.get(), 7);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.IRON_CHAKRAM.get(), 7);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.GOLDEN_CHAKRAM.get(), 4);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.DIAMOND_CHAKRAM.get(), 7);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.NETHERITE_CHAKRAM.get(), 7);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, (float) 1.6);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, (float) 1.6, false);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.WOODEN_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new WoodenChakramProjEntity(MortiusWeaponryReduxModEntities.WOODEN_CHAKRAM_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity,
							(float) 1.5, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.STONE_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new StoneChakramProjEntity(MortiusWeaponryReduxModEntities.STONE_CHAKRAM_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, 2, true,
							false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 2);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.GOLDEN_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(new GoldenChakramProjEntity(MortiusWeaponryReduxModEntities.GOLDEN_CHAKRAM_PROJ.get(), projectileLevel), entity, (float) 1.5, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.1, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.IRON_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new IronChakramProjEntity(MortiusWeaponryReduxModEntities.IRON_CHAKRAM_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, 2, true, false,
							false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.DIAMOND_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new DiamondChakramProjEntity(MortiusWeaponryReduxModEntities.DIAMOND_CHAKRAM_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, 3, true,
							false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.NETHERITE_CHAKRAM.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new NetheriteChakramProjEntity(MortiusWeaponryReduxModEntities.NETHERITE_CHAKRAM_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity,
							(float) 3.5, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
			itemstack.shrink(1);
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

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}