package net.sombrius.mortiusweaponryredux.potion;

import net.sombrius.mortiusweaponryredux.procedures.IncapacitatedOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class IncapacitatedMobEffect extends MobEffect {
	public IncapacitatedMobEffect() {
		super(MobEffectCategory.HARMFUL, -4868459);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		IncapacitatedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}