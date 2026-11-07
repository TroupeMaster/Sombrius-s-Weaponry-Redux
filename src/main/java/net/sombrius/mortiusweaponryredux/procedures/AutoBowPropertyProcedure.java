package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class AutoBowPropertyProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("autoBowPull") / 22;
	}
}