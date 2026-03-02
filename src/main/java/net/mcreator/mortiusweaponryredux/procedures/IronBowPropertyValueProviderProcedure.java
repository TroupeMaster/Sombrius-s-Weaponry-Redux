package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class IronBowPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("ironBowPull") / 22;
	}
}
