package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraft.world.entity.Entity;

public class IronBowPropertyValueProviderProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getPersistentData().getDouble("ironBowPull") / 22;
	}
}
