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
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Gives resistance when blocking"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Explodes randomly when blocking"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.BUCKLER.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Can be used with two-handed weapons"));
				tooltip.add(Component.literal(" \u00A7a-Only blocks half of the damage"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.DIAMOND_BUCKLER.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Can be used with two-handed weapons"));
				tooltip.add(Component.literal(" \u00A7a-Blocks a bit more than half of the damage"));
				tooltip.add(Component.literal(" \u00A7a-The user's speed is only slightly reduced when using the shield"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.SPIKED_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Deals damage when blocking"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ENDER_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Teleports the user behind the attacker when blocking"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.LIVING_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Deals damage when blocking"));
				tooltip.add(Component.literal(" \u00A7a-Attacking with the shield will repair the shield"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ASSAULT_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Dash when blocking, pushing foes away"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.SEALED_SHIELD.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Chains the fate of the user with their foe"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
	}
}
