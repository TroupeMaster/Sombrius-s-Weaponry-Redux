package net.sombrius.mortiusweaponryredux.enchantment;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class SpikedEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("mortius_weaponry_redux_spiked",
			item -> Ingredient.of(new ItemStack(MortiusWeaponryReduxModItems.SPIKED_SHIELD.get()), new ItemStack(MortiusWeaponryReduxModItems.LIVING_SHIELD.get())).test(new ItemStack(item)));

	public SpikedEnchantment() {
		this(EquipmentSlot.MAINHAND);
	}

	private SpikedEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, ENCHANTMENT_CATEGORY, slots);
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}
}