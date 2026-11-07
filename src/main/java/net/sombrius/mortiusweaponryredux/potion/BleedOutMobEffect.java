package net.sombrius.mortiusweaponryredux.potion;

import net.sombrius.mortiusweaponryredux.procedures.BleedOutOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedOutMobEffect extends MobEffect {
	public BleedOutMobEffect() {
		super(MobEffectCategory.HARMFUL, -9830400);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedOutOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}