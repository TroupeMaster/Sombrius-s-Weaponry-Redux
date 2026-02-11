
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

public class MortiusWeaponryReduxModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<SimpleParticleType> FROST_SHARD = REGISTRY.register("frost_shard", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ESTOC_POINT = REGISTRY.register("estoc_point", () -> new SimpleParticleType(true));
}
