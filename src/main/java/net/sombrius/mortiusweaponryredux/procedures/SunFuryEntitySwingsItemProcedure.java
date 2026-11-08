package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.Comparator;

public class SunFuryEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double radianArc = 0;
		double d = 0;
		double verticalOffset = 0;
		double sign = 0;
		double rollAngle = 0;
		double horizontalOffsetDir = 0;
		double i = 0;
		double dMajor = 0;
		double horizontalOffsetMag = 0;
		double circleDistanceConstant = 0;
		double radianSteps = 0;
		double arcStart = 0;
		if ((entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) <= 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(),
						(int) (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), itemstack) != 0 ? 5d / (itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1) : 5));
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), y,
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (!(entityiterator == entity) && !(entityiterator == (entity.getVehicle())) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy13 && entity instanceof LivingEntity _livEnt13 && _tamIsTamedBy13.isOwnedBy(_livEnt13))) {
						entityiterator.setSecondsOnFire(4);
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.IN_FIRE), entity),
								(float) ((entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity15.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0) / 2));
					}
				}
			}
			circleDistanceConstant = 2.6;
			rollAngle = 0;
			horizontalOffsetMag = 0;
			horizontalOffsetDir = 0;
			verticalOffset = 0.25;
			dMajor = circleDistanceConstant;
			d = circleDistanceConstant * Math.cos(Math.toRadians(rollAngle));
			i = (0 * Math.PI) / 1;
			radianArc = (1 * Math.PI) / 1;
			radianSteps = (1 * Math.PI) / 16;
			arcStart = Math.toRadians(entity.getYRot() + 0);
			while (i <= radianArc) {
				if (0 > Math.sin(i)) {
					sign = -1;
				} else {
					sign = 1;
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME,
							(dMajor * Math.cos(i) * Math.cos(arcStart) - d * Math.sin(i) * Math.sin(arcStart) + entity.getX() + horizontalOffsetMag * Math.sin(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))),
							(sign * Math.sqrt(Math.abs(Math.sin(Math.toRadians(rollAngle))) * (Math.pow(dMajor, 2) - Math.pow(dMajor * Math.cos(i), 2))) + entity.getY() + 1 + verticalOffset),
							(dMajor * Math.cos(i) * Math.sin(arcStart) + d * Math.sin(i) * Math.cos(arcStart) + entity.getZ() - horizontalOffsetMag * Math.cos(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))), 2, 0.01, 0.01, 0.01, 0.01);
				i = i + radianSteps;
			}
		}
	}
}