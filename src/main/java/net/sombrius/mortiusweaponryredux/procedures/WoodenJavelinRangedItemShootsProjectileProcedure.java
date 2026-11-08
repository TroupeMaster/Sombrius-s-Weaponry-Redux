package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

public class WoodenJavelinRangedItemShootsProjectileProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.WOODEN_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.STONE_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.GOLDEN_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.IRON_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.DIAMOND_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.NETHERITE_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.STEEL_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.BRONZE_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.SILVER_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.ROSE_GOLD_JAVELIN.get(), 30);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.COPPER_JAVELIN.get(), 30);
		if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
			itemstack.shrink(1);
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}