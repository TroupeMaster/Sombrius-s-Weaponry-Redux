package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

import java.util.UUID;
import java.util.List;
import java.util.Comparator;

public class SeraphTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.VULNERABILITY.get(), 20, 0, false, false));
		if (entity.getPersistentData().getBoolean("seraphRage") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.INVULNERABILITY.get(), 20, 0, false, true));
			if (!(((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_GRAVITY.get()).hasModifier((new AttributeModifier(UUID.fromString("19f9f2d8-69a0-4780-a389-538964492f84"), "seraphGravity", 5, AttributeModifier.Operation.ADDITION)))))
				((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_GRAVITY.get()).addTransientModifier((new AttributeModifier(UUID.fromString("19f9f2d8-69a0-4780-a389-538964492f84"), "seraphGravity", 5, AttributeModifier.Operation.ADDITION)));
			if (!((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR)) {
				entity.getPersistentData().putBoolean("seraphRage", false);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 6, Level.ExplosionInteraction.NONE);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LAVA, x, y, z, 35, 1, 1, 1, 1);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
							entityiterator.hurt(
									new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), entity),
									10);
							entityiterator.setSecondsOnFire(15);
						}
					}
				}
				if (((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_GRAVITY.get()).hasModifier((new AttributeModifier(UUID.fromString("19f9f2d8-69a0-4780-a389-538964492f84"), "seraphGravity", 5, AttributeModifier.Operation.ADDITION)))) {
					((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_GRAVITY.get()).removeModifier((new AttributeModifier(UUID.fromString("19f9f2d8-69a0-4780-a389-538964492f84"), "seraphGravity", 5, AttributeModifier.Operation.ADDITION)));
				}
			}
		}
	}
}
