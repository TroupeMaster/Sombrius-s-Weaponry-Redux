package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import java.util.List;
import java.util.Comparator;

public class EntityGainsSpeedBoostEnderLanceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.ENDER_LANCE.get() && entity.isPassenger()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator == (entity.getVehicle())) {
						if (!(entityiterator instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.JUMP))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 1, false, false));
						}
						if (!(entityiterator instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.MOVEMENT_SPEED))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false));
						}
						if (!(entityiterator instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.REGENERATION))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 0, false, false));
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.PORTAL, (entityiterator.getX()), (entityiterator.getY() + 1.25), (entityiterator.getZ()), Mth.nextInt(RandomSource.create(), 1, 3), 0.1, 0, 0.1, 0.08);
					}
					if (entityiterator instanceof LivingEntity && !(entityiterator == (entity.getVehicle())) && !(entityiterator == entity)
							&& !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), entity),
								(float) (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue() / 2));
					}
				}
			}
		}
	}
}
