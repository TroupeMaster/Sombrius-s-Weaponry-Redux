package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
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

import java.util.Comparator;

public class SeraphToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.VULNERABILITY.get(), 20, 0, true, true));
		if (itemstack.getOrCreateTag().getBoolean("seraphRage") == true) {
			entity.setDeltaMovement(new Vec3(0, (-8), 0));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.INVULNERABILITY.get(), 20, 0, true, true));
			if (entity.onGround()) {
				itemstack.getOrCreateTag().putBoolean("seraphRage", false);
				for (int _i1 = 0; _i1 < 48; _i1++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LAVA, (entity.getX() + Mth.nextDouble(RandomSource.create(), -4, 4)), (entity.getY() + 0.1), (entity.getZ() + Mth.nextDouble(RandomSource.create(), -4, 4)), 1, 0.1, 4, 0.1, 0.6);
				}
				loop = 0;
				particleAmount = 32;
				xRadius = 4;
				zRadius = 4;
				while (loop < particleAmount) {
					world.addParticle(ParticleTypes.CRIT, (entity.getX() + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (entity.getY() + 0.5), (entity.getZ() + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius),
							0.01, 0.05, 0.01);
					loop = loop + 1;
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, 1, (float) 0.8, false);
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof LivingEntity && !(entityiterator == entity)) {
							entityiterator.hurt(
									new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:direct_attack"))), entity),
									32);
						}
					}
				}
			}
		}
	}
}