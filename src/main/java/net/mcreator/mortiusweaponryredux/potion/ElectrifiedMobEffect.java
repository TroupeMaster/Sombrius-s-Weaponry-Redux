
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.procedures.ElectrifiedOnEffectActiveTickProcedure;
import net.mcreator.mortiusweaponryredux.procedures.ElectrifiedEffectStartedappliedProcedure;

public class ElectrifiedMobEffect extends MobEffect {
	public ElectrifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -6097409);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
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
