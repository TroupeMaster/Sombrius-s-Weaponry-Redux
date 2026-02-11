package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import java.util.UUID;

public class DiamondBucklerToolInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DIAMOND_BUCKLER.get()) {
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.hasModifier((new AttributeModifier(UUID.fromString("4ecd0c3a-f25a-4e61-a6bc-bcffed97edad"), "diamondBucklerSpeed", 0.25, AttributeModifier.Operation.ADDITION)))))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.addTransientModifier((new AttributeModifier(UUID.fromString("4ecd0c3a-f25a-4e61-a6bc-bcffed97edad"), "diamondBucklerSpeed", 0.25, AttributeModifier.Operation.ADDITION)));
		} else if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
				.hasModifier((new AttributeModifier(UUID.fromString("4ecd0c3a-f25a-4e61-a6bc-bcffed97edad"), "diamondBucklerSpeed", 0.25, AttributeModifier.Operation.ADDITION)))) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.removeModifier((new AttributeModifier(UUID.fromString("4ecd0c3a-f25a-4e61-a6bc-bcffed97edad"), "diamondBucklerSpeed", 0.25, AttributeModifier.Operation.ADDITION)));
		}
	}
}
