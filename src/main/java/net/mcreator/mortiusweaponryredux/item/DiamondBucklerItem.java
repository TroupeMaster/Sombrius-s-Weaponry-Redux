
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.procedures.DiamondBucklerToolInInventoryTickProcedure;

public class DiamondBucklerItem extends ShieldItem {
	public DiamondBucklerItem() {
		super(new Item.Properties().durability(415));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.DIAMOND)).test(repairitem);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DiamondBucklerToolInInventoryTickProcedure.execute(entity);
	}
}
