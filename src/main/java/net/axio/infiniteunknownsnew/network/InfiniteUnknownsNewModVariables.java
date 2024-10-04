package net.axio.infiniteunknownsnew.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import net.axio.infiniteunknownsnew.InfiniteUnknownsNewMod;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class InfiniteUnknownsNewModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, InfiniteUnknownsNewMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		InfiniteUnknownsNewMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.EB = original.EB;
			clone.EBNeed = original.EBNeed;
			clone.EBShow = original.EBShow;
			clone.is_setting_eb_in = original.is_setting_eb_in;
			clone.setX = original.setX;
			clone.setY = original.setY;
			clone.setZ = original.setZ;
			clone.set_following = original.set_following;
			clone.temporary_uuid = original.temporary_uuid;
			clone.temporary_ebneed = original.temporary_ebneed;
			clone.temporary_ebstorage = original.temporary_ebstorage;
			clone.backup_ebstorage = original.backup_ebstorage;
			clone.backup_ebneed = original.backup_ebneed;
			if (!event.isWasDeath()) {
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public double EB = 0;
		public double EBNeed = 0;
		public boolean EBShow = false;
		public boolean is_setting_eb_in = false;
		public double setX = 0;
		public double setY = 0;
		public double setZ = 0;
		public boolean set_following = false;
		public String temporary_uuid = "\"\"";
		public double temporary_ebneed = 0;
		public double temporary_ebstorage = 0;
		public double backup_ebstorage = 0;
		public double backup_ebneed = 0;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("EB", EB);
			nbt.putDouble("EBNeed", EBNeed);
			nbt.putBoolean("EBShow", EBShow);
			nbt.putBoolean("is_setting_eb_in", is_setting_eb_in);
			nbt.putDouble("setX", setX);
			nbt.putDouble("setY", setY);
			nbt.putDouble("setZ", setZ);
			nbt.putBoolean("set_following", set_following);
			nbt.putString("temporary_uuid", temporary_uuid);
			nbt.putDouble("temporary_ebneed", temporary_ebneed);
			nbt.putDouble("temporary_ebstorage", temporary_ebstorage);
			nbt.putDouble("backup_ebstorage", backup_ebstorage);
			nbt.putDouble("backup_ebneed", backup_ebneed);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			EB = nbt.getDouble("EB");
			EBNeed = nbt.getDouble("EBNeed");
			EBShow = nbt.getBoolean("EBShow");
			is_setting_eb_in = nbt.getBoolean("is_setting_eb_in");
			setX = nbt.getDouble("setX");
			setY = nbt.getDouble("setY");
			setZ = nbt.getDouble("setZ");
			set_following = nbt.getBoolean("set_following");
			temporary_uuid = nbt.getString("temporary_uuid");
			temporary_ebneed = nbt.getDouble("temporary_ebneed");
			temporary_ebstorage = nbt.getDouble("temporary_ebstorage");
			backup_ebstorage = nbt.getDouble("backup_ebstorage");
			backup_ebneed = nbt.getDouble("backup_ebneed");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(InfiniteUnknownsNewMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}
