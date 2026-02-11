
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MortiusWeaponryReduxModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(MortiusWeaponryReduxModItems.SHORT_BARREL.get()), new ItemStack(MortiusWeaponryReduxModItems.LONG_BARREL.get()), 2, 15, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(MortiusWeaponryReduxModItems.SHORT_BARREL.get()), new ItemStack(MortiusWeaponryReduxModItems.BLUNDERBUSS_BARREL.get()), 2, 10, 0.05f));
		}
	}
}
