package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class AutoBowItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0")) != null) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem())) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0"));
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.getPersistentData().getBoolean("autoBowLoading") == true) {
				if (!((entity instanceof LivingEntity _entUseItem9 ? _entUseItem9.getUseItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
					if ((entity instanceof LivingEntity _entUseItem12 ? _entUseItem12.getUseItem() : ItemStack.EMPTY).getItem() == itemstack.getItem() && entity.getPersistentData().getDouble("autoBowPull") < 22) {
						entity.getPersistentData().putDouble("autoBowPull", (entity.getPersistentData().getDouble("autoBowPull") + 1));
						if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
								.hasModifier((new AttributeModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0"), "autoBowSpeed", 0.4, AttributeModifier.Operation.ADDITION)))))
							((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
									.addTransientModifier((new AttributeModifier(UUID.fromString("55825a25-981f-4b7f-999c-8bab58ac36f0"), "autoBowSpeed", 0.4, AttributeModifier.Operation.ADDITION)));
					}
				} else {
					entity.getPersistentData().putBoolean("autoBowLoading", false);
					entity.getPersistentData().putDouble("autoBowPull", 0);
				}
			} else {
				entity.getPersistentData().putBoolean("autoBowLoading", false);
				entity.getPersistentData().putDouble("autoBowPull", 0);
			}
		}
	}
}
