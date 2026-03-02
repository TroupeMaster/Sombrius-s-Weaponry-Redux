package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class AutoBowStopUsingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putBoolean("autoBowLoading", false);
		itemstack.getOrCreateTag().putDouble("autoBowPull", 0);
		if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0")) != null) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0"));
		}
	}
}
