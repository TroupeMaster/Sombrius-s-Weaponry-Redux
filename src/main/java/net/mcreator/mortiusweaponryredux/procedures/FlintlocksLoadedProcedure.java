package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class FlintlocksLoadedProcedure {
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
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:musket_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A78Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:fiery_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A76Fiery Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:cracked_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A78Cracked Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:crystal_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A7dCrystallized Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:hellfire_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A7cHellfire Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:spiked_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A78Spiked Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:end_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A73Ender Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:explosive_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A74Explosive Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:heavy_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A7fHeavy Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.FLINTLOCK_PISTOL.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET.get() || itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getBoolean("mortius:phantom_ball") == true) {
				tooltip.add(Component.literal("Loaded: \u00A7fPhantom Musket Ball"));
			}
		}
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()) {
			if (itemstack.getOrCreateTag().getDouble("mortius:count_total") > 0) {
				tooltip.add(Component.literal("\u00A76Loaded:"));
				if (itemstack.getOrCreateTag().getBoolean("mortius:place1") == true) {
					if (itemstack.getOrCreateTag().getBoolean("mortius:musket1") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:cracked1") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Cracked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:fiery1") == true) {
						tooltip.add(Component.literal(("" + " \u00A76Fiery Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:crystal1") == true) {
						tooltip.add(Component.literal(("" + " \u00A7dCrystallized Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:hellfire1") == true) {
						tooltip.add(Component.literal(("" + " \u00A7cHellfire Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:end1") == true) {
						tooltip.add(Component.literal(("" + " \u00A73Ender Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:spiked1") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Spiked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:explosive1") == true) {
						tooltip.add(Component.literal(("" + " \u00A74Explosive Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:heavy1") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fHeavy Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:phantom1") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fPhantom Musket Ball")));
					}
				}
				if (itemstack.getOrCreateTag().getBoolean("mortius:place2") == true) {
					if (itemstack.getOrCreateTag().getBoolean("mortius:musket2") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:cracked2") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Cracked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:fiery2") == true) {
						tooltip.add(Component.literal(("" + " \u00A76Fiery Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:crystal2") == true) {
						tooltip.add(Component.literal(("" + " \u00A7dCrystallized Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:hellfire2") == true) {
						tooltip.add(Component.literal(("" + " \u00A7cHellfire Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:end2") == true) {
						tooltip.add(Component.literal(("" + " \u00A73Ender Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:spiked2") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Spiked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:explosive2") == true) {
						tooltip.add(Component.literal(("" + " \u00A74Explosive Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:heavy2") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fHeavy Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:phantom2") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fPhantom Musket Ball")));
					}
				}
				if (itemstack.getOrCreateTag().getBoolean("mortius:place3") == true) {
					if (itemstack.getOrCreateTag().getBoolean("mortius:musket3") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:cracked3") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Cracked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:fiery3") == true) {
						tooltip.add(Component.literal(("" + " \u00A76Fiery Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:crystal3") == true) {
						tooltip.add(Component.literal(("" + " \u00A7dCrystallized Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:hellfire3") == true) {
						tooltip.add(Component.literal(("" + " \u00A7cHellfire Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:end3") == true) {
						tooltip.add(Component.literal(("" + " \u00A73Ender Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:spiked3") == true) {
						tooltip.add(Component.literal(("" + " \u00A78Spiked Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:explosive3") == true) {
						tooltip.add(Component.literal(("" + " \u00A74Explosive Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:heavy3") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fHeavy Musket Ball")));
					}
					if (itemstack.getOrCreateTag().getBoolean("mortius:phantom3") == true) {
						tooltip.add(Component.literal(("" + " \u00A7fPhantom Musket Ball")));
					}
				}
			}
		}
	}
}
