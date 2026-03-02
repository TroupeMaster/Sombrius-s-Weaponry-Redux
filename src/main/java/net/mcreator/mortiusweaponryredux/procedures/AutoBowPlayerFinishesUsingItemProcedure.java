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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEntities;
import net.mcreator.mortiusweaponryredux.entity.AutoArrowEntity;

import java.util.concurrent.atomic.AtomicReference;
import java.util.UUID;

public class AutoBowPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean hasArrow = false;
		hasArrow = false;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (itemstackiterator.getItem() == Items.ARROW) {
						hasArrow = true;
					}
				}
			}
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) ? true : hasArrow == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1.125, 1.333));
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 1.125, 1.333), false);
				}
			}
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
					ItemStack _stktoremove = new ItemStack(Items.ARROW);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			itemstack.getOrCreateTag().putDouble("autoBowPull", 0);
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, itemstack) != 0 ? new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new AutoArrowEntity(MortiusWeaponryReduxModEntities.AUTO_ARROW.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setSecondsOnFire(100);
							entityToSpawn.setCritArrow(true);
							entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0 ? 2.5 + Math.round(2.5 * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS)) : 2.5),
							(int) (0 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2)) : new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new AutoArrowEntity(MortiusWeaponryReduxModEntities.AUTO_ARROW.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setCritArrow(true);
									entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity,
									(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) != 0 ? 2.5 + Math.round(2.5 * 0.25 * itemstack.getEnchantmentLevel(Enchantments.POWER_ARROWS)) : 2.5),
									(int) (0 + itemstack.getEnchantmentLevel(Enchantments.PUNCH_ARROWS) / 2)));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, (float) 0.5);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0")) != null) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0"));
		}
	}
}
