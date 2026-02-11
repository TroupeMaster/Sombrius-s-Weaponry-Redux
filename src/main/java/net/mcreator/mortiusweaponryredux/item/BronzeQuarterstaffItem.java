
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.procedures.WoodenQuarterstaffLivingEntityIsHitWithToolProcedure;

public class BronzeQuarterstaffItem extends SwordItem {
	public BronzeQuarterstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 350;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return -0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/bronze")));
			}
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WoodenQuarterstaffLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
