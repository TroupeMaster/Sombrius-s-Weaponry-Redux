package net.sombrius.mortiusweaponryredux.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OpportunityAttackMobEffect extends MobEffect {
	public OpportunityAttackMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10496);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "ba933f4f-e995-32bb-b411-c495b408af2c", 3, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}