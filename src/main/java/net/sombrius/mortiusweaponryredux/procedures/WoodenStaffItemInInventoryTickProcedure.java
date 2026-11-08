package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class WoodenStaffItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("blocking") == 0 && entity instanceof LivingEntity _livingEntity2
				&& _livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("3c405a85-0c15-3f23-8752-b8f14ddfb896")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("3c405a85-0c15-3f23-8752-b8f14ddfb896"));
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(),
						(int) (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), itemstack) != 0 ? 40 / (itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 0.5) : 40));
		}
	}
}