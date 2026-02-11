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

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SchiavonaDescriptionProcedure {
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
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:schiavona")))) {
			tooltip.add(Component.literal((" \u00A72" + Component.translatable("item.mortius_weaponry_redux.schiavona.stat1").getString())));
			tooltip.add(Component.literal((" \u00A72" + Component.translatable("item.mortius_weaponry_redux.schiavona.stat2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.on_hit").getString())));
			tooltip.add(Component.literal((" \u00A72" + Component.translatable("item.mortius_weaponry_redux.sweep").getString())));
		}
	}
}
