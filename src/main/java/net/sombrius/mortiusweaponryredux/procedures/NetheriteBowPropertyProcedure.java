package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class NetheriteBowPropertyProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("netheriteBowPull") / 22;
	}
}