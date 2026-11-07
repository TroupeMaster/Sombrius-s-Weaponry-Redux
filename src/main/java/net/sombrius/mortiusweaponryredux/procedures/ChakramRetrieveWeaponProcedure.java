package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.sombrius.mortiusweaponryredux.entity.*;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

public class ChakramRetrieveWeaponProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof AbstractArrow _arrowContext ? _arrowContext.pickup == AbstractArrow.Pickup.ALLOWED : false) {
			if (immediatesourceentity instanceof AbstractArrow _abstractArrow)
				_abstractArrow.pickup = AbstractArrow.Pickup.DISALLOWED;
		}
		if (immediatesourceentity instanceof WoodenChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.WOODEN_CHAKRAM.get()));
		} else if (immediatesourceentity instanceof StoneChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.STONE_CHAKRAM.get()));
		} else if (immediatesourceentity instanceof GoldenChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.GOLDEN_CHAKRAM.get()));
		} else if (immediatesourceentity instanceof IronChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.IRON_CHAKRAM.get()));
		} else if (immediatesourceentity instanceof DiamondChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.DIAMOND_CHAKRAM.get()));
		} else if (immediatesourceentity instanceof NetheriteChakramProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.NETHERITE_CHAKRAM.get()));
		}
	}
}