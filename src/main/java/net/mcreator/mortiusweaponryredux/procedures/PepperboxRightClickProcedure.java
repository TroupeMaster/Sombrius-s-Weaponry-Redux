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

import net.mcreator.mortiusweaponryredux.item.PepperboxItem;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class PepperboxRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("loaded") == true) {
			if (itemstack.getOrCreateTag().getDouble("shot") == 0) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 4);
				if (itemstack.getItem() instanceof PepperboxItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.pepperbox_shoot1");
				itemstack.getOrCreateTag().putDouble("shot", (itemstack.getOrCreateTag().getDouble("shot") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("shot") == 1) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 4);
				if (itemstack.getItem() instanceof PepperboxItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.pepperbox_shoot2");
				itemstack.getOrCreateTag().putDouble("shot", (itemstack.getOrCreateTag().getDouble("shot") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("shot") == 2) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 4);
				if (itemstack.getItem() instanceof PepperboxItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.pepperbox_shoot3");
				itemstack.getOrCreateTag().putDouble("shot", (itemstack.getOrCreateTag().getDouble("shot") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("shot") >= 3) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 180);
				if (itemstack.getItem() instanceof PepperboxItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.pepperbox_shoot4");
				itemstack.getOrCreateTag().putDouble("shot", 0);
				itemstack.getOrCreateTag().putBoolean("loaded", false);
			}
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
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_pistol_shoot")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 1.1, 1.15));
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mortius_weaponry_redux:flintlock_pistol_shoot")), SoundSource.PLAYERS, 1,
								(float) Mth.nextDouble(RandomSource.create(), 1.1, 1.15), false);
					}
				}
				FlintlockPistolShootBallProcedure.execute(entity, itemstack, 1.6 + itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.MARKSMAN.get()) / 1.7, 0, 1, 2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, entity.getX() + entity.getLookAngle().x * 0.5, entity.getY() + entity.getLookAngle().y + 1.6 * 0.5, entity.getZ() + entity.getLookAngle().z * 0.5, Mth.nextInt(RandomSource.create(), 6, 10),
							(Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1), (Math.cos(Math.toRadians(entity.getYRot())) * 1), 0.1);
			});
		}
	}
}
