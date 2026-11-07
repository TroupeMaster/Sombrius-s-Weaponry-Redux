package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class TwoHandedPenaltyEffectStartedappliedProcedure {
	public static void execute(Entity entity, double amplifier) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttribute(Attributes.ATTACK_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("2557d637-5f9f-39c6-a823-fb15cca92f9e"))))) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(UUID.fromString("2557d637-5f9f-39c6-a823-fb15cca92f9e"), "mortius_weaponry_redux:two_handed_penalty_attack_speed", ((amplifier + 1) * 0.8 * (-0.4)),
						AttributeModifier.Operation.ADDITION);
				if (!_entity.getAttribute(Attributes.ATTACK_SPEED).hasModifier(modifier)) {
					_entity.getAttribute(Attributes.ATTACK_SPEED).addPermanentModifier(modifier);
				}
			}
		}
		if (!(entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("46fea582-502e-3291-b5ef-243e7ae12a5d"))))) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(UUID.fromString("46fea582-502e-3291-b5ef-243e7ae12a5d"), "mortius_weaponry_redux:two_handed_penalty_attack_damage", ((amplifier + 1) * (-2)), AttributeModifier.Operation.ADDITION);
				if (!_entity.getAttribute(Attributes.ATTACK_DAMAGE).hasModifier(modifier)) {
					_entity.getAttribute(Attributes.ATTACK_DAMAGE).addPermanentModifier(modifier);
				}
			}
		}
	}
}