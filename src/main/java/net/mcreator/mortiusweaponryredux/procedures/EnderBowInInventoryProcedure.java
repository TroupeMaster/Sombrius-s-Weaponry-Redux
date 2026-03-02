package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EnderBowInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && itemstack.getOrCreateTag().getDouble("enderBowPull") > 0) {
			itemstack.getOrCreateTag().putDouble("enderBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (itemstack.getOrCreateTag().getBoolean("enderBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem15 ? _entUseItem15.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && itemstack.getOrCreateTag().getDouble("enderBowPull") < 22) {
					itemstack.getOrCreateTag().putDouble("enderBowPull", (itemstack.getOrCreateTag().getDouble("enderBowPull") + 1));
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("enderBowLoading", false);
				itemstack.getOrCreateTag().putDouble("enderBowPull", 0);
			}
		}
	}
}
