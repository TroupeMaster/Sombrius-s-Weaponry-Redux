package net.sombrius.mortiusweaponryredux.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class LivingShieldItem extends ShieldItem {
	public LivingShieldItem() {
		super(new Item.Properties().durability(672).fireResistant());
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.ROTTEN_FLESH)).test(repairitem);
	}

	private static final UUID UUID_0 = UUID.fromString("9887c8e6-eadf-3a00-8e58-b0e7845a8609");
	private static final UUID UUID_1 = UUID.fromString("e55c478d-e84c-3b82-8bd7-9344ebfb1f21");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		Multimap<Attribute, AttributeModifier> defaultModifiers = super.getAttributeModifiers(equipmentSlot, stack);
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = null;
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			builder = initializeBuilder(builder, defaultModifiers);
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(UUID_0, "Tool modifier", 6, AttributeModifier.Operation.ADDITION));
		}
		if (equipmentSlot == EquipmentSlot.OFFHAND) {
			builder = initializeBuilder(builder, defaultModifiers);
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(UUID_1, "Tool modifier", 0.05, AttributeModifier.Operation.MULTIPLY_TOTAL));
		}
		return builder != null ? builder.build() : defaultModifiers;
	}

	private static ImmutableMultimap.Builder<Attribute, AttributeModifier> initializeBuilder(ImmutableMultimap.Builder<Attribute, AttributeModifier> builder, Multimap<Attribute, AttributeModifier> defaults) {
		if (builder == null) {
			builder = ImmutableMultimap.builder();
			builder.putAll(defaults);
		}
		return builder;
	}
}