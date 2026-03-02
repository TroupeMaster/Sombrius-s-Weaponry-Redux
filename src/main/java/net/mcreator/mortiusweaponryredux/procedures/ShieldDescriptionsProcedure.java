package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ShieldDescriptionsProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.NETHERITE_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.netherite_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.explosive_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.BUCKLER.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.buckler.desc1").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.buckler.desc2").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.DIAMOND_BUCKLER.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.buckler.desc1").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.buckler.desc2").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.SPIKED_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.spiked_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ENDER_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.ender_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.LIVING_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.spiked_shield.desc").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.living_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ASSAULT_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.assault_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.SEALED_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.sealed_shield.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
	}
}
