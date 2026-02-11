package net.mcreator.mortiusweaponryredux.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MortiusWeaponryReduxModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		MortiusWeaponryReduxMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			if (!event.isWasDeath()) {
				clone.dps_count = original.dps_count;
				clone.dps_first = original.dps_first;
				clone.dps_second = original.dps_second;
				clone.dps_count_second = original.dps_count_second;
				clone.timeBullet = original.timeBullet;
				clone.zafkielMainHand = original.zafkielMainHand;
				clone.timeLeft = original.timeLeft;
				clone.lookingAtBlock = original.lookingAtBlock;
				clone.dashCooldown = original.dashCooldown;
				clone.autoPressed = original.autoPressed;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("mortius_weaponry_redux", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double dps_count = 0;
		public boolean dps_first = false;
		public boolean dps_second = false;
		public double dps_count_second = 0;
		public double timeBullet = 0;
		public boolean zafkielMainHand = false;
		public double timeLeft = 8760.0;
		public boolean lookingAtBlock = false;
		public double dashCooldown = 0;
		public boolean autoPressed = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				MortiusWeaponryReduxMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("dps_count", dps_count);
			nbt.putBoolean("dps_first", dps_first);
			nbt.putBoolean("dps_second", dps_second);
			nbt.putDouble("dps_count_second", dps_count_second);
			nbt.putDouble("timeBullet", timeBullet);
			nbt.putBoolean("zafkielMainHand", zafkielMainHand);
			nbt.putDouble("timeLeft", timeLeft);
			nbt.putBoolean("lookingAtBlock", lookingAtBlock);
			nbt.putDouble("dashCooldown", dashCooldown);
			nbt.putBoolean("autoPressed", autoPressed);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			dps_count = nbt.getDouble("dps_count");
			dps_first = nbt.getBoolean("dps_first");
			dps_second = nbt.getBoolean("dps_second");
			dps_count_second = nbt.getDouble("dps_count_second");
			timeBullet = nbt.getDouble("timeBullet");
			zafkielMainHand = nbt.getBoolean("zafkielMainHand");
			timeLeft = nbt.getDouble("timeLeft");
			lookingAtBlock = nbt.getBoolean("lookingAtBlock");
			dashCooldown = nbt.getDouble("dashCooldown");
			autoPressed = nbt.getBoolean("autoPressed");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.dps_count = message.data.dps_count;
					variables.dps_first = message.data.dps_first;
					variables.dps_second = message.data.dps_second;
					variables.dps_count_second = message.data.dps_count_second;
					variables.timeBullet = message.data.timeBullet;
					variables.zafkielMainHand = message.data.zafkielMainHand;
					variables.timeLeft = message.data.timeLeft;
					variables.lookingAtBlock = message.data.lookingAtBlock;
					variables.dashCooldown = message.data.dashCooldown;
					variables.autoPressed = message.data.autoPressed;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
