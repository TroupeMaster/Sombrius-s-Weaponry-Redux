package net.sombrius.mortiusweaponryredux.item;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModAttributes;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class SilverBattleAxeItem extends AxeItem {
	public SilverBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 280;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 1, -3f, new Item.Properties());
	}

	private static final UUID UUID_0 = UUID.fromString("99375782-8825-3ddb-9da8-dbc259a68c0e");
	private static final UUID UUID_1 = UUID.fromString("6cb0cc18-0fae-3c25-bca4-fb7a79c6fe7b");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(MortiusWeaponryReduxModAttributes.SMITE.get(), new AttributeModifier(UUID_0, "Tool modifier", 3, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(UUID_1, "Tool modifier", 1, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}
}