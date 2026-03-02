package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.BlunderbussItem;

public class BlunderbussItemModel extends GeoModel<BlunderbussItem> {
	@Override
	public ResourceLocation getAnimationResource(BlunderbussItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/blunderbuss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlunderbussItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/blunderbuss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlunderbussItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/blunderbuss.png");
	}
}
