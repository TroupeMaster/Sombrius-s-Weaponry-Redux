package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class AutoBowStopUsingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putBoolean("autoBowLoading", false);
		itemstack.getOrCreateTag().putDouble("autoBowPull", 0);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861"));
			}
		}
	}
}