package net.sombrius.mortiusweaponryredux.procedures;

import net.sombrius.mortiusweaponryredux.init.MortiusWeaponryReduxModItems;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

public class WoodenThrowingKnifeRangedItemShootsProjectileProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.WOODEN_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.STONE_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.IRON_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.GOLDEN_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.DIAMOND_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.NETHERITE_THROWING_KNIFE.get(), 14);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(MortiusWeaponryReduxModItems.OBSIDIAN_KNIFE.get(), 14);
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
		}
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