package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TwoHandedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:twohanded1")))
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:buckler"))))
				&& !(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MortiusWeaponryReduxModMobEffects.TITANBORN.get()))) {
			if (!(entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get(), 30, 0, false, false));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:twohanded2")))
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:buckler"))))
				&& !(entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MortiusWeaponryReduxModMobEffects.TITANBORN.get()))) {
			if (!(entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.TWO_HANDED_PENALTY.get(), 30, 1, false, false));
			}
		}
	}
}
