
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.potion.VulnerabilityMobEffect;
import net.mcreator.mortiusweaponryredux.potion.TwoHandedPenaltyMobEffect;
import net.mcreator.mortiusweaponryredux.potion.TitanbornMobEffect;
import net.mcreator.mortiusweaponryredux.potion.SickleDamageBuildUpMobEffect;
import net.mcreator.mortiusweaponryredux.potion.ParryMobEffect;
import net.mcreator.mortiusweaponryredux.potion.InvulnerabilityMobEffect;
import net.mcreator.mortiusweaponryredux.potion.IncapacitatedMobEffect;
import net.mcreator.mortiusweaponryredux.potion.HellfireMobEffect;
import net.mcreator.mortiusweaponryredux.potion.HealingStrikeMobEffect;
import net.mcreator.mortiusweaponryredux.potion.FrostBarrierMobEffect;
import net.mcreator.mortiusweaponryredux.potion.ElectrifiedMobEffect;
import net.mcreator.mortiusweaponryredux.potion.ChainedMobEffect;
import net.mcreator.mortiusweaponryredux.potion.BleedOutMobEffect;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<MobEffect> SICKLE_DAMAGE_BUILD_UP = REGISTRY.register("sickle_damage_build_up", () -> new SickleDamageBuildUpMobEffect());
	public static final RegistryObject<MobEffect> BLEED_OUT = REGISTRY.register("bleed_out", () -> new BleedOutMobEffect());
	public static final RegistryObject<MobEffect> HEALING_STRIKE = REGISTRY.register("healing_strike", () -> new HealingStrikeMobEffect());
	public static final RegistryObject<MobEffect> FROST_BARRIER = REGISTRY.register("frost_barrier", () -> new FrostBarrierMobEffect());
	public static final RegistryObject<MobEffect> CHAINED = REGISTRY.register("chained", () -> new ChainedMobEffect());
	public static final RegistryObject<MobEffect> HELLFIRE = REGISTRY.register("hellfire", () -> new HellfireMobEffect());
	public static final RegistryObject<MobEffect> ELECTRIFIED = REGISTRY.register("electrified", () -> new ElectrifiedMobEffect());
	public static final RegistryObject<MobEffect> PARRY = REGISTRY.register("parry", () -> new ParryMobEffect());
	public static final RegistryObject<MobEffect> TITANBORN = REGISTRY.register("titanborn", () -> new TitanbornMobEffect());
	public static final RegistryObject<MobEffect> INVULNERABILITY = REGISTRY.register("invulnerability", () -> new InvulnerabilityMobEffect());
	public static final RegistryObject<MobEffect> VULNERABILITY = REGISTRY.register("vulnerability", () -> new VulnerabilityMobEffect());
	public static final RegistryObject<MobEffect> INCAPACITATED = REGISTRY.register("incapacitated", () -> new IncapacitatedMobEffect());
	public static final RegistryObject<MobEffect> TWO_HANDED_PENALTY = REGISTRY.register("two_handed_penalty", () -> new TwoHandedPenaltyMobEffect());
}
