
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

public class RoseGoldQuarterstaffItem extends SwordItem {
	public RoseGoldQuarterstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return -0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/rose_gold")));
			}
		}, 3, -2.3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WoodenQuarterstaffLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
