
package net.mcreator.mortiusweaponryredux.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mortiusweaponryredux.procedures.MusketBallsRightClickProcedure;

public class HeavyMusketBallItem extends Item {
	public HeavyMusketBallItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MusketBallsRightClickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
