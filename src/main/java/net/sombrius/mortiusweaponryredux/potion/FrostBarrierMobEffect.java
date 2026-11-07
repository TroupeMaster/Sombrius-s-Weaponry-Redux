package net.sombrius.mortiusweaponryredux.potion;

import net.sombrius.mortiusweaponryredux.procedures.FrostBarrierOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FrostBarrierMobEffect extends MobEffect {
	public FrostBarrierMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4915206);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrostBarrierOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}