
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.procedures.IncapacitatedOnEffectActiveTickProcedure;

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
