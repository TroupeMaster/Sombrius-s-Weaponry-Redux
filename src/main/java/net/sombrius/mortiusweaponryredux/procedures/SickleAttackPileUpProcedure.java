package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SickleAttackPileUpProcedure {
	@SubscribeEvent
	public static void entityTakesDamage(LivingDamageEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double amplifier = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:sickle")))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.OPEN_WOUNDS.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
						? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
						: 0) >= 6) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get());
					if (event instanceof LivingDamageEvent _event) {
						_event.setAmount((float) (amount * 0.9));
					}
				} else {
					if (event instanceof LivingDamageEvent _event) {
						_event.setAmount((float) (amount + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
								? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
								: 0)));
					}
					amplifier = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
							? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
							: 0) + 1;
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get());
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get(), 100, (int) (amplifier + 1), false, false));
				}
			} else {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
						? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
						: 0) >= 4) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get());
					if (event instanceof LivingDamageEvent _event) {
						_event.setAmount((float) (amount * 0.8));
					}
				} else {
					if (event instanceof LivingDamageEvent _event) {
						_event.setAmount((float) (amount + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
								? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
								: 0)));
					}
					amplifier = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
							? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
							: 0;
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get());
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get(), 100, (int) (amplifier + 1), false, false));
				}
			}
		}
	}
}