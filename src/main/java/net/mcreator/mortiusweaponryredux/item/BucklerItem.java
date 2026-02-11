
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BucklerItem extends ShieldItem {
	public BucklerItem() {
		super(new Item.Properties().durability(148));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.COPPER_INGOT)).test(repairitem);
	}
}
