package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class MusketBallPlacementProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("mortius_weaponry_redux:musketball")))) {
			return false;
		}
		return true;
	}
}
