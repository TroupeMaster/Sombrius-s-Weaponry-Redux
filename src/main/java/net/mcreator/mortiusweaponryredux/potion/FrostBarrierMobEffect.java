
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.procedures.FrostBarrierOnEffectActiveTickProcedure;

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
