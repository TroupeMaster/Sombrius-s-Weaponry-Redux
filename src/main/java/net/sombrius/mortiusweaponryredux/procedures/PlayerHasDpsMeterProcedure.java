package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.network.MortiusWeaponryReduxModVariables;
import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.NonNullList;

import javax.annotation.Nullable;

import java.util.List;

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
		if (hasEntityInInventory(sourceentity, new ItemStack(MortiusWeaponryReduxModItems.DPS_METER.get())) && (sourceentity instanceof Player || sourceentity instanceof ServerPlayer)) {
			if (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_first == false) {
				{
					var _playerVars = sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElse(null);
					if (_playerVars != null) {
						_playerVars.dps_first = true;
						_playerVars.dps_count = amount;
						_playerVars.markSyncDirty();
					}
				}
			} else if (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_second == false) {
				{
					var _playerVars = sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElse(null);
					if (_playerVars != null) {
						_playerVars.dps_second = true;
						_playerVars.dps_count_second = amount;
						_playerVars.markSyncDirty();
					}
				}
			}
			if (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_first == true
					&& sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_second == true) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("DPS: " + (sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_count
							+ sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElseGet(MortiusWeaponryReduxModVariables.PlayerVariables::new).dps_count_second) / 2)), true);
				{
					var _playerVars = sourceentity.getCapability(MortiusWeaponryReduxModVariables.PLAYER_VARIABLES).orElse(null);
					if (_playerVars != null) {
						_playerVars.dps_first = false;
						_playerVars.dps_second = false;
						_playerVars.markSyncDirty();
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (!itemstack2.isEmpty() && ItemStack.isSameItem(itemstack2, itemstack)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}