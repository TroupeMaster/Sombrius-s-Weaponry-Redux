package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.Comparator;

public class EnderLanceToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 1, false, false));
			if ((entity.getVehicle()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false));
			if ((entity.getVehicle()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 0, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, ((entity.getVehicle()).getX()), ((entity.getVehicle()).getY() + (entity.getVehicle()).getEyeHeight() / 1.5), ((entity.getVehicle()).getZ()), Mth.nextInt(RandomSource.create(), 1, 3), 0.1, 0,
						0.1, 0.08);
			{
				final Vec3 _center = new Vec3(((entity.getVehicle()).getX()), ((entity.getVehicle()).getY()), ((entity.getVehicle()).getZ()));
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof LivingEntity && !(entityiterator == entity) && !(entityiterator == (entity.getVehicle()))
							&& !(entityiterator instanceof TamableAnimal _tamIsTamedBy30 && entity instanceof LivingEntity _livEnt30 && _tamIsTamedBy30.isOwnedBy(_livEnt30))
							&& !((entityiterator instanceof LivingEntity _livEnt ? _livEnt.hurtTime : 0) != 0)) {
						entityiterator.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), entity),
								(float) ((entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity32.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0) / 2));
					}
				}
			}
		}
	}
}