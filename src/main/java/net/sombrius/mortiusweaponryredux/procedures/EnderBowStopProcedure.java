package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.sombrius.mortiusweaponryredux.entity.EnderFireballEntity;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import java.util.List;

public class EnderBowStopProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean hasCharge = false;
		if (hasEntityInInventory(entity, new ItemStack(Items.FIRE_CHARGE))) {
			hasCharge = true;
		}
		if (itemstack.getOrCreateTag().getBoolean("enderBowLoading") == true && itemstack.getOrCreateTag().getDouble("enderBowPull") > 3 && (getEntityGameType(entity) == GameType.CREATIVE ? true : hasCharge == true)) {
			if (!(getEntityGameType(entity) == GameType.CREATIVE) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemstack) != 0)) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.FIRE_CHARGE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1.125, 1.333));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1.125, 1.333), false);
				}
			}
			for (int _i1 = 0; _i1 < (int) (itemstack.getOrCreateTag().getDouble("enderBowPull") >= 22 ? 3 : 1); _i1++) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, itemstack) != 0
								? initArrowProjectile(
										createArrowWeaponItemStack(new EnderFireballEntity(MortiusWeaponryReduxModEntities.ENDER_FIREBALL.get(), 0, 0, 0, projectileLevel), (int) (0.1 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2),
												(byte) 0),
										entity,
										(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0
												? itemstack.getOrCreateTag().getDouble("enderBowPull") / 2 + Math.round((itemstack.getOrCreateTag().getDouble("enderBowPull") / 2) * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS))
												: itemstack.getOrCreateTag().getDouble("enderBowPull") / 2),
										true, true, false, AbstractArrow.Pickup.DISALLOWED)
								: initArrowProjectile(
										createArrowWeaponItemStack(new EnderFireballEntity(MortiusWeaponryReduxModEntities.ENDER_FIREBALL.get(), 0, 0, 0, projectileLevel), (int) (0.1 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2),
												(byte) 0),
										entity,
										(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0
												? itemstack.getOrCreateTag().getDouble("enderBowPull") / 2 + Math.round((itemstack.getOrCreateTag().getDouble("enderBowPull") / 2) * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS))
												: itemstack.getOrCreateTag().getDouble("enderBowPull") / 2),
										true, false, false, AbstractArrow.Pickup.DISALLOWED));
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (itemstack.getOrCreateTag().getDouble("enderBowPull") / 22),
								(float) (18 - itemstack.getOrCreateTag().getDouble("enderBowPull") / 2));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
		}
		itemstack.getOrCreateTag().putBoolean("enderBowLoading", false);
		itemstack.getOrCreateTag().putDouble("enderBowPull", 0);
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (!itemstack2.isEmpty() && ItemStack.isSameItem(itemstack2, itemstack)) {
						return true;
					}
				}
			}
		}
		return false;
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