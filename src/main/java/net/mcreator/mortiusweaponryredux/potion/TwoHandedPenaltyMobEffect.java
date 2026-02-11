
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.mortiusweaponryredux.procedures.TwoHandedPenaltyEffectStartedappliedProcedure;
import net.mcreator.mortiusweaponryredux.procedures.TwoHandedPenaltyEffectExpiresProcedure;

public class TwoHandedPenaltyMobEffect extends MobEffect {
	public TwoHandedPenaltyMobEffect() {
		super(MobEffectCategory.HARMFUL, -11599872);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TwoHandedPenaltyEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TwoHandedPenaltyEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
