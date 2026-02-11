
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<SoundEvent> FLINTLOCK_PISTOL_SHOOT = REGISTRY.register("flintlock_pistol_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "flintlock_pistol_shoot")));
	public static final RegistryObject<SoundEvent> MUSKET_SHOOT = REGISTRY.register("musket_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "musket_shoot")));
	public static final RegistryObject<SoundEvent> BLUNDERBUSS_SHOOT = REGISTRY.register("blunderbuss_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "blunderbuss_shoot")));
	public static final RegistryObject<SoundEvent> BLUNDERBUSS_SHOOT_NEW = REGISTRY.register("blunderbuss_shoot_new", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "blunderbuss_shoot_new")));
	public static final RegistryObject<SoundEvent> ZAFKIEL_PISTOL_SHOOT = REGISTRY.register("zafkiel_pistol_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "zafkiel_pistol_shoot")));
	public static final RegistryObject<SoundEvent> SLASH = REGISTRY.register("slash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "slash")));
	public static final RegistryObject<SoundEvent> ESTOC_AFTER_IMAGE = REGISTRY.register("estoc_after_image", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "estoc_after_image")));
	public static final RegistryObject<SoundEvent> ZAFKIEL_SHOOT = REGISTRY.register("zafkiel_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "zafkiel_shoot")));
	public static final RegistryObject<SoundEvent> ZAFKIEL_CLOCK_APPEAR = REGISTRY.register("zafkiel_clock_appear", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mortius_weaponry_redux", "zafkiel_clock_appear")));
}
