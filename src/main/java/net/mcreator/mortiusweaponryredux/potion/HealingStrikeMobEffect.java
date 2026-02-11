
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HealingStrikeMobEffect extends MobEffect {
	public HealingStrikeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16733689);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
