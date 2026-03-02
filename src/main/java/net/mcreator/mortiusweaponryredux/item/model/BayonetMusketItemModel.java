package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.BayonetMusketItem;

public class BayonetMusketItemModel extends GeoModel<BayonetMusketItem> {
	@Override
	public ResourceLocation getAnimationResource(BayonetMusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/musket_bayonet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BayonetMusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/musket_bayonet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BayonetMusketItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/musket_bayonet.png");
	}
}
