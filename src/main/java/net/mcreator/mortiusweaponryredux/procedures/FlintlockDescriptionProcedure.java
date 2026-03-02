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
public class FlintlockDescriptionProcedure {
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
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.flintlock_pistol.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.flintlock_pistol.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.flintlock_pistol.desc3").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.PEPPERBOX.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.pepperbox.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.pepperbox.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.pepperbox.desc3").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BAYONET_MUSKET.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.musket.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.musket.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.musket.desc3").getString())));
			tooltip.add(Component.literal(("\u00A74" + Component.translatable("item.mortius_weaponry_redux.two_handed2").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.TERZEROL.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.terzerol.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.terzerol.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.terzerol.desc3").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.blunderbuss.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.blunderbuss.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.blunderbuss.desc3").getString())));
			tooltip.add(Component.literal(("\u00A74" + Component.translatable("item.mortius_weaponry_redux.two_handed1").getString())));
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.HAND_CANNON.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.hand_cannon.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.hand_cannon.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.hand_cannon.desc3").getString())));
			tooltip.add(Component.literal(("\u00A74" + Component.translatable("item.mortius_weaponry_redux.two_handed2").getString())));
			tooltip.add(Component.literal(""));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.hand_cannon.desc4").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.ZAFKIEL.get()) {
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.zafkiel.desc1").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.zafkiel.desc2").getString())));
			tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.zafkiel.desc3").getString())));
			tooltip.add(Component.literal(""));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal(("\u00A76" + Component.translatable("item.mortius_weaponry_redux.special_ability").getString())));
				tooltip.add(Component.literal((" \u00A7a-" + Component.translatable("item.mortius_weaponry_redux.zafkiel.desc4").getString())));
			} else {
				tooltip.add(Component.literal(("\u00A77" + Component.translatable("item.mortius_weaponry_redux.show_tooltip").getString())));
			}
		}
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:flintlock")))) {
			if (itemstack.getOrCreateTag().getBoolean("loaded") == true) {
				tooltip.add(Component.literal(("\u00A79" + Component.translatable("item.mortius_weaponry_redux.flintlock.loaded").getString() + ":")));
				FlintlockDescriptionsShowSingleShotProcedure.execute(itemstack, tooltip);
			}
		}
	}
}
