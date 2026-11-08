package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class WoodenStaffPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("blocking");
	}
}