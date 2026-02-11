package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ExecutionerSwordDescriptionProcedure {
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
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:executionersword")))) {
			tooltip.add(Component.literal((" \u00A74" + Component.translatable("item.mortius_weaponry_redux.two_handed2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.on_hit").getString())));
			tooltip.add(Component.literal((" \u00A72" + Component.translatable("item.mortius_weaponry_redux.executioner_sword.special1").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.HEADSMAN.get()) {
			tooltip.add(Component.literal(""));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.headsman.desc").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
	}
}
