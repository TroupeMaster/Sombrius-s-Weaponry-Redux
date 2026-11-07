package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.UUID;

@Mod.EventBusSubscriber
public class SwiftnessEnchantmentProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				&& !(entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttribute(Attributes.ATTACK_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("15cf8b95-ee1a-37eb-ac5c-3e59a42b684c"))))) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(UUID.fromString("15cf8b95-ee1a-37eb-ac5c-3e59a42b684c"), "mortius_weaponry_redux:swiftness_enchant_attack_speed",
						(0.4 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get())), AttributeModifier.Operation.ADDITION);
				if (!_entity.getAttribute(Attributes.ATTACK_SPEED).hasModifier(modifier)) {
					_entity.getAttribute(Attributes.ATTACK_SPEED).addPermanentModifier(modifier);
				}
			}
		} else if (!(EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
				&& entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttribute(Attributes.ATTACK_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("15cf8b95-ee1a-37eb-ac5c-3e59a42b684c")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.ATTACK_SPEED).removeModifier(UUID.fromString("15cf8b95-ee1a-37eb-ac5c-3e59a42b684c"));
			}
		}
	}
}