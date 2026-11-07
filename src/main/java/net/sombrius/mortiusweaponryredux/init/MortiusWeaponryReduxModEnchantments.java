/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sombrius.mortiusweaponryredux.init;

import net.sombrius.mortiusweaponryredux.enchantment.*;
import net.sombrius.mortiusweaponryredux.MortiusWeaponryReduxMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class MortiusWeaponryReduxModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<Enchantment> SOLDIERS_INSTINCT = REGISTRY.register("soldiers_instinct", SoldiersInstinctEnchantment::new);
	public static final RegistryObject<Enchantment> ASSASSINATION = REGISTRY.register("assassination", AssassinationEnchantment::new);
	public static final RegistryObject<Enchantment> BREACH = REGISTRY.register("breach", BreachEnchantment::new);
	public static final RegistryObject<Enchantment> OPEN_WOUNDS = REGISTRY.register("open_wounds", OpenWoundsEnchantment::new);
	public static final RegistryObject<Enchantment> DARK_HARVEST = REGISTRY.register("dark_harvest", DarkHarvestEnchantment::new);
	public static final RegistryObject<Enchantment> QUICK_BLADE = REGISTRY.register("quick_blade", QuickBladeEnchantment::new);
	public static final RegistryObject<Enchantment> EXECUTION = REGISTRY.register("execution", ExecutionEnchantment::new);
	public static final RegistryObject<Enchantment> HEAVY_BLOW = REGISTRY.register("heavy_blow", HeavyBlowEnchantment::new);
	public static final RegistryObject<Enchantment> SWIFTNESS = REGISTRY.register("swiftness", SwiftnessEnchantment::new);
	public static final RegistryObject<Enchantment> BASHING = REGISTRY.register("bashing", BashingEnchantment::new);
	public static final RegistryObject<Enchantment> SPIKED = REGISTRY.register("spiked", SpikedEnchantment::new);
	public static final RegistryObject<Enchantment> MARKSMAN = REGISTRY.register("marksman", MarksmanEnchantment::new);
}