package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.PepperboxItem;

public class PepperboxItemModel extends GeoModel<PepperboxItem> {
	@Override
	public ResourceLocation getAnimationResource(PepperboxItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/pepperbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PepperboxItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/pepperbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PepperboxItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/pepperbox.png");
	}
}
