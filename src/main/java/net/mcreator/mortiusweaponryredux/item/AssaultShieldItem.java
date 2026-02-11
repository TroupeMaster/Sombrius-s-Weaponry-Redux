
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mortiusweaponryredux.procedures.AssaultShieldRightclickedProcedure;

public class AssaultShieldItem extends ShieldItem {
	public AssaultShieldItem() {
		super(new Item.Properties().durability(672).fireResistant());
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Blocks.OBSIDIAN)).test(repairitem);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AssaultShieldRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
