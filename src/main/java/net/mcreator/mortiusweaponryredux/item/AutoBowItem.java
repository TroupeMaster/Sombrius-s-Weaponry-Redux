
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mortiusweaponryredux.procedures.AutoBowStopUsingProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowRightClickProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowPlayerFinishesUsingItemProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowItemIsDroppedByPlayerProcedure;
import net.mcreator.mortiusweaponryredux.procedures.AutoBowItemInInventoryTickProcedure;
import net.mcreator.mortiusweaponryredux.entity.AutoArrowEntity;

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
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.fail(entity.getItemInHand(hand));
		if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
			ar = InteractionResultHolder.success(entity.getItemInHand(hand));
			entity.startUsingItem(hand);
		}
		AutoBowRightClickProcedure.execute(entity);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		AutoBowPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
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
		AutoBowStopUsingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			float pullingPower = BowItem.getPowerForTime(this.getUseDuration(itemstack) - time);
			if (pullingPower < 0.1)
				return;
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				AutoArrowEntity projectile = AutoArrowEntity.shoot(world, entity, world.getRandom(), pullingPower);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				if (player.getAbilities().instabuild) {
					projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
				} else {
					if (stack.isDamageableItem()) {
						if (stack.hurt(1, world.getRandom(), player)) {
							stack.shrink(1);
							stack.setDamageValue(0);
							if (stack.isEmpty())
								player.getInventory().removeItem(stack);
						}
					} else {
						stack.shrink(1);
						if (stack.isEmpty())
							player.getInventory().removeItem(stack);
					}
				}
			}
		}
	}

	private ItemStack findAmmo(Player player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == AutoArrowEntity.PROJECTILE_ITEM.getItem());
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().items.size(); i++) {
				ItemStack teststack = player.getInventory().items.get(i);
				if (teststack != null && teststack.getItem() == AutoArrowEntity.PROJECTILE_ITEM.getItem()) {
					stack = teststack;
					break;
				}
			}
		}
		return stack;
	}
}
