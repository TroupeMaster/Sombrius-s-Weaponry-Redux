package net.mcreator.mortiusweaponryredux.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.mortiusweaponryredux.item.ZafkielItem;
import net.mcreator.mortiusweaponryredux.item.TerzerolItem;
import net.mcreator.mortiusweaponryredux.item.PepperboxItem;
import net.mcreator.mortiusweaponryredux.item.MusketItem;
import net.mcreator.mortiusweaponryredux.item.HandCannonItem;
import net.mcreator.mortiusweaponryredux.item.FlintlockPistolItem;
import net.mcreator.mortiusweaponryredux.item.BlunderbussItem;
import net.mcreator.mortiusweaponryredux.item.BayonetMusketItem;

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	public static void disableUseAnim(String hand) {
		ItemInHandRenderer renderer = Minecraft.getInstance().gameRenderer.itemInHandRenderer;
		if (renderer != null) {
			if (hand.equals("right")) {
				renderer.mainHandHeight = 1F;
				renderer.oMainHandHeight = 1F;
			}
			if (hand.equals("left")) {
				renderer.offHandHeight = 1F;
				renderer.oOffHandHeight = 1F;
			}
		}
	}

	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		ItemStack mainhandItem = event.player.getMainHandItem().copy();
		ItemStack offhandItem = event.player.getOffhandItem().copy();
		if (event.phase == TickEvent.Phase.START && (mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem)) {
			if (mainhandItem.getItem() instanceof FlintlockPistolItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((FlintlockPistolItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof FlintlockPistolItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((FlintlockPistolItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof MusketItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((MusketItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof MusketItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((MusketItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof BayonetMusketItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((BayonetMusketItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof BayonetMusketItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((BayonetMusketItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof TerzerolItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TerzerolItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof TerzerolItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TerzerolItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof BlunderbussItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((BlunderbussItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof BlunderbussItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((BlunderbussItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof HandCannonItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HandCannonItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof HandCannonItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HandCannonItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof ZafkielItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((ZafkielItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof ZafkielItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((ZafkielItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof PepperboxItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((PepperboxItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof PepperboxItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((PepperboxItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
		}
	}
}
