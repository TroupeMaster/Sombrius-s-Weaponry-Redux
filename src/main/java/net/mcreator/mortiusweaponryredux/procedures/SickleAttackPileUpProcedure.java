package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SickleAttackPileUpProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		double amplifier = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:sickle")))) {
			if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))) == false) {
				if (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.OPEN_WOUNDS.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
							? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
							: 0) >= 6) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get());
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								5);
					} else {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						{
							ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								(float) (amount + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
										? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
										: 0)));
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
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								4);
					} else {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						{
							ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						entity.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
								(float) (amount + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get())
										? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.SICKLE_DAMAGE_BUILD_UP.get()).getAmplifier()
										: 0)));
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
}
