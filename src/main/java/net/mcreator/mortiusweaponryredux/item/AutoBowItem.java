
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

import net.mcreator.mortiusweaponryredux.procedures.AutoBowStopUsingProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowRightClickProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowPlayerFinishesUsingItemProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowItemIsDroppedByPlayerProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowItemInInventoryTickProcedure;

public class AutoBowItem extends Item {
	public AutoBowItem() {
		super(new Item.Properties().durability(425).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 22;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		AutoBowRightClickProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		AutoBowPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity, itemstack);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AutoBowItemInInventoryTickProcedure.execute(entity, itemstack);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		AutoBowItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		AutoBowStopUsingProcedure.execute(entity, itemstack);
	}
}
