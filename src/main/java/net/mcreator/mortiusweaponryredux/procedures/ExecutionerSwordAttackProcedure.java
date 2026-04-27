package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.entity.HellfireFlameEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExecutionerSwordAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		execute(null, world, x, z, damagesource, entity, immediatesourceentity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() instanceof ShieldItem)) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.HEADSMAN.get()) {
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))) == false) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2
							&& (sourceentity instanceof Player _plr ? _plr.getAttackStrengthScale(0) : 0) >= 0.848) {
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								(float) (amount * (2.5 + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.EXECUTION.get()) / 12)));
						if ((sourceentity instanceof Player _plr ? _plr.getAttackStrengthScale(0) : 0) >= 0.848 && !sourceentity.isSprinting()) {
							if (sourceentity.onGround()) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BLOOD_SWEEP.get()), sourceentity.getX() + sourceentity.getLookAngle().x * 1, (sourceentity.getY() + 1),
											sourceentity.getZ() + sourceentity.getLookAngle().z * 1, 1, 0, 0, 0, 0);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
												SoundSource.PLAYERS, (float) 0.7, (float) 0.9);
									} else {
										_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS,
												(float) 0.7, (float) 0.9, false);
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BLOODY_CRIT.get()), sourceentity.getX() + sourceentity.getLookAngle().x * 1, (sourceentity.getY() + 0.5),
											sourceentity.getZ() + sourceentity.getLookAngle().z * 1, 1, 0, 0, 0, 0);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")),
												SoundSource.PLAYERS, (float) 0.7, (float) 0.9);
									} else {
										_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS,
												(float) 0.7, (float) 0.9, false);
									}
								}
							}
						}
					}
				}
			} else {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:executionersword")))) {
					if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))) == false) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2
								&& (sourceentity instanceof Player _plr ? _plr.getAttackStrengthScale(0) : 0) >= 0.848) {
							entity.hurt(
									new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))),
											sourceentity),
									(float) (amount * (1.8 + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.EXECUTION.get()) / 12)));
							if ((sourceentity instanceof Player _plr ? _plr.getAttackStrengthScale(0) : 0) >= 0.848 && !sourceentity.isSprinting()) {
								if (sourceentity.onGround()) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BLOOD_SWEEP.get()), sourceentity.getX() + sourceentity.getLookAngle().x * 1, (sourceentity.getY() + 1),
												sourceentity.getZ() + sourceentity.getLookAngle().z * 1, 1, 0, 0, 0, 0);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
													SoundSource.PLAYERS, (float) 0.7, (float) 0.9);
										} else {
											_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS,
													(float) 0.7, (float) 0.9, false);
										}
									}
								} else {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BLOODY_CRIT.get()), sourceentity.getX() + sourceentity.getLookAngle().x * 1, (sourceentity.getY() + 0.5),
												sourceentity.getZ() + sourceentity.getLookAngle().z * 1, 1, 0, 0, 0, 0);
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")),
													SoundSource.PLAYERS, (float) 0.7, (float) 0.9);
										} else {
											_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS,
													(float) 0.7, (float) 0.9, false);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.HEADSMAN.get()) {
			if (immediatesourceentity instanceof HellfireFlameEntity) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof LivingEntity _livEnt63 && _livEnt63.hasEffect(MortiusWeaponryReduxModMobEffects.HELLFIRE.get())) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MortiusWeaponryReduxModMobEffects.HELLFIRE.get());
				}
			}
		}
	}
}
