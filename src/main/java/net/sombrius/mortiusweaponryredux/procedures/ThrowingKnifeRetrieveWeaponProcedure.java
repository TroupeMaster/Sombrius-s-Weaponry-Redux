package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.sombrius.mortiusweaponryredux.entity.*;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

public class ThrowingKnifeRetrieveWeaponProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof AbstractArrow _arrowContext ? _arrowContext.pickup == AbstractArrow.Pickup.ALLOWED : false) {
			if (immediatesourceentity instanceof AbstractArrow _abstractArrow)
				_abstractArrow.pickup = AbstractArrow.Pickup.DISALLOWED;
		}
		if (immediatesourceentity instanceof WoodenThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.WOODEN_THROWING_KNIFE.get()));
		} else if (immediatesourceentity instanceof StoneThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.STONE_THROWING_KNIFE.get()));
		} else if (immediatesourceentity instanceof GoldenThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.GOLDEN_THROWING_KNIFE.get()));
		} else if (immediatesourceentity instanceof IronThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.IRON_THROWING_KNIFE.get()));
		} else if (immediatesourceentity instanceof DiamondThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.DIAMOND_THROWING_KNIFE.get()));
		} else if (immediatesourceentity instanceof NetheriteThrowingKnifeProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.NETHERITE_THROWING_KNIFE.get()));
		}
	}
}