package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FlintlockDescriptionsShowSingleShotProcedure {
	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("musketBall") == 0) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 1) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.cracked_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 2) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.crystallized_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 3) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.fiery_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 4) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.hellfire_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 5) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.spiked_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 6) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.ender_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 7) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.explosive_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 8) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.heavy_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 9) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.phantom_musket_ball").getString())));
		} else if (itemstack.getOrCreateTag().getDouble("musketBall") == 10) {
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.iron_slug").getString())));
		}
	}
}
