package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.HandCannonItem;

public class HandCannonItemModel extends GeoModel<HandCannonItem> {
	@Override
	public ResourceLocation getAnimationResource(HandCannonItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/hand_canon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HandCannonItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/hand_canon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HandCannonItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/hand_canon.png");
	}
}
