package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DragonbornLivingEntityIsHitWithToolProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DRAGONBORN.get()) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.DRAGONBORN.get()) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
						(float) (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0
								? 10 + 0.5 * (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.SHARPNESS) + 0.5
								: 10));
			} else {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), sourceentity),
						(float) (7 / ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get())
								? _livEnt.getEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()).getAmplifier()
								: 0) + 1)));
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
				entity.setSecondsOnFire(5);
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.COMBO.get(), 20, 0, false, true));
			{
				ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem(), 10);
		}
	}
}
