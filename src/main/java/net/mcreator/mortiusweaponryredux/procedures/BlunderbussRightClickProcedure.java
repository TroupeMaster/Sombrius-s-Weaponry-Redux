package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.item.BlunderbussItem;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class BlunderbussRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack itemData = ItemStack.EMPTY;
		if (itemstack.getOrCreateTag().getBoolean("loaded") == true) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 70);
			itemstack.getOrCreateTag().putBoolean("loaded", false);
			if (itemstack.getItem() instanceof BlunderbussItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.blunderbuss_shoot");
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
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:blunderbuss_shoot_new")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:blunderbuss_shoot_new")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
					}
				}
				for (int index0 = 0; index0 < (int) (itemstack.getOrCreateTag().getDouble("musketBall") == 10 ? 3 : 8); index0++) {
					FlintlockPistolShootBallProcedure.execute(entity, itemstack, 2.4 + itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.MARKSMAN.get()) / 1.7, 14, 0, 1.4);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.5 * 0.5, entity.getZ() + entity.getLookAngle().z * 0.5,
							Mth.nextInt(RandomSource.create(), 10, 16), (Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1), (Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.2);
			});
			MortiusWeaponryReduxMod.queueServerWork(33, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_ramrod")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_ramrod")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02), false);
					}
				}
			});
			MortiusWeaponryReduxMod.queueServerWork(43, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_ramrod")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_ramrod")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02), false);
					}
				}
			});
			MortiusWeaponryReduxMod.queueServerWork(65, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_hammer")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_hammer")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.98, 1.02), false);
					}
				}
			});
		}
	}
}
