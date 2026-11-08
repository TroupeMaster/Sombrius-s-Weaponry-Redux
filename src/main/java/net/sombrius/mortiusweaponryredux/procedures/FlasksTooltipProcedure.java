package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class FlasksTooltipProcedure {
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
		if (itemstack.getOrCreateTag().getBoolean("water_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Water"));
		}
		if (itemstack.getOrCreateTag().getBoolean("poison_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Poison"));
		}
		if (itemstack.getOrCreateTag().getBoolean("wither_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Wither"));
		}
		if (itemstack.getOrCreateTag().getBoolean("blindness_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Blindness"));
		}
		if (itemstack.getOrCreateTag().getBoolean("fire_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Fire"));
		}
		if (itemstack.getOrCreateTag().getBoolean("soul_fire_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Soul Fire"));
		}
		if (itemstack.getOrCreateTag().getBoolean("slowness_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Slowness"));
		}
		if (itemstack.getOrCreateTag().getBoolean("slow_falling_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Slow Falling"));
		}
		if (itemstack.getOrCreateTag().getBoolean("glowing_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Glowing"));
		}
		if (itemstack.getOrCreateTag().getBoolean("levitation_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Levitation"));
		}
		if (itemstack.getOrCreateTag().getBoolean("weakness_flask") == true) {
			tooltip.add(Component.literal("\u00A7cImbued with Weakness"));
		}
		if (itemstack.getOrCreateTag().getBoolean("volatile_flask") == true) {
			tooltip.add(Component.literal("\u00A7cMay explode"));
		}
	}
}