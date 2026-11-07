package net.sombrius.mortiusweaponryredux.item;

import net.sombrius.mortiusweaponryredux.procedures.LevitationFlaskProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FlaskOfLevitationItem extends Item {
	public FlaskOfLevitationItem() {
		super(new Item.Properties().stacksTo(16));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.mortius_weaponry_redux.flask_of_levitation.description_0"));
		list.add(Component.translatable("item.mortius_weaponry_redux.flask_of_levitation.description_1"));
		list.add(Component.translatable("item.mortius_weaponry_redux.flask_of_levitation.description_2"));
		list.add(Component.translatable("item.mortius_weaponry_redux.flask_of_levitation.description_3"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		LevitationFlaskProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}