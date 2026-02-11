package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SaberHasteProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:saber")))) {
			if ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) <= 5) {
				if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.QUICK_BLADE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (sourceentity.getPersistentData().getDouble("saber_count") >= 1) {
						sourceentity.getPersistentData().putDouble("saber_count", 0);
						sourceentity.getPersistentData().putDouble("haste_amplifier_saber", (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0));
						if (sourceentity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DIG_SPEED);
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 70, (int) (sourceentity.getPersistentData().getDouble("haste_amplifier_saber") + 1), false, false));
					} else {
						sourceentity.getPersistentData().putDouble("saber_count", (sourceentity.getPersistentData().getDouble("saber_count") + 1));
					}
				} else {
					if (sourceentity.getPersistentData().getDouble("saber_count") >= 2) {
						sourceentity.getPersistentData().putDouble("saber_count", 0);
						sourceentity.getPersistentData().putDouble("haste_amplifier_saber", (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0));
						if (sourceentity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DIG_SPEED);
						if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 50, (int) (sourceentity.getPersistentData().getDouble("haste_amplifier_saber") + 1), false, false));
					} else {
						sourceentity.getPersistentData().putDouble("saber_count", (sourceentity.getPersistentData().getDouble("saber_count") + 1));
					}
				}
			}
		}
	}
}
