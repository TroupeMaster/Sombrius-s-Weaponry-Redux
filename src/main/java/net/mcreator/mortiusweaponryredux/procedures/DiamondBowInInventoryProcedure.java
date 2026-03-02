package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class DiamondBowInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && itemstack.getOrCreateTag().getDouble("diamondBowPull") > 0) {
			itemstack.getOrCreateTag().putDouble("diamondBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (itemstack.getOrCreateTag().getBoolean("diamondBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem15 ? _entUseItem15.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && itemstack.getOrCreateTag().getDouble("diamondBowPull") < 22) {
					itemstack.getOrCreateTag().putDouble("diamondBowPull", (itemstack.getOrCreateTag().getDouble("diamondBowPull") + 1));
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("diamondBowLoading", false);
				itemstack.getOrCreateTag().putDouble("diamondBowPull", 0);
			}
		}
	}
}
