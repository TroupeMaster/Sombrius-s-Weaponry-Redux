package net.sombrius.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.cache.GeckoLibCache;

import net.sombrius.mortiusweaponryredux.item.TerzerolItem;

import net.minecraft.resources.ResourceLocation;

public class TerzerolItemModel extends GeoModel<TerzerolItem> {
	private static final ResourceLocation MODEL_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/item/terzerol.geo.json");
	private static final ResourceLocation ANIM_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/item/terzerol.animation.json");
	private static final ResourceLocation MODEL_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/entity/terzerol.geo.json");
	private static final ResourceLocation ANIM_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/entity/terzerol.animation.json");
	private static final ResourceLocation MODEL_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/terzerol.geo.json");
	private static final ResourceLocation ANIM_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/terzerol.animation.json");

	@Override
	public ResourceLocation getModelResource(TerzerolItem animatable) {
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ITEM))
			return MODEL_ITEM;
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ENTITY))
			return MODEL_ENTITY;
		return MODEL_FLAT;
	}

	@Override
	public ResourceLocation getAnimationResource(TerzerolItem animatable) {
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ITEM))
			return ANIM_ITEM;
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ENTITY))
			return ANIM_ENTITY;
		return ANIM_FLAT;
	}

	@Override
	public ResourceLocation getTextureResource(TerzerolItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "textures/item/terzerol.png");
	}
}