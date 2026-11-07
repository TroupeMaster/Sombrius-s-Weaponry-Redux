package net.sombrius.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import java.util.Comparator;

public class RetrieveThrownWeaponProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity, ItemStack pickup) {
		if (immediatesourceentity == null)
			return;
		double baseRate = 0;
		if (immediatesourceentity.tickCount >= 20) {
			baseRate = 20;
			if (immediatesourceentity.tickCount % baseRate == 0) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator == (immediatesourceentity instanceof TraceableEntity _traceableEntity ? _traceableEntity.getOwner() : null)) {
							if (!immediatesourceentity.level().isClientSide())
								immediatesourceentity.discard();
							if (!(getEntityGameType(entityiterator) == GameType.CREATIVE) && !(getEntityGameType(entityiterator) == GameType.SPECTATOR)) {
								if (entityiterator instanceof Player _player) {
									ItemStack _setstack = pickup.copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getEyeHeight(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")),
											SoundSource.PLAYERS, (float) 0.1, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getEyeHeight()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")), SoundSource.PLAYERS,
											(float) 0.1, 1, false);
								}
							}
						}
					}
				}
			}
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