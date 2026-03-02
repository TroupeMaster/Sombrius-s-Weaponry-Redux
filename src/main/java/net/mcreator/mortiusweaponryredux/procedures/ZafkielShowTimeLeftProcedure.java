package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModParticleTypes;

public class ZafkielShowTimeLeftProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("timeLeft") == 67) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_12.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_11.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_10.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_9.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 3) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_8.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 4) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_7.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 5) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_6.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 6) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_5.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 7) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_4.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 8) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_3.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 9) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_2.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 10) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_1.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		} else if (entity.getPersistentData().getDouble("timeLeft") == 11) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MortiusWeaponryReduxModParticleTypes.TIME_LEFT_0.get()), entity.getX() + entity.getLookAngle().x * 1, entity.getY() + entity.getLookAngle().y + 1.7 * 1,
						entity.getZ() + entity.getLookAngle().z * 1, 1, 0, 0.1, 0, 0.1);
		}
	}
}
