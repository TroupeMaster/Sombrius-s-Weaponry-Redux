
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.mortiusweaponryredux.enchantment.SwiftnessEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.SpikedEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.SoldiersInstinctEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.QuickBladeEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.OpenWoundsEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.HeavyBlowEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.ExecutionEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.DarkHarvestEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.BreachEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.BashingEnchantment;
import net.mcreator.mortiusweaponryredux.enchantment.AssassinationEnchantment;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<Enchantment> SOLDIERS_INSTINCT = REGISTRY.register("soldiers_instinct", () -> new SoldiersInstinctEnchantment());
	public static final RegistryObject<Enchantment> ASSASSINATION = REGISTRY.register("assassination", () -> new AssassinationEnchantment());
	public static final RegistryObject<Enchantment> BREACH = REGISTRY.register("breach", () -> new BreachEnchantment());
	public static final RegistryObject<Enchantment> OPEN_WOUNDS = REGISTRY.register("open_wounds", () -> new OpenWoundsEnchantment());
	public static final RegistryObject<Enchantment> DARK_HARVEST = REGISTRY.register("dark_harvest", () -> new DarkHarvestEnchantment());
	public static final RegistryObject<Enchantment> QUICK_BLADE = REGISTRY.register("quick_blade", () -> new QuickBladeEnchantment());
	public static final RegistryObject<Enchantment> EXECUTION = REGISTRY.register("execution", () -> new ExecutionEnchantment());
	public static final RegistryObject<Enchantment> HEAVY_BLOW = REGISTRY.register("heavy_blow", () -> new HeavyBlowEnchantment());
	public static final RegistryObject<Enchantment> SWIFTNESS = REGISTRY.register("swiftness", () -> new SwiftnessEnchantment());
	public static final RegistryObject<Enchantment> BASHING = REGISTRY.register("bashing", () -> new BashingEnchantment());
	public static final RegistryObject<Enchantment> SPIKED = REGISTRY.register("spiked", () -> new SpikedEnchantment());
}
