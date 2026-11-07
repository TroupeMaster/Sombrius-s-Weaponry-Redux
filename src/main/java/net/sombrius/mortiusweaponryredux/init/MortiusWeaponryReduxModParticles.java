/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sombrius.mortiusweaponryredux.init;

import net.sombrius.mortiusweaponryredux.client.particle.*;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MortiusWeaponryReduxModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.FROST_SHARD.get(), FrostShardParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.ESTOC_POINT.get(), EstocPointParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.BELL_RING.get(), BellRingParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.BELL_CLOSE.get(), BellCloseParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME.get(), TimeParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_DUST.get(), TimeDustParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_FLASH.get(), TimeFlashParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_12.get(), TimeLeft12Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_11.get(), TimeLeft11Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_10.get(), TimeLeft10Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_9.get(), TimeLeft9Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_8.get(), TimeLeft8Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_7.get(), TimeLeft7Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_6.get(), TimeLeft6Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_5.get(), TimeLeft5Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_4.get(), TimeLeft4Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_3.get(), TimeLeft3Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_2.get(), TimeLeft2Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_1.get(), TimeLeft1Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.TIME_LEFT_0.get(), TimeLeft0Particle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.BLOOD_SWEEP.get(), BloodSweepParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.BLOODY_CRIT.get(), BloodyCritParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.SMALL_BLOOD_SWEEP.get(), SmallBloodSweepParticle::provider);
		event.registerSpriteSet(MortiusWeaponryReduxModParticleTypes.SMALL_BLOOD_SWEEP_LEFT.get(), SmallBloodSweepLeftParticle::provider);
	}
}