/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sombrius.mortiusweaponryredux.init;

import net.sombrius.mortiusweaponryredux.world.inventory.QuiverGUIMenu;
import net.sombrius.mortiusweaponryredux.world.inventory.OrnateQuiverGUIMenu;
import net.sombrius.mortiusweaponryredux.world.inventory.NetheriteQuiverGUIMenu;
import net.sombrius.mortiusweaponryredux.world.inventory.MusketBallPouchGUIMenu;
import net.sombrius.mortiusweaponryredux.network.MenuStateUpdateMessage;
import net.sombrius.mortiusweaponryredux.MortiusWeaponryReduxMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class MortiusWeaponryReduxModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<MenuType<QuiverGUIMenu>> QUIVER_GUI = REGISTRY.register("quiver_gui", () -> IForgeMenuType.create(QuiverGUIMenu::new));
	public static final RegistryObject<MenuType<OrnateQuiverGUIMenu>> ORNATE_QUIVER_GUI = REGISTRY.register("ornate_quiver_gui", () -> IForgeMenuType.create(OrnateQuiverGUIMenu::new));
	public static final RegistryObject<MenuType<NetheriteQuiverGUIMenu>> NETHERITE_QUIVER_GUI = REGISTRY.register("netherite_quiver_gui", () -> IForgeMenuType.create(NetheriteQuiverGUIMenu::new));
	public static final RegistryObject<MenuType<MusketBallPouchGUIMenu>> MUSKET_BALL_POUCH_GUI = REGISTRY.register("musket_ball_pouch_gui", () -> IForgeMenuType.create(MusketBallPouchGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				MortiusWeaponryReduxMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof MortiusWeaponryReduxModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				MortiusWeaponryReduxMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}