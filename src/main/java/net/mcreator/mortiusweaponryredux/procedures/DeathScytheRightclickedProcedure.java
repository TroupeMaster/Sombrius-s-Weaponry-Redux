package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModMobEffects;
import net.mcreator.mortiusweaponryredux.init.MortiusWeaponryReduxModEnchantments;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

import java.util.List;
import java.util.Comparator;

public class DeathScytheRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (100 / (itemstack.getEnchantmentLevel(MortiusWeaponryReduxModEnchantments.SWIFTNESS.get()) + 1)));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_shrieker.shriek")), SoundSource.PLAYERS, 1, (float) 0.8);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_shrieker.shriek")), SoundSource.PLAYERS, 1, (float) 0.8, false);
			}
		}
		MortiusWeaponryReduxMod.queueServerWork(20, () -> {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MortiusWeaponryReduxModMobEffects.CHAINED.get())) {
						entityiterator.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("mortius_weaponry_redux:weapon_attack"))), entity), 10);
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MortiusWeaponryReduxModMobEffects.CHAINED.get());
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, (entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), 5, 0.1, 0.1, 0.1, 0.1);
					}
				}
			}
		});
	}
}
