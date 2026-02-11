package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

public class NetheriteThrowingKnifeProjProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MortiusWeaponryReduxModItems.NETHERITE_THROWING_KNIFE.get()));
			entityToSpawn.setPickUpDelay(5);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
