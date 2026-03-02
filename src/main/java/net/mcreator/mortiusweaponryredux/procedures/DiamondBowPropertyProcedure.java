package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class DiamondBowPropertyProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("diamondBowPull") / 22;
	}
}
