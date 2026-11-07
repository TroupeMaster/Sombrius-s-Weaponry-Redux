package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class CopperBowRightClickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("copperBowLoading", true);
	}
}