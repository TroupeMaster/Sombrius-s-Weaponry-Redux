package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class ParryingDaggerSetTagProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("pierce") == 0) {
			itemstack.getOrCreateTag().putDouble("pierce", 0.5);
		}
		if (itemstack.getOrCreateTag().getDouble("block") == 0) {
			itemstack.getOrCreateTag().putDouble("block", 0.2);
		}
	}
}
