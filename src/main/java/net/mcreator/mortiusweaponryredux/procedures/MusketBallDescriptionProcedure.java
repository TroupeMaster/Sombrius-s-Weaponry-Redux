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

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class MusketBallDescriptionProcedure {
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
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:musketball"))) && !(itemstack.getItem() == MortiusWeaponryReduxModItems.IRON_SLUG.get())) {
			tooltip.add(Component.literal(("\u00A79" + Component.translatable("item.mortius_weaponry_redux.musket_ball.desc1").getString() + ":")));
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.musket_ball.desc2").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.IRON_SLUG.get()) {
			tooltip.add(Component.literal(("\u00A79" + Component.translatable("item.mortius_weaponry_redux.iron_slug.desc1").getString() + ":")));
			tooltip.add(Component.literal((" \u00A77" + Component.translatable("item.mortius_weaponry_redux.musket_ball.desc2").getString())));
		}
	}
}
