package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

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
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.EnderFireballEntity;

import java.util.concurrent.atomic.AtomicReference;

public class EnderBowStopProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean hasCharge = false;
		hasCharge = false;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == Items.FIRE_CHARGE) {
						hasCharge = true;
					}
				}
			}
		}
		if (itemstack.getOrCreateTag().getBoolean("enderBowLoading") == true && itemstack.getOrCreateTag().getDouble("enderBowPull") > 3 && (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) ? true : hasCharge == true)) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) && !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, itemstack) != 0)) {
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
			for (int index0 = 0; index0 < (int) (itemstack.getOrCreateTag().getDouble("enderBowPull") >= 22 ? 3 : 1); index0++) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, itemstack) != 0 ? new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new EnderFireballEntity(MortiusWeaponryReduxModEntities.ENDER_FIREBALL.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setSecondsOnFire(100);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity,
								(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0
										? itemstack.getOrCreateTag().getDouble("enderBowPull") / 2 + Math.round((itemstack.getOrCreateTag().getDouble("enderBowPull") / 2) * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS))
										: itemstack.getOrCreateTag().getDouble("enderBowPull") / 2),
								(int) (0.1 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2)) : new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new EnderFireballEntity(MortiusWeaponryReduxModEntities.ENDER_FIREBALL.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity,
										(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0
												? itemstack.getOrCreateTag().getDouble("enderBowPull") / 2 + Math.round((itemstack.getOrCreateTag().getDouble("enderBowPull") / 2) * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS))
												: itemstack.getOrCreateTag().getDouble("enderBowPull") / 2),
										(int) (0.1 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2)));
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
}
