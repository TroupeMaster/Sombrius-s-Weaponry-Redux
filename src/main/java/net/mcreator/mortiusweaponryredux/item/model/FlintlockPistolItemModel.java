package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.FlintlockPistolItem;

public class FlintlockPistolItemModel extends GeoModel<FlintlockPistolItem> {
	@Override
	public ResourceLocation getAnimationResource(FlintlockPistolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/flintlock_pistol.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlintlockPistolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/flintlock_pistol.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlintlockPistolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/flintlock_pistol.png");
	}
}
