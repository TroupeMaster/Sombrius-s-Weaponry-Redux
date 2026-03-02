package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.network.MortiusWeaponryReduxModVariables;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import java.util.List;
import java.util.Comparator;

public class AssaultShieldRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dashCooldown <= 0) {
			{
				double _setval = 35;
				entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dashCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 15, 3, false, false));
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 2), 0.2, (Math.cos(Math.toRadians(entity.getYRot())) * 2)));
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2.5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2.5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity && !(entityiterator == entity)) {
						entityiterator.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 2.5), 0.2, (Math.cos(Math.toRadians(entity.getYRot())) * 2.5)));
						entityiterator.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), entity),
								(float) (4 + itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.BASHING.get())));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 35, 3));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.PLAYERS, 1,
										(float) 0.8);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.PLAYERS, 1, (float) 0.8,
										false);
							}
						}
						if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.BASHING.get(), itemstack) != 0) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), Mth.nextInt(RandomSource.create(), 2, 5), 1, 1, 1, 0.1);
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1, (float) 0.8);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1, (float) 0.8, false);
				}
			}
		}
	}
}
