package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

import java.util.UUID;

@Mod.EventBusSubscriber
public class SetWeaponAttributesProcedure {
	@SubscribeEvent
	public static void addAttributeModifier(ItemAttributeModifierEvent event) {
		execute(event, event.getItemStack());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (event instanceof ItemAttributeModifierEvent _event && _event.getSlotType() == EquipmentSlot.MAINHAND) {
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:halberd")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("1793565f-2291-49e5-a102-0e416af166a5"), "halberd_reach", 1, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:battleaxe")))) {
				_event.addModifier(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_KNOCKBACK,
						(new AttributeModifier(UUID.fromString("97d735d8-b44e-4757-947f-40cb848ceb05"), "battleaxe_knockback", 0.65, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:glaive")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("58acd517-0cf6-4f81-8f2b-9f0229a17a60"), "glaive_reach", 1, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:flail")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("fd46c8a4-4adf-429f-9dc2-c114d3840963"), "flail_reach", 0.5, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:longsword")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("9b3aa14c-9fe1-4f3b-90ed-d0f15c0f6ebd"), "longsword_reach", 0.55, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:spear")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("09355bd7-23d8-4077-91f6-b26789822956"), "spear_reach", 1.1, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:throwingknife")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("1d9d7697-3080-4d3f-bdda-adb659874057"), "throwingknife_reach", (-1), AttributeModifier.Operation.ADDITION)));
				_event.addModifier(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED, (new AttributeModifier(UUID.fromString("42593c79-c5a4-4092-a89e-ff0df8caa13f"), "throwingknife_speed", 1, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:dagger")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("48f65eef-7272-48e2-9dab-d9527c1ce7d1"), "dagger_reach", (-1), AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:sickle")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("48f65eef-7272-48e2-9dab-d9527c1ce7d1"), "sickle_reach", (-0.8), AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:lance")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("7445731f-b751-40e4-8a97-323eca6b26cd"), "lance_reach", 1.2, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:parryingdagger")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("b8cc36a4-2975-4405-99a1-766623d56c04"), "parryingdagger_reach", (-1), AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:pike")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("a33a5637-fb3e-48b0-afe1-19a0448b83ab"), "pike_reach", 2.15, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:greatsword")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("7857c6df-5460-42c6-ade9-a4913e43382e"), "greatsword_reach", 0.55, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:javelin")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("ece604ff-18eb-49e8-8796-5be214c5447e"), "javelin_reach", 0.68, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:quarterstaff")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("f4bcdbbb-f83f-4e75-bb5d-7133f21afcf9"), "quarterstaff_reach", 1, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:odachi")))) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("c55a7f3a-027a-4692-b54a-8da8447afdfa"), "odachi_reach", 0.55, AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.getItem() == MortiusWeaponryReduxModItems.TRAITORS_DAGGER.get()) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("5ca64687-abdf-4dd0-ade5-f9cf9cf0cce2"), "traitordagger_reach", (-0.5), AttributeModifier.Operation.ADDITION)));
			}
			if (itemstack.getItem() == MortiusWeaponryReduxModItems.ESTOC.get()) {
				_event.addModifier(ForgeMod.ENTITY_REACH.get(), (new AttributeModifier(UUID.fromString("7b779209-b171-4865-86e9-d89094989e75"), "estoc_reach", 0.6, AttributeModifier.Operation.ADDITION)));
			}
		}
	}
}
