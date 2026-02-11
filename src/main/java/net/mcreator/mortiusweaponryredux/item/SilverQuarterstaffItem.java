
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.procedures.WoodenQuarterstaffLivingEntityIsHitWithToolProcedure;
import net.mcreator.mortiusweaponryredux.procedures.SilverWeaponsInInventoryProcedure;

public class SilverQuarterstaffItem extends SwordItem {
	public SilverQuarterstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 180;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return -0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/silver")));
			}
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WoodenQuarterstaffLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SilverWeaponsInInventoryProcedure.execute(itemstack);
	}
}
