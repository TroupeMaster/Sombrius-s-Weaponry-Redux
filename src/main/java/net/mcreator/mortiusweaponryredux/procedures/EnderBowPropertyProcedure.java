package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class EnderBowPropertyProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("enderBowPull") / 22;
	}
}
