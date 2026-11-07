package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class DiamondBucklerToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()
				&& !(entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("a375fd0b-3fa8-38d0-bffe-b234d73df23c"))))) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(UUID.fromString("a375fd0b-3fa8-38d0-bffe-b234d73df23c"), "mortius_weaponry_redux:diamond_buckler_movement_speed", 0.25, AttributeModifier.Operation.ADDITION);
				if (!_entity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(modifier)) {
					_entity.getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(modifier);
				}
			}
		} else if (!((entity instanceof LivingEntity _entUseItem5 ? _entUseItem5.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) && entity instanceof LivingEntity _livingEntity8
				&& _livingEntity8.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("a375fd0b-3fa8-38d0-bffe-b234d73df23c")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("a375fd0b-3fa8-38d0-bffe-b234d73df23c"));
			}
		}
	}
}