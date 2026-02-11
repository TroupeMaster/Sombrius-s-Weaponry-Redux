package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class NetheriteBowPropertyProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getPersistentData().getDouble("netheriteBowPull") / 22;
	}
}
