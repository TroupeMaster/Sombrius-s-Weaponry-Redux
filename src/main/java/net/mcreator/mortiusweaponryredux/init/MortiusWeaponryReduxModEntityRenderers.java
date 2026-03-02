
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mortiusweaponryredux.client.renderer.WoodenThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.WoodenJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.WoodenChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.StoneThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.StoneJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.StoneChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.SteelJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.SlugRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.SilverJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.RoseGoldJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.ObsidianKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.NetheriteThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.NetheriteJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.NetheriteChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.NetheriteArrowRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.IronThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.IronJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.IronChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.IronArrowRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.GoldenThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.GoldenJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.GoldenChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.GhostlyDaggerRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.DiamondThrowingKnifeProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.DiamondJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.DiamondChakramProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.DiamondArrowRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.CopperJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.CopperArrowRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.CannonballRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.BronzeJavelinProjRenderer;
import net.mcreator.mortiusweaponryredux.client.renderer.AutoArrowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MortiusWeaponryReduxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.CRACKED_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.MUSKET_BALL_PIECE_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.FIERY_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.CRYSTALLIZED_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.CRYSTAL_PIECE_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.HELLFIRE_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.HELLFIRE_FLAME.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.ENDER_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.SPIKED_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.EXPLOSIVE_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.HEAVY_MUSKET_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.GHOSTLY_DAGGER.get(), GhostlyDaggerRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.CUTTING_DASH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.WATER_WAVE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.ESTOC_POINT_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.IRON_ARROW.get(), IronArrowRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.NETHERITE_ARROW.get(), NetheriteArrowRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.DIAMOND_ARROW.get(), DiamondArrowRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.AUTO_ARROW.get(), AutoArrowRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.PHANTOM_BALL_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.WOODEN_CHAKRAM_PROJ.get(), WoodenChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.STONE_CHAKRAM_PROJ.get(), StoneChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.GOLDEN_CHAKRAM_PROJ.get(), GoldenChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.IRON_CHAKRAM_PROJ.get(), IronChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.DIAMOND_CHAKRAM_PROJ.get(), DiamondChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.NETHERITE_CHAKRAM_PROJ.get(), NetheriteChakramProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.WOODEN_THROWING_KNIFE_PROJ.get(), WoodenThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.STONE_THROWING_KNIFE_PROJ.get(), StoneThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.GOLDEN_THROWING_KNIFE_PROJ.get(), GoldenThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.IRON_THROWING_KNIFE_PROJ.get(), IronThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.DIAMOND_THROWING_KNIFE_PROJ.get(), DiamondThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.NETHERITE_THROWING_KNIFE_PROJ.get(), NetheriteThrowingKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.OBSIDIAN_KNIFE_PROJ.get(), ObsidianKnifeProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.WOODEN_JAVELIN_PROJ.get(), WoodenJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.STONE_JAVELIN_PROJ.get(), StoneJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.GOLDEN_JAVELIN_PROJ.get(), GoldenJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.IRON_JAVELIN_PROJ.get(), IronJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.DIAMOND_JAVELIN_PROJ.get(), DiamondJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.NETHERITE_JAVELIN_PROJ.get(), NetheriteJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.STEEL_JAVELIN_PROJ.get(), SteelJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.BRONZE_JAVELIN_PROJ.get(), BronzeJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.SILVER_JAVELIN_PROJ.get(), SilverJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.ROSE_GOLD_JAVELIN_PROJ.get(), RoseGoldJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.COPPER_JAVELIN_PROJ.get(), CopperJavelinProjRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.COPPER_ARROW.get(), CopperArrowRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.SLUG.get(), SlugRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.CANNONBALL.get(), CannonballRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.TIME_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MortiusWeaponryReduxModEntities.ENDER_FIREBALL.get(), ThrownItemRenderer::new);
	}
}
