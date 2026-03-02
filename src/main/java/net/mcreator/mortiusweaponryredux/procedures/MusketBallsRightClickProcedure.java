package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

public class MusketBallsRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == MortiusWeaponryReduxModItems.MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 0);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.CRACKED_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 1);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.CRYSTALLIZED_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 2);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.FIERY_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 3);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.HELLFIRE_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 4);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.SPIKED_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 5);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.ENDER_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 6);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.EXPLOSIVE_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 7);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.HEAVY_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 8);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.PHANTOM_MUSKET_BALL.get()) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 9);
		} else if (itemstack.getItem() == MortiusWeaponryReduxModItems.IRON_SLUG.get() && ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MortiusWeaponryReduxModItems.BLUNDERBUSS.get())) {
			MusketBallRightclickedProcedure.execute(world, x, y, z, entity, 10);
		}
	}
}
