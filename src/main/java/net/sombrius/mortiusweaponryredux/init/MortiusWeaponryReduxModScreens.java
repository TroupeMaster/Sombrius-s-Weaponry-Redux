/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sombrius.mortiusweaponryredux.init;

import net.sombrius.mortiusweaponryredux.client.gui.QuiverGUIScreen;
import net.sombrius.mortiusweaponryredux.client.gui.OrnateQuiverGUIScreen;
import net.sombrius.mortiusweaponryredux.client.gui.NetheriteQuiverGUIScreen;
import net.sombrius.mortiusweaponryredux.client.gui.MusketBallPouchGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MortiusWeaponryReduxModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MortiusWeaponryReduxModMenus.QUIVER_GUI.get(), QuiverGUIScreen::new);
			MenuScreens.register(MortiusWeaponryReduxModMenus.ORNATE_QUIVER_GUI.get(), OrnateQuiverGUIScreen::new);
			MenuScreens.register(MortiusWeaponryReduxModMenus.NETHERITE_QUIVER_GUI.get(), NetheriteQuiverGUIScreen::new);
			MenuScreens.register(MortiusWeaponryReduxModMenus.MUSKET_BALL_POUCH_GUI.get(), MusketBallPouchGUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}