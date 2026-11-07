package net.sombrius.mortiusweaponryredux.potion;

import net.sombrius.mortiusweaponryredux.procedures.ElectrifiedOnEffectActiveTickProcedure;
import net.sombrius.mortiusweaponryredux.procedures.ElectrifiedEffectStartedappliedProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ElectrifiedMobEffect extends MobEffect {
	public ElectrifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -6097409);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		ElectrifiedEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ElectrifiedOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}