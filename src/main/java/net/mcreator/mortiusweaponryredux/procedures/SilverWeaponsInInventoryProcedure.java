package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class SilverWeaponsInInventoryProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) != 0) && itemstack.getOrCreateTag().getBoolean("enchanted_smite") == false) {
			itemstack.getOrCreateTag().putBoolean("enchanted_smite", true);
			itemstack.enchant(Enchantments.SMITE, 2);
		}
	}
}
