package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import java.util.concurrent.atomic.AtomicReference;

public class BallPouchShowBallsProcedure {
	public static double execute(ItemStack itemstack, double slot) {
		if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.MUSKET_BALL.get()) {
			return 1;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.CRACKED_MUSKET_BALL.get()) {
			return 2;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.CRYSTALLIZED_MUSKET_BALL.get()) {
			return 3;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.FIERY_MUSKET_BALL.get()) {
			return 4;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.HELLFIRE_MUSKET_BALL.get()) {
			return 5;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.SPIKED_MUSKET_BALL.get()) {
			return 6;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.ENDER_BALL.get()) {
			return 7;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_MUSKET_BALL.get()) {
			return 8;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.HEAVY_MUSKET_BALL.get()) {
			return 9;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.PHANTOM_MUSKET_BALL.get()) {
			return 10;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) slot, itemstack)).getItem() == MortiusWeaponryReduxModItems.IRON_SLUG.get()) {
			return 11;
		}
		return 0;
	}
}
