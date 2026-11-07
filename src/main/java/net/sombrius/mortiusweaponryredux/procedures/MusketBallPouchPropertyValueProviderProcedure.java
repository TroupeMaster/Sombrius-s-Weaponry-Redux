package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;

import java.util.concurrent.atomic.AtomicReference;

public class MusketBallPouchPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 0);
		} else if (!((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 1);
		} else if (!((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 2);
		} else if (!((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 3);
		} else if (!((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 4);
		} else if (!((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 5);
		} else if (!((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 6);
		}
		return 0;
	}

	private static ItemStack getItemStackFromItemStackSlot(int slotID, ItemStack itemStack) {
		AtomicReference<ItemStack> result = new AtomicReference<>(ItemStack.EMPTY);
		itemStack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> result.set(capability.getStackInSlot(slotID).copy()));
		return result.get();
	}
}