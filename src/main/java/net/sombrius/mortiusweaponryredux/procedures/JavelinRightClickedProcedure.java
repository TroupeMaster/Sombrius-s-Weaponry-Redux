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

public class JavelinRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.WOODEN_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.STONE_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.COPPER_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.IRON_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.GOLDEN_JAVELIN.get(), 15);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.DIAMOND_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.NETHERITE_JAVELIN.get(), 30);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, (float) 1.15);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1, (float) 1.15, false);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.WOODEN_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new WoodenJavelinProjEntity(MortiusWeaponryReduxModEntities.WOODEN_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity,
							(float) 1.5, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 2);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.STONE_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new StoneJavelinProjEntity(MortiusWeaponryReduxModEntities.STONE_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, 2, true,
							false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.COPPER_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new CopperJavelinProjEntity(MortiusWeaponryReduxModEntities.COPPER_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, 3, true,
							false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.GOLDEN_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(new GoldenJavelinProjEntity(MortiusWeaponryReduxModEntities.GOLDEN_JAVELIN_PROJ.get(), projectileLevel), entity, 2, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.6, 3);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.IRON_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new IronJavelinProjEntity(MortiusWeaponryReduxModEntities.IRON_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity, (float) 4.85,
							true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.DIAMOND_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new DiamondJavelinProjEntity(MortiusWeaponryReduxModEntities.DIAMOND_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity,
							(float) 6.25, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.NETHERITE_JAVELIN.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initArrowProjectile(createArrowWeaponItemStack(new NetheriteJavelinProjEntity(MortiusWeaponryReduxModEntities.NETHERITE_JAVELIN_PROJ.get(), 0, 0, 0, projectileLevel), (int) 0.1, (byte) 0), entity,
							(float) 7.9, true, false, false, AbstractArrow.Pickup.ALLOWED);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 2.5, 0);
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