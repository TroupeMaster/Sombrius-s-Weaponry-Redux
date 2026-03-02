package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class ParryingDaggerArmorPierceProcedure {
	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:parryingdagger")))) {
			if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:piercing"))) == false
					&& (entity instanceof LivingEntity _entUseItem3 ? _entUseItem3.getUseItem() : ItemStack.EMPTY).getItem() instanceof ShieldItem == false) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:piercing"))), sourceentity),
						Math.round(amount * (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("pierce")));
			}
		}
	}
}
