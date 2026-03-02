package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.TerzerolItem;

public class TerzerolItemModel extends GeoModel<TerzerolItem> {
	@Override
	public ResourceLocation getAnimationResource(TerzerolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/terzerol.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerzerolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/terzerol.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerzerolItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/terzerol.png");
	}
}
