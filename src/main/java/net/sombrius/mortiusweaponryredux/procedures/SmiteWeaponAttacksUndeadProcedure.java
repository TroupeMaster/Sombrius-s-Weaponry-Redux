package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModAttributes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SmiteWeaponAttacksUndeadProcedure {
	@SubscribeEvent
	public static void entityTakesDamage(LivingDamageEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, Entity sourceentity, double amount) {
		execute(null, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(MortiusWeaponryReduxModAttributes.SMITE.get())
				? _livingEntity0.getAttribute(MortiusWeaponryReduxModAttributes.SMITE.get()).getValue()
				: 0) > 0 && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:undead")))) {
			if (event instanceof LivingDamageEvent _event) {
				_event.setAmount((float) (amount + (sourceentity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(MortiusWeaponryReduxModAttributes.SMITE.get())
						? _livingEntity2.getAttribute(MortiusWeaponryReduxModAttributes.SMITE.get()).getValue()
						: 0)));
			}
		}
	}
}