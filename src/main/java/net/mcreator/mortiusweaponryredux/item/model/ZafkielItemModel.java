package net.mcreator.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mortiusweaponryredux.item.ZafkielItem;

public class ZafkielItemModel extends GeoModel<ZafkielItem> {
	@Override
	public ResourceLocation getAnimationResource(ZafkielItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "animations/zafkiel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZafkielItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "geo/zafkiel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZafkielItem animatable) {
		return new ResourceLocation("mortius_weaponry_redux", "textures/item/zafkiel.png");
	}
}
