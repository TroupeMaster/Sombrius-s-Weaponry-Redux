package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class IronBowItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && entity.getPersistentData().getDouble("ironBowPull") > 0) {
			entity.getPersistentData().putDouble("ironBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.getPersistentData().getBoolean("ironBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && entity.getPersistentData().getDouble("ironBowPull") < 22) {
					entity.getPersistentData().putDouble("ironBowPull", (entity.getPersistentData().getDouble("ironBowPull") + 1));
				}
			} else {
				entity.getPersistentData().putBoolean("ironBowLoading", false);
				entity.getPersistentData().putDouble("ironBowPull", 0);
			}
		}
	}
}
