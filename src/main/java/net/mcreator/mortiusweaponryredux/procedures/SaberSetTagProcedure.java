package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class SaberSetTagProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("block") == 0) {
			itemstack.getOrCreateTag().putDouble("block", 0.2);
		}
	}
}
