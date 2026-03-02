package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;

import java.util.concurrent.atomic.AtomicReference;

public class MusketBallPouchPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 0);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 1);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(2, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 2);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 3);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(4, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 4);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 5);
		} else if (!((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(6, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
			return BallPouchShowBallsProcedure.execute(itemstack, 6);
		}
		return 0;
	}
}
