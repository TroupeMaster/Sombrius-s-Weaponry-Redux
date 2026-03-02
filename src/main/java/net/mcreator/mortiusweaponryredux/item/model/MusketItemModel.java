package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.MusketItem;

public class MusketItemModel extends GeoModel<MusketItem> {
	@Override
	public ResourceLocation getAnimationResource(MusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/musket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/musket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/musket.png");
	}
}
