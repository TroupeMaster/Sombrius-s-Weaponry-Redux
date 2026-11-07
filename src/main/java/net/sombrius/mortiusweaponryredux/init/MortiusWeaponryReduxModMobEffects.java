/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sombrius.mortiusweaponryredux.init;

import net.sombrius.mortiusweaponryredux.potion.*;
import net.sombrius.mortiusweaponryredux.MortiusWeaponryReduxMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class MortiusWeaponryReduxModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<MobEffect> SICKLE_DAMAGE_BUILD_UP = REGISTRY.register("sickle_damage_build_up", SickleDamageBuildUpMobEffect::new);
	public static final RegistryObject<MobEffect> BLEED_OUT = REGISTRY.register("bleed_out", BleedOutMobEffect::new);
	public static final RegistryObject<MobEffect> HEALING_STRIKE = REGISTRY.register("healing_strike", HealingStrikeMobEffect::new);
	public static final RegistryObject<MobEffect> FROST_BARRIER = REGISTRY.register("frost_barrier", FrostBarrierMobEffect::new);
	public static final RegistryObject<MobEffect> CHAINED = REGISTRY.register("chained", ChainedMobEffect::new);
	public static final RegistryObject<MobEffect> HELLFIRE = REGISTRY.register("hellfire", HellfireMobEffect::new);
	public static final RegistryObject<MobEffect> ELECTRIFIED = REGISTRY.register("electrified", ElectrifiedMobEffect::new);
	public static final RegistryObject<MobEffect> PARRY = REGISTRY.register("parry", ParryMobEffect::new);
	public static final RegistryObject<MobEffect> TITANBORN = REGISTRY.register("titanborn", TitanbornMobEffect::new);
	public static final RegistryObject<MobEffect> INVULNERABILITY = REGISTRY.register("invulnerability", InvulnerabilityMobEffect::new);
	public static final RegistryObject<MobEffect> VULNERABILITY = REGISTRY.register("vulnerability", VulnerabilityMobEffect::new);
	public static final RegistryObject<MobEffect> INCAPACITATED = REGISTRY.register("incapacitated", IncapacitatedMobEffect::new);
	public static final RegistryObject<MobEffect> TWO_HANDED_PENALTY = REGISTRY.register("two_handed_penalty", TwoHandedPenaltyMobEffect::new);
	public static final RegistryObject<MobEffect> COMBO = REGISTRY.register("combo", ComboMobEffect::new);
	public static final RegistryObject<MobEffect> OPPORTUNITY_ATTACK = REGISTRY.register("opportunity_attack", OpportunityAttackMobEffect::new);
}