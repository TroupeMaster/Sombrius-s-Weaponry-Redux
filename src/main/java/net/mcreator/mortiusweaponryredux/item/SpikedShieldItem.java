
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class SpikedShieldItem extends ShieldItem {
	public SpikedShieldItem() {
		super(new Item.Properties().durability(336));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:planks"))).test(repairitem);
	}
}
