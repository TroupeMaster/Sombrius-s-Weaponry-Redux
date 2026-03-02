package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class HandCannonItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("recoil") == true) {
			itemstack.getOrCreateTag().putBoolean("recoil", false);
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * (-1.4)), (Math.sin(Math.toRadians(0 - entity.getXRot())) * (-1.4)), (Math.cos(Math.toRadians(entity.getYRot())) * (-1.4))));
		}
	}
}
