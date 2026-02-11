
package net.mcreator.mortiusweaponryredux.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TitanbornMobEffect extends MobEffect {
	public TitanbornMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13228763);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
