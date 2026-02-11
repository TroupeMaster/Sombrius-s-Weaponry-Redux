package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class AutoBowRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("autoBowLoading", true);
	}
}
