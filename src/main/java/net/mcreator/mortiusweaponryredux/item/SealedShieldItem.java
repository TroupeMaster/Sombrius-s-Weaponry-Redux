
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.procedures.SealedShieldToolInInventoryTickProcedure;

public class SealedShieldItem extends ShieldItem {
	public SealedShieldItem() {
		super(new Item.Properties().durability(672).fireResistant());
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Blocks.OBSIDIAN)).test(repairitem);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SealedShieldToolInInventoryTickProcedure.execute(entity, itemstack);
	}
}
