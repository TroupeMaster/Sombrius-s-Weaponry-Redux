package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class WoodenStaffRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("blocking") == 0 && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			itemstack.getOrCreateTag().putDouble("blocking", 1);
			if (!(entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("3c405a85-0c15-3f23-8752-b8f14ddfb896"))))) {
				if (entity instanceof LivingEntity _entity) {
					AttributeModifier modifier = new AttributeModifier(UUID.fromString("3c405a85-0c15-3f23-8752-b8f14ddfb896"), "mortius_weaponry_redux:wooden_staff_speed", (-0.5), AttributeModifier.Operation.MULTIPLY_TOTAL);
					if (!_entity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(modifier)) {
						_entity.getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(modifier);
					}
				}
			}
		}
	}
}