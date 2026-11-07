package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class MusketBallPouchInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())
				|| !((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())
				|| !((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())
				|| !((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem())) && !(itemstack.getOrCreateTag().getDouble("quiverFull") == 1)) {
			itemstack.getOrCreateTag().putDouble("quiverFull", 1);
		} else if ((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem() && (getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem()
				&& (getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem() && (getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem()
				&& (getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem() && (getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem()
				&& (getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem() && itemstack.getOrCreateTag().getDouble("quiverFull") == 1) {
			itemstack.getOrCreateTag().putDouble("quiverFull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:flintlock")))
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()
				&& (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem()))) {
			if (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(0, itemstack)).copy();
					final int _sltid = 0;
					_setstack.setCount((getItemStackFromItemStackSlot(0, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack110 = (getItemStackFromItemStackSlot(0, itemstack)).copy();
					_setstack110.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack110);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(1, itemstack)).copy();
					final int _sltid = 1;
					_setstack.setCount((getItemStackFromItemStackSlot(1, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack124 = (getItemStackFromItemStackSlot(1, itemstack)).copy();
					_setstack124.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack124);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(2, itemstack)).copy();
					final int _sltid = 2;
					_setstack.setCount((getItemStackFromItemStackSlot(2, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack138 = (getItemStackFromItemStackSlot(2, itemstack)).copy();
					_setstack138.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack138);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(3, itemstack)).copy();
					final int _sltid = 3;
					_setstack.setCount((getItemStackFromItemStackSlot(3, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack152 = (getItemStackFromItemStackSlot(3, itemstack)).copy();
					_setstack152.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack152);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(4, itemstack)).copy();
					final int _sltid = 4;
					_setstack.setCount((getItemStackFromItemStackSlot(4, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack166 = (getItemStackFromItemStackSlot(4, itemstack)).copy();
					_setstack166.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack166);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(5, itemstack)).copy();
					final int _sltid = 5;
					_setstack.setCount((getItemStackFromItemStackSlot(5, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack180 = (getItemStackFromItemStackSlot(5, itemstack)).copy();
					_setstack180.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack180);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(6, itemstack)).copy();
					final int _sltid = 6;
					_setstack.setCount((getItemStackFromItemStackSlot(6, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack194 = (getItemStackFromItemStackSlot(6, itemstack)).copy();
					_setstack194.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack194);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:flintlock")))
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()
				&& (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem()))) {
			if (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(0, itemstack)).copy();
					final int _sltid = 0;
					_setstack.setCount((getItemStackFromItemStackSlot(0, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack241 = (getItemStackFromItemStackSlot(0, itemstack)).copy();
					_setstack241.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack241);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(1, itemstack)).copy();
					final int _sltid = 1;
					_setstack.setCount((getItemStackFromItemStackSlot(1, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack255 = (getItemStackFromItemStackSlot(1, itemstack)).copy();
					_setstack255.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack255);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(2, itemstack)).copy();
					final int _sltid = 2;
					_setstack.setCount((getItemStackFromItemStackSlot(2, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack269 = (getItemStackFromItemStackSlot(2, itemstack)).copy();
					_setstack269.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack269);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(3, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(3, itemstack)).copy();
					final int _sltid = 3;
					_setstack.setCount((getItemStackFromItemStackSlot(3, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack283 = (getItemStackFromItemStackSlot(3, itemstack)).copy();
					_setstack283.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack283);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(4, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(4, itemstack)).copy();
					final int _sltid = 4;
					_setstack.setCount((getItemStackFromItemStackSlot(4, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack297 = (getItemStackFromItemStackSlot(4, itemstack)).copy();
					_setstack297.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack297);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(5, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(5, itemstack)).copy();
					final int _sltid = 5;
					_setstack.setCount((getItemStackFromItemStackSlot(5, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack311 = (getItemStackFromItemStackSlot(5, itemstack)).copy();
					_setstack311.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack311);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (!((getItemStackFromItemStackSlot(6, itemstack)).getItem() == ItemStack.EMPTY.getItem())) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = (getItemStackFromItemStackSlot(6, itemstack)).copy();
					final int _sltid = 6;
					_setstack.setCount((getItemStackFromItemStackSlot(6, itemstack)).getCount() - 1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack325 = (getItemStackFromItemStackSlot(6, itemstack)).copy();
					_setstack325.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack325);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}

	private static ItemStack getItemStackFromItemStackSlot(int slotID, ItemStack itemStack) {
		AtomicReference<ItemStack> result = new AtomicReference<>(ItemStack.EMPTY);
		itemStack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> result.set(capability.getStackInSlot(slotID).copy()));
		return result.get();
	}
}