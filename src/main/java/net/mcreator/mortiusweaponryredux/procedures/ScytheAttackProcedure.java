package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
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

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class ScytheAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double z, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, x, z, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:scythe")))) {
			if (!((entity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getItem() instanceof ShieldItem)) {
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))) == false) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem() && amount > 4) {
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								(float) (amount * 1.5));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, (float) 0.7,
										(float) 0.9);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, (float) 0.7, (float) 0.9, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.BLOOD_SWEEP.get()), sourceentity.getX() + sourceentity.getLookAngle().x * 1.1, (sourceentity.getY() + 1.1),
									sourceentity.getZ() + sourceentity.getLookAngle().z * 1.1, 1, 0, 0, 0, 0);
					}
					{
						final Vec3 _center = new Vec3(
								(sourceentity.level()
										.clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
										.getBlockPos().getX()),
								(sourceentity.level()
										.clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
										.getBlockPos().getY()),
								(sourceentity.level()
										.clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
										.getBlockPos().getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof LivingEntity && !(entityiterator == entity) && !(entityiterator == sourceentity) && !(entityiterator == (sourceentity.getVehicle()))
									&& !(entityiterator instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
								if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem() && amount > 4) {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))),
													sourceentity),
											(float) amount);
								} else {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))),
													sourceentity),
											(float) (amount / 1.5));
								}
							}
						}
					}
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DEATH_SCYTHE.get()) {
					if ((entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(MortiusWeaponryReduxModMobEffects.CHAINED.get())) == false) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.CHAINED.get(), 200, 0));
					}
				}
			}
		}
	}
}
