
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.procedures.HellfireOnEffectActiveTickProcedure;
import net.mcreator.mortiusweaponryredux.procedures.HellfireEffectStartedappliedProcedure;

public class HellfireMobEffect extends MobEffect {
	public HellfireMobEffect() {
		super(MobEffectCategory.HARMFUL, -2415616);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		HellfireEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HellfireOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
