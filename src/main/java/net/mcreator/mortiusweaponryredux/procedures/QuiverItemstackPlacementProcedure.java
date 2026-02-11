package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class QuiverItemstackPlacementProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:arrows")))) {
			return false;
		}
		return true;
	}
}
