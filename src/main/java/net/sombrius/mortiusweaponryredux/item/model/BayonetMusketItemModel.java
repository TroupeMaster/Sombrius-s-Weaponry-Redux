package net.sombrius.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.cache.GeckoLibCache;

import net.sombrius.mortiusweaponryredux.item.BayonetMusketItem;

import net.minecraft.resources.ResourceLocation;

public class BayonetMusketItemModel extends GeoModel<BayonetMusketItem> {
	private static final ResourceLocation MODEL_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/item/musket_bayonet.geo.json");
	private static final ResourceLocation ANIM_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/item/musket_bayonet.animation.json");
	private static final ResourceLocation MODEL_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/entity/musket_bayonet.geo.json");
	private static final ResourceLocation ANIM_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/entity/musket_bayonet.animation.json");
	private static final ResourceLocation MODEL_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/musket_bayonet.geo.json");
	private static final ResourceLocation ANIM_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/musket_bayonet.animation.json");

	@Override
	public ResourceLocation getModelResource(BayonetMusketItem animatable) {
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ITEM))
			return MODEL_ITEM;
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ENTITY))
			return MODEL_ENTITY;
		return MODEL_FLAT;
	}

	@Override
	public ResourceLocation getAnimationResource(BayonetMusketItem animatable) {
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ITEM))
			return ANIM_ITEM;
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ENTITY))
			return ANIM_ENTITY;
		return ANIM_FLAT;
	}

	@Override
	public ResourceLocation getTextureResource(BayonetMusketItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "textures/item/musket_bayonet.png");
	}
}