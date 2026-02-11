package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class NetheriteBowInInventoryProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && entity.getPersistentData().getDouble("netheriteBowPull") > 0) {
			entity.getPersistentData().putDouble("netheriteBowPull", 0);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.getPersistentData().getBoolean("netheriteBowLoading") == true) {
				if ((entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && entity.getPersistentData().getDouble("netheriteBowPull") < 22) {
					entity.getPersistentData().putDouble("netheriteBowPull", (entity.getPersistentData().getDouble("netheriteBowPull") + 1));
				}
			} else {
				entity.getPersistentData().putBoolean("netheriteBowLoading", false);
				entity.getPersistentData().putDouble("netheriteBowPull", 0);
			}
		}
	}
}
