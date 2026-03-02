package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BucklerDealHalfDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, immediatesourceentity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.BUCKLER.get()) {
			if (sourceentity instanceof LivingEntity) {
				if (immediatesourceentity == sourceentity) {
					if (!damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:aggressive_attack")))) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:aggressive_attack"))),
								sourceentity), (float) (amount / 2));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1,
										(float) Mth.nextDouble(RandomSource.create(), 1.25, 1.45));
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1,
										(float) Mth.nextDouble(RandomSource.create(), 1.25, 1.45), false);
							}
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DIAMOND_BUCKLER.get()) {
			if (sourceentity instanceof LivingEntity) {
				if (immediatesourceentity == sourceentity) {
					if (!damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:aggressive_attack")))) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:aggressive_attack"))),
								sourceentity), (float) Math.floor(amount / 2.6));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1,
										(float) Mth.nextDouble(RandomSource.create(), 1.25, 1.45));
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1,
										(float) Mth.nextDouble(RandomSource.create(), 1.25, 1.45), false);
							}
						}
					}
				}
			}
		}
	}
}
