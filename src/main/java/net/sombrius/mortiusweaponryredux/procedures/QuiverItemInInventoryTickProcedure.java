package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class QuiverItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem())
				|| !((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem())) && !(itemstack.getOrCreateTag().getDouble("quiverFull") == 1)) {
			itemstack.getOrCreateTag().putDouble("quiverFull", 1);
		} else if ((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem() && (getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem()
				&& (getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem() && itemstack.getOrCreateTag().getDouble("quiverFull") == 1) {
			itemstack.getOrCreateTag().putDouble("quiverFull", 0);
		}
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BowItem
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof CrossbowItem
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:bow"))))
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem() && (!((getItemStackFromItemStackSlot(0, itemstack)).getItem() == ItemStack.EMPTY.getItem())
						|| !((getItemStackFromItemStackSlot(1, itemstack)).getItem() == ItemStack.EMPTY.getItem()) || !((getItemStackFromItemStackSlot(2, itemstack)).getItem() == ItemStack.EMPTY.getItem()))) {
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
					ItemStack _setstack66 = (getItemStackFromItemStackSlot(0, itemstack)).copy();
					_setstack66.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack66);
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
					ItemStack _setstack80 = (getItemStackFromItemStackSlot(1, itemstack)).copy();
					_setstack80.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack80);
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
					ItemStack _setstack94 = (getItemStackFromItemStackSlot(2, itemstack)).copy();
					_setstack94.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack94);
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