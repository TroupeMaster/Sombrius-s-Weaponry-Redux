package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class NetheriteBowInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && itemstack.getOrCreateTag().getDouble("netheriteBowPull") > 0) {
			itemstack.getOrCreateTag().putDouble("netheriteBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (itemstack.getOrCreateTag().getBoolean("netheriteBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem15 ? _entUseItem15.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && itemstack.getOrCreateTag().getDouble("netheriteBowPull") < 22) {
					itemstack.getOrCreateTag().putDouble("netheriteBowPull", (itemstack.getOrCreateTag().getDouble("netheriteBowPull") + 1));
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("netheriteBowLoading", false);
				itemstack.getOrCreateTag().putDouble("netheriteBowPull", 0);
			}
		}
	}
}
