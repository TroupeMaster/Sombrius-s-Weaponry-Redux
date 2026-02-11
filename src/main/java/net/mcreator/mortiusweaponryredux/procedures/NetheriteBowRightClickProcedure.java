package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class NetheriteBowRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("netheriteBowLoading", true);
	}
}
