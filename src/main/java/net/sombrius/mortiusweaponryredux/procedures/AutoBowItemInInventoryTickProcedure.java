package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class AutoBowItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && entity instanceof LivingEntity _livingEntity3
				&& _livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861"));
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (itemstack.getOrCreateTag().getBoolean("autoBowLoading") == true) {
				if (!((entity instanceof LivingEntity _entUseItem10 ? _entUseItem10.getUseItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
					if ((entity instanceof LivingEntity _entUseItem13 ? _entUseItem13.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && itemstack.getOrCreateTag().getDouble("autoBowPull") < 22) {
						itemstack.getOrCreateTag().putDouble("autoBowPull", (itemstack.getOrCreateTag().getDouble("autoBowPull") + 1));
						if (!(entity instanceof LivingEntity _livingEntity22
								&& _livingEntity22.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861"))))) {
							if (entity instanceof LivingEntity _entity) {
								AttributeModifier modifier = new AttributeModifier(UUID.fromString("0ec247ba-83bc-34f9-a0f9-d87d5677c861"), "mortius_weaponry_redux:auto_bow_movement_speed", 0.4, AttributeModifier.Operation.ADDITION);
								if (!_entity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(modifier)) {
									_entity.getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(modifier);
								}
							}
						}
					}
				} else {
					itemstack.getOrCreateTag().putBoolean("autoBowLoading", false);
					itemstack.getOrCreateTag().putDouble("autoBowPull", 0);
				}
			} else {
				itemstack.getOrCreateTag().putBoolean("autoBowLoading", false);
				itemstack.getOrCreateTag().putDouble("autoBowPull", 0);
			}
		}
	}
}