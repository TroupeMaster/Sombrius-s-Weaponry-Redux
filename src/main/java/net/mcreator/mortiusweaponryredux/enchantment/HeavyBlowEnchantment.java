
package net.mcreator.mortiusweaponryredux.enchantment;

import net.minecraftforge.common.crafting.CompoundIngredient;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class HeavyBlowEnchantment extends Enchantment {
	public HeavyBlowEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.SHARPNESS, Enchantments.SMITE, Enchantments.BANE_OF_ARTHROPODS).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return CompoundIngredient.of(Ingredient.of(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:mace"))), Ingredient.of(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:flail"))),
				Ingredient.of(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:warhammer")))).test(itemstack);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
