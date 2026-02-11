package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

import java.util.UUID;

public class TwoHandedPenaltyEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).getModifier(UUID.fromString("be103157-8af0-4eef-8ce8-40a29d149939")) != null)) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier() : 0) > 0) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).hasModifier((new AttributeModifier(UUID.fromString("be103157-8af0-4eef-8ce8-40a29d149939"), "twohanded_speed", ((-0.4)
						* ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier() : 0)
								+ 1)
						* 0.8), AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED)
							.addTransientModifier((new AttributeModifier(UUID.fromString("be103157-8af0-4eef-8ce8-40a29d149939"), "twohanded_speed",
									((-0.4) * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get())
											? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier()
											: 0) + 1) * 0.8),
									AttributeModifier.Operation.ADDITION)));
			} else {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED)
						.hasModifier((new AttributeModifier(UUID.fromString("be103157-8af0-4eef-8ce8-40a29d149939"), "twohanded_speed", (-0.4), AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED)
							.addTransientModifier((new AttributeModifier(UUID.fromString("be103157-8af0-4eef-8ce8-40a29d149939"), "twohanded_speed", (-0.4), AttributeModifier.Operation.ADDITION)));
			}
		}
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getModifier(UUID.fromString("efe7d52c-ae2d-4c26-9e19-148cb405c6b6")) != null)) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier() : 0) > 0) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier((new AttributeModifier(UUID.fromString("efe7d52c-ae2d-4c26-9e19-148cb405c6b6"), "twohanded_damage", ((-2)
						* ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()) ? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier() : 0)
								+ 1)),
						AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
							.addTransientModifier((new AttributeModifier(UUID.fromString("efe7d52c-ae2d-4c26-9e19-148cb405c6b6"), "twohanded_damage",
									((-2) * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get())
											? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier()
											: 0) + 1)),
									AttributeModifier.Operation.ADDITION)));
			} else {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
						.hasModifier((new AttributeModifier(UUID.fromString("efe7d52c-ae2d-4c26-9e19-148cb405c6b6"), "twohanded_damage", (-2), AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
							.addTransientModifier((new AttributeModifier(UUID.fromString("efe7d52c-ae2d-4c26-9e19-148cb405c6b6"), "twohanded_damage", (-2), AttributeModifier.Operation.ADDITION)));
			}
		}
	}
}
