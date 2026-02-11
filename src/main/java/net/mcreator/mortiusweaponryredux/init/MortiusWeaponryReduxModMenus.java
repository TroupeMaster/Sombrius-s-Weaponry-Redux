
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mortiusweaponryredux.world.inventory.QuiverGUIMenu;
import net.mcreator.mortiusweaponryredux.world.inventory.OrnateQuiverGUIMenu;
import net.mcreator.mortiusweaponryredux.world.inventory.NetheriteQuiverGUIMenu;
import net.mcreator.mortiusweaponryredux.world.inventory.MusketBallPouchGUIMenu;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<MenuType<QuiverGUIMenu>> QUIVER_GUI = REGISTRY.register("quiver_gui", () -> IForgeMenuType.create(QuiverGUIMenu::new));
	public static final RegistryObject<MenuType<OrnateQuiverGUIMenu>> ORNATE_QUIVER_GUI = REGISTRY.register("ornate_quiver_gui", () -> IForgeMenuType.create(OrnateQuiverGUIMenu::new));
	public static final RegistryObject<MenuType<NetheriteQuiverGUIMenu>> NETHERITE_QUIVER_GUI = REGISTRY.register("netherite_quiver_gui", () -> IForgeMenuType.create(NetheriteQuiverGUIMenu::new));
	public static final RegistryObject<MenuType<MusketBallPouchGUIMenu>> MUSKET_BALL_POUCH_GUI = REGISTRY.register("musket_ball_pouch_gui", () -> IForgeMenuType.create(MusketBallPouchGUIMenu::new));
}
