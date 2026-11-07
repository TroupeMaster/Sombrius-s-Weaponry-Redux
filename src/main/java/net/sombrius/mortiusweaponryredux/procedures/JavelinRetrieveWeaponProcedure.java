package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.sombrius.mortiusweaponryredux.entity.*;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

public class JavelinRetrieveWeaponProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof AbstractArrow _arrowContext ? _arrowContext.pickup == AbstractArrow.Pickup.ALLOWED : false) {
			if (immediatesourceentity instanceof AbstractArrow _abstractArrow)
				_abstractArrow.pickup = AbstractArrow.Pickup.DISALLOWED;
		}
		if (immediatesourceentity instanceof WoodenJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.WOODEN_JAVELIN.get()));
		} else if (immediatesourceentity instanceof StoneJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.STONE_JAVELIN.get()));
		} else if (immediatesourceentity instanceof GoldenJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.GOLDEN_JAVELIN.get()));
		} else if (immediatesourceentity instanceof IronJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.IRON_JAVELIN.get()));
		} else if (immediatesourceentity instanceof DiamondJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.DIAMOND_JAVELIN.get()));
		} else if (immediatesourceentity instanceof NetheriteJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.NETHERITE_JAVELIN.get()));
		} else if (immediatesourceentity instanceof SteelJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.STEEL_JAVELIN.get()));
		} else if (immediatesourceentity instanceof BronzeJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.BRONZE_JAVELIN.get()));
		} else if (immediatesourceentity instanceof SilverJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.SILVER_JAVELIN.get()));
		} else if (immediatesourceentity instanceof RoseGoldJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.ROSE_GOLD_JAVELIN.get()));
		} else if (immediatesourceentity instanceof CopperJavelinProjEntity) {
			RetrieveThrownWeaponProcedure.execute(world, x, y, z, immediatesourceentity, new ItemStack(MortiusWeaponryReduxModItems.COPPER_JAVELIN.get()));
		}
	}
}