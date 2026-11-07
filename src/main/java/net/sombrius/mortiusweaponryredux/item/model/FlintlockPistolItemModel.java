package net.sombrius.mortiusweaponryredux.item.model;

import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.cache.GeckoLibCache;

import net.sombrius.mortiusweaponryredux.item.FlintlockPistolItem;

import net.minecraft.resources.ResourceLocation;

public class FlintlockPistolItemModel extends GeoModel<FlintlockPistolItem> {
	private static final ResourceLocation MODEL_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/item/flintlock_pistol.geo.json");
	private static final ResourceLocation ANIM_ITEM = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/item/flintlock_pistol.animation.json");
	private static final ResourceLocation MODEL_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/entity/flintlock_pistol.geo.json");
	private static final ResourceLocation ANIM_ENTITY = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/entity/flintlock_pistol.animation.json");
	private static final ResourceLocation MODEL_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "geo/flintlock_pistol.geo.json");
	private static final ResourceLocation ANIM_FLAT = ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "animations/flintlock_pistol.animation.json");

	@Override
	public ResourceLocation getModelResource(FlintlockPistolItem animatable) {
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ITEM))
			return MODEL_ITEM;
		if (GeckoLibCache.getBakedModels().containsKey(MODEL_ENTITY))
			return MODEL_ENTITY;
		return MODEL_FLAT;
	}

	@Override
	public ResourceLocation getAnimationResource(FlintlockPistolItem animatable) {
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ITEM))
			return ANIM_ITEM;
		if (GeckoLibCache.getBakedAnimations().containsKey(ANIM_ENTITY))
			return ANIM_ENTITY;
		return ANIM_FLAT;
	}

	@Override
	public ResourceLocation getTextureResource(FlintlockPistolItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("mortius_weaponry_redux", "textures/item/flintlock_pistol.png");
	}
}