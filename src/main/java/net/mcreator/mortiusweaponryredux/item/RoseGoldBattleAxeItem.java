
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class RoseGoldBattleAxeItem extends AxeItem {
	public RoseGoldBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 11.5f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 1, -2.9f, new Item.Properties());
	}
}
