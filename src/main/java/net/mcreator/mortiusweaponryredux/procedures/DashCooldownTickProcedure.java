package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.network.MortiusWeaponryReduxModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DashCooldownTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dashCooldown > 0) {
			{
				double _setval = (entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dashCooldown - 1;
				entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dashCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
