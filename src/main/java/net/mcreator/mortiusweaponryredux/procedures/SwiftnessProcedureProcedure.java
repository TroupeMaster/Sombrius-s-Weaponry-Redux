package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import javax.annotation.Nullable;

import java.util.UUID;

@Mod.EventBusSubscriber
public class SwiftnessProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				&& !(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).getModifier(UUID.fromString("f0222ec5-4dd0-4e21-8b5b-00c9cd2e79ca")) != null)) {
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED)
					.hasModifier((new AttributeModifier(UUID.fromString("f0222ec5-4dd0-4e21-8b5b-00c9cd2e79ca"), "swiftness_attackspeed", 0.4, AttributeModifier.Operation.ADDITION)))))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED)
						.addTransientModifier((new AttributeModifier(UUID.fromString("f0222ec5-4dd0-4e21-8b5b-00c9cd2e79ca"), "swiftness_attackspeed", 0.4, AttributeModifier.Operation.ADDITION)));
		} else if (!(EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
				&& ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).getModifier(UUID.fromString("f0222ec5-4dd0-4e21-8b5b-00c9cd2e79ca")) != null) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).removeModifier(UUID.fromString("f0222ec5-4dd0-4e21-8b5b-00c9cd2e79ca"));
		}
	}
}
