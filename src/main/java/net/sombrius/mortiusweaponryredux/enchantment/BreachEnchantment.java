package net.sombrius.mortiusweaponryredux.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class BreachEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("mortius_weaponry_redux_breach", item -> Ingredient.of(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:khopesh"))).test(new ItemStack(item)));

	public BreachEnchantment() {
		this(EquipmentSlot.MAINHAND);
	}

	private BreachEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, slots);
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}
}