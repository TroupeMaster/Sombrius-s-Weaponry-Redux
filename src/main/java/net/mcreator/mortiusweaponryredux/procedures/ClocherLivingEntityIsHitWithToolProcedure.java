package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

import java.util.List;
import java.util.Comparator;

public class ClocherLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 0f) * 100 : 0) <= 0) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("hit") == 2) {
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(),
							(int) (30 / ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1)));
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("hit", 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, (float) 0.6);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, (float) 0.6, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.resonate")), SoundSource.PLAYERS, 1, (float) 0.8);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.resonate")), SoundSource.PLAYERS, 1, (float) 0.8, false);
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(18 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity && !(entityiterator == entity) && !(entityiterator == sourceentity)) {
							entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) * 0.3), ((entity.getY() - entityiterator.getY()) * 0.3), ((entity.getZ() - entityiterator.getZ()) * 0.3)));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BELL_CLOSE.get()), (entityiterator.getX()), (entityiterator.getY() + 1.6), (entityiterator.getZ()), 1, 0, 0, 0, 0);
						}
					}
				}
				MortiusWeaponryReduxMod.queueServerWork(12, () -> {
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof LivingEntity && !(entityiterator == sourceentity)) {
								entityiterator
										.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))),
												sourceentity), (float) (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue() * 1.6));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")),
												SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BELL_RING.get()), (entityiterator.getX()), (entityiterator.getY() + 1.6), (entityiterator.getZ()), 1, 0, 0, 0, 0);
							}
						}
					}
				});
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("hit") == 1) {
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(),
							(int) (16 / ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("hit",
						((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("hit") + 1));
			} else {
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(),
							(int) (16 / ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, (float) 1.2);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.PLAYERS, 1, (float) 1.2, false);
					}
				}
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("hit",
						((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("hit") + 1));
			}
		}
	}
}
