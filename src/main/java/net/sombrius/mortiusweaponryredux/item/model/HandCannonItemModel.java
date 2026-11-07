package net.sombrius.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.cache.GeckoLibCache;

import net.sombrius.mortiusweaponryredux.item.HandCannonItem;

import net.minecraft.resources.ResourceLocation;

public class HandCannonItemModel extends GeoModel<HandCannonItem> {
	private static final ResourceLocation MODEL_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/item/hand_canon.geo.json");
	private static final ResourceLocation ANIM_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/item/hand_canon.animation.json");
	private static final ResourceLocation MODEL_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/entity/hand_canon.geo.json");
	private static final ResourceLocation ANIM_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/entity/hand_canon.animation.json");
	private static final ResourceLocation MODEL_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/hand_canon.geo.json");
	private static final ResourceLocation ANIM_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/hand_canon.animation.json");

	@Override
	public ResourceLocation getModelResource(HandCannonItem animatable) {
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ITEM))
			return MODEL_ITEM;
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ENTITY))
			return MODEL_ENTITY;
		return MODEL_FLAT;
	}

	@Override
	public ResourceLocation getAnimationResource(HandCannonItem animatable) {
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ITEM))
			return ANIM_ITEM;
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ENTITY))
			return ANIM_ENTITY;
		return ANIM_FLAT;
	}

	@Override
	public ResourceLocation getTextureResource(HandCannonItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "textures/item/hand_canon.png");
	}
}