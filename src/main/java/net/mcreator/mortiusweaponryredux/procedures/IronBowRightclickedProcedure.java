package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;

public class IronBowRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("ironBowLoading", true);
	}
}
