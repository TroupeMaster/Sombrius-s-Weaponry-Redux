package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class TwoHandedPenaltyEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttribute(Attributes.ATTACK_DAMAGE).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("46fea582-502e-3291-b5ef-243e7ae12a5d")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("46fea582-502e-3291-b5ef-243e7ae12a5d"));
			}
		}
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttribute(Attributes.ATTACK_SPEED).getModifiers().stream().anyMatch((e) -> e.getId().equals(UUID.fromString("2557d637-5f9f-39c6-a823-fb15cca92f9e")))) {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.ATTACK_SPEED).removeModifier(UUID.fromString("2557d637-5f9f-39c6-a823-fb15cca92f9e"));
			}
		}
	}
}