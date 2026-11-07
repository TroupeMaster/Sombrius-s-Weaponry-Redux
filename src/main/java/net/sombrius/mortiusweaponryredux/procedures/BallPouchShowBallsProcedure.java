package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;

import java.util.concurrent.atomic.AtomicReference;

public class BallPouchShowBallsProcedure {
	public static double execute(ItemStack itemstack, double slot) {
		if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.MUSKET_BALL.get()) {
			return 1;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.CRACKED_MUSKET_BALL.get()) {
			return 2;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.CRYSTALLIZED_MUSKET_BALL.get()) {
			return 3;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.FIERY_MUSKET_BALL.get()) {
			return 4;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.HELLFIRE_MUSKET_BALL.get()) {
			return 5;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.SPIKED_MUSKET_BALL.get()) {
			return 6;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.ENDER_BALL.get()) {
			return 7;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_MUSKET_BALL.get()) {
			return 8;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.HEAVY_MUSKET_BALL.get()) {
			return 9;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.PHANTOM_MUSKET_BALL.get()) {
			return 10;
		} else if ((getItemStackFromItemStackSlot((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.IRON_SLUG.get()) {
			return 11;
		}
		return 0;
	}

	private static ItemStack getItemStackFromItemStackSlot(int slotID, ItemStack itemStack) {
		AtomicReference<ItemStack> result = new AtomicReference<>(ItemStack.EMPTY);
		itemStack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> result.set(capability.getStackInSlot(slotID).copy()));
		return result.get();
	}
}