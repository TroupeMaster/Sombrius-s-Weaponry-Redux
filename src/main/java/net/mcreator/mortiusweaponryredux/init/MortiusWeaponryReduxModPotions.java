
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<Potion> TITANBORN_POTION = REGISTRY.register("titanborn_potion",
			() -> new Potion(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TITANBORN.get(), 1800, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1800, 0, false, true)));
	public static final RegistryObject<Potion> TITANBORN_POTION_PLUS = REGISTRY.register("titanborn_potion_plus",
			() -> new Potion(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TITANBORN.get(), 3000, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3000, 0, false, true)));
}
