package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class NetheriteBowRightClickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("netheriteBowLoading", true);
	}
}
