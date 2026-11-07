package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.network.MortiusWeaponryReduxModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

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
		if (entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dashCooldown > 0) {
			{
				var _playerVars = entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElse(null);
				if (_playerVars != null) {
					_playerVars.dashCooldown = entity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dashCooldown - 1;
					_playerVars.markSyncDirty();
				}
			}
		}
	}
}