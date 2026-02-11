package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.mortiusweaponryredux.network.MortiusWeaponryReduxModVariables;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerHasDpsMeterProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity sourceentity, double amount) {
		execute(null, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity sourceentity, double amount) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MortiusWeaponryReduxModItems.DPS_METER.get())) : false) && (sourceentity instanceof Player || sourceentity instanceof ServerPlayer)) {
			if ((sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_first == false) {
				{
					boolean _setval = true;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_first = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = amount;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_count = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if ((sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_second == false) {
				{
					boolean _setval = true;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_second = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = amount;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_count_second = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
			if ((sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_first == true
					&& (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_second == true) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("DPS: " + ((sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_count
							+ (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MortiusWeaponryReduxModVariables.PlayerVariables())).dps_count_second) / 2)), true);
				{
					boolean _setval = false;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_first = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = false;
					sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dps_second = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
