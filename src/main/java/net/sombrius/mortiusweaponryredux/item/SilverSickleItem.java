package net.sombrius.mortiusweaponryredux.item;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModAttributes;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class SilverSickleItem extends SwordItem {
	public SilverSickleItem() {
		super(new Tier() {
			public int getUses() {
				return 180;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/silver")));
			}
		}, 3, -1.2f, new Item.Properties());
	}

	private static final UUID UUID_0 = UUID.fromString("a723f9e2-0f11-3be4-82c4-9861b4b5e6d9");
	private static final UUID UUID_1 = UUID.fromString("5f7aa9d1-d934-39c1-adf4-1672eaa48274");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(MortiusWeaponryReduxModAttributes.SMITE.get(), new AttributeModifier(UUID_0, "Tool modifier", 3, AttributeModifier.Operation.ADDITION));
			builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(UUID_1, "Tool modifier", -0.25, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}
}