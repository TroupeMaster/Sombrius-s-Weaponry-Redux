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
public class MusketBallDescriptionsProcedure {
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
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.CRACKED_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Shatters on impact, sending out lethal shards"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.CRYSTALLIZED_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Shatters on impact, sending out lethal crystal shards"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FIERY_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Sets targets on fire"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.HELLFIRE_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Explodes on impact, sending out burning residue and setting targets on fire"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.SPIKED_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Makes targets bleed"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ENDER_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Switches places with the target"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Explodes on impact"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.HEAVY_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Deals more damage, but doesn't go as far"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.PHANTOM_MUSKET_BALL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A7a-Goes in a straight line"));
			} else {
				tooltip.add(Component.literal("\u00A76Properties:"));
				tooltip.add(Component.literal(" \u00A77Press shift to show tooltip"));
			}
		}
	}
}
