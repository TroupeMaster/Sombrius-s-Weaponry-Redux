package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class FrostBarrierOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double count = 0;
		loop = 0;
		particleAmount = 34;
		xRadius = 6;
		zRadius = 6;
		while (loop < particleAmount) {
			world.addParticle((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.FROST_SHARD.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + 2),
					(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, (-0.05), 0);
			world.addParticle(ParticleTypes.SNOWFLAKE, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), (y + 1), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, (-0.05), 0);
			loop = loop + 1;
		}
		if (entity.getPersistentData().getDouble("mwr:frost_barrier_cooldown") >= 15) {
			entity.getPersistentData().putDouble("mwr:frost_barrier_cooldown", 0);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE), entity), 4);
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SNOWFLAKE, (entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("mwr:frost_barrier_cooldown", (entity.getPersistentData().getDouble("mwr:frost_barrier_cooldown") + 1));
		}
	}
}
