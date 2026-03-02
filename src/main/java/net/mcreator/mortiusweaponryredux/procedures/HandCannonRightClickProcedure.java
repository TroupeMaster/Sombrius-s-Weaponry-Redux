package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.item.HandCannonItem;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class HandCannonRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("loaded") == true) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
			itemstack.getOrCreateTag().putBoolean("loaded", false);
			if (itemstack.getItem() instanceof HandCannonItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.canon_shoot");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:hand_cannon_fire")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:hand_cannon_fire")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			MortiusWeaponryReduxMod.queueServerWork(28, () -> {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && itemstack.getOrCreateTag().getBoolean("cancel") == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:hand_cannon_shoot")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:hand_cannon_shoot")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				} else {
					if (itemstack.getItem() instanceof HandCannonItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "empty");
					itemstack.getOrCreateTag().putBoolean("cancel", true);
				}
			});
			MortiusWeaponryReduxMod.queueServerWork(30, () -> {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && itemstack.getOrCreateTag().getBoolean("cancel") == false) {
					itemstack.getOrCreateTag().putBoolean("recoil", true);
					if (itemstack.getOrCreateTag().getDouble("musketBall") == 0) {
						HandCannonShootCannonballProcedure.execute(entity, 5.15 + itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.MARKSMAN.get()) / 1.7, 5, 0, 4);
					} else {
						for (int index0 = 0; index0 < 12; index0++) {
							FlintlockPistolShootBallProcedure.execute(entity, itemstack, 2.5 + itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.MARKSMAN.get()) / 1.7, 20, 0, 3);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SMOKE, entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.5 * 0.5, entity.getZ() + entity.getLookAngle().z * 0.5,
								Mth.nextInt(RandomSource.create(), 12, 16), (Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1), (Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LAVA, entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.5 * 0.5, entity.getZ() + entity.getLookAngle().z * 0.5,
								Mth.nextInt(RandomSource.create(), 6, 9), (Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1), (Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.2);
				} else {
					if (itemstack.getItem() instanceof HandCannonItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "empty");
					itemstack.getOrCreateTag().putBoolean("cancel", false);
				}
			});
		}
	}
}
