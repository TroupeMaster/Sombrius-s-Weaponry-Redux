package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class DiamondBowRightClickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("diamondBowLoading", true);
	}
}
