package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class SilverWeaponsInInventoryProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) != 0) && itemstack.getOrCreateTag().getBoolean("enchanted_smite") == false) {
			itemstack.getOrCreateTag().putBoolean("enchanted_smite", true);
			itemstack.enchant(Enchantments.SMITE, 2);
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:rapier")))) {
			if (itemstack.getOrCreateTag().getDouble("pierce") == 0) {
				itemstack.getOrCreateTag().putDouble("pierce", 0.25);
			}
			if (itemstack.getOrCreateTag().getDouble("block") == 0) {
				itemstack.getOrCreateTag().putDouble("block", 0.2);
			}
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:saber"))) && itemstack.getOrCreateTag().getDouble("block") == 0) {
			itemstack.getOrCreateTag().putDouble("block", 0.15);
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:schiavona")))) {
			if (itemstack.getOrCreateTag().getDouble("pierce") == 0) {
				itemstack.getOrCreateTag().putDouble("pierce", 0.1);
			}
			if (itemstack.getOrCreateTag().getDouble("block") == 0) {
				itemstack.getOrCreateTag().putDouble("block", 0.1);
			}
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:parryingdagger")))) {
			if (itemstack.getOrCreateTag().getDouble("pierce") == 0) {
				itemstack.getOrCreateTag().putDouble("pierce", 0.15);
			}
			if (itemstack.getOrCreateTag().getDouble("block") == 0) {
				itemstack.getOrCreateTag().putDouble("block", 0.1);
			}
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:falchion")))) {
			if (itemstack.getOrCreateTag().getDouble("block") == 0) {
				itemstack.getOrCreateTag().putDouble("block", 0.1);
			}
		}
	}
}
