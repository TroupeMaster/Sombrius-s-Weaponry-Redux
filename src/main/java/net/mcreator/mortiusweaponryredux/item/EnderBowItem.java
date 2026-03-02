
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mortiusweaponryredux.procedures.EnderBowStopProcedure;
import net.mcreator.mortiusweaponryredux.procedures.EnderBowRightClickProcedure;
import net.mcreator.mortiusweaponryredux.procedures.EnderBowInInventoryProcedure;

public class EnderBowItem extends Item {
	public EnderBowItem() {
		super(new Item.Properties().durability(1561).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		EnderBowRightClickProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnderBowInInventoryProcedure.execute(entity, itemstack);
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		EnderBowStopProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
