package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class BleedOutOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.REGENERATION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HEALTH_BOOST);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HEAL);
	}
}
