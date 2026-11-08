package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;
import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.sombrius.mortiusweaponryredux.MortiusWeaponryReduxMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Comparator;

public class SeraphRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.SERAPH.get(),
					(int) (EnchantmentHelper.getItemEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get(), itemstack) != 0 ? 200d / (itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1) : 200));
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 3), 3, (Math.cos(Math.toRadians(entity.getYRot())) * 3)));
		{
			final Vec3 _center = new Vec3(
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof LivingEntity && !(entityiterator == entity)) {
					entityiterator
							.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), entity), 8);
					entityiterator.setSecondsOnFire(10);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MortiusWeaponryReduxModMobEffects.BLEED_OUT.get(), 200, 0));
				}
			}
		}
		MortiusWeaponryReduxMod.queueServerWork(20, () -> {
			itemstack.getOrCreateTag().putBoolean("seraphRage", true);
		});
	}
}