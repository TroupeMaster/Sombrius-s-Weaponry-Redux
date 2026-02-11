
package net.mcreator.mortiusweaponryredux.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

public class SpikedEnchantment extends Enchantment {
	public SpikedEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(MortiusWeaponryReduxModItems.SPIKED_SHIELD.get()), new ItemStack(MortiusWeaponryReduxModItems.LIVING_SHIELD.get())).test(itemstack);
	}
}
