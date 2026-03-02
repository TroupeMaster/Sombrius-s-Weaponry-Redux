
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mortiusweaponryredux.client.model.Modelwooden_chakram;
import net.mcreator.mortiusweaponryredux.client.model.Modeltraitor_dagger;
import net.mcreator.mortiusweaponryredux.client.model.Modeltime_castle;
import net.mcreator.mortiusweaponryredux.client.model.Modelthrowing_knife;
import net.mcreator.mortiusweaponryredux.client.model.Modelslug;
import net.mcreator.mortiusweaponryredux.client.model.Modeljavelin;
import net.mcreator.mortiusweaponryredux.client.model.Modelcannonball;
import net.mcreator.mortiusweaponryredux.client.model.Modelarrow;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MortiusWeaponryReduxModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeljavelin.LAYER_LOCATION, Modeljavelin::createBodyLayer);
		event.registerLayerDefinition(Modelslug.LAYER_LOCATION, Modelslug::createBodyLayer);
		event.registerLayerDefinition(Modelcannonball.LAYER_LOCATION, Modelcannonball::createBodyLayer);
		event.registerLayerDefinition(Modelarrow.LAYER_LOCATION, Modelarrow::createBodyLayer);
		event.registerLayerDefinition(Modelwooden_chakram.LAYER_LOCATION, Modelwooden_chakram::createBodyLayer);
		event.registerLayerDefinition(Modeltraitor_dagger.LAYER_LOCATION, Modeltraitor_dagger::createBodyLayer);
		event.registerLayerDefinition(Modelthrowing_knife.LAYER_LOCATION, Modelthrowing_knife::createBodyLayer);
		event.registerLayerDefinition(Modeltime_castle.LAYER_LOCATION, Modeltime_castle::createBodyLayer);
	}
}
