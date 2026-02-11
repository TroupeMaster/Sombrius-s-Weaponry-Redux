package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CopperBowInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && entity.getPersistentData().getDouble("copperBowPull") > 0) {
			entity.getPersistentData().putDouble("copperBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.getPersistentData().getBoolean("copperBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && entity.getPersistentData().getDouble("copperBowPull") < 22) {
					entity.getPersistentData().putDouble("copperBowPull", (entity.getPersistentData().getDouble("copperBowPull") + 1));
				}
			} else {
				entity.getPersistentData().putBoolean("copperBowLoading", false);
				entity.getPersistentData().putDouble("copperBowPull", 0);
			}
		}
	}
}
