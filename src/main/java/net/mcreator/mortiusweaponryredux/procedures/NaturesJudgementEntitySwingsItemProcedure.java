package net.mcreator.mortiusweaponryredux.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.Comparator;

public class NaturesJudgementEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(LivingEntity.class,
				AABB.ofSize(
						new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
						20, 20, 20),
				e -> true).isEmpty()) {
			if (!(((Entity) world.getEntitiesOfClass(LivingEntity.class,
					AABB.ofSize(
							new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
							20, 20, 20),
					e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
					.findFirst().orElse(null)) == entity)) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 4);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(
							new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
							20, 20, 20), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(
											new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
							.findFirst().orElse(null))
							.level().clip(
									new ClipContext(
											((Entity) world
													.getEntitiesOfClass(LivingEntity.class,
															AABB.ofSize(
																	new Vec3((entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																	20, 20, 20),
															e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ())))
													.findFirst().orElse(null)).getEyePosition(1f),
											((Entity) world
													.getEntitiesOfClass(LivingEntity.class,
															AABB.ofSize(new Vec3(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(
																					entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())),
																	20, 20, 20),
															e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ())))
													.findFirst().orElse(null))
													.getEyePosition(
															1f)
													.add(((Entity) world
															.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())),
																	20, 20, 20), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getZ())))
															.findFirst().orElse(null)).getViewVector(1f).scale((-2))),
											ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, ((Entity) world
													.getEntitiesOfClass(LivingEntity.class,
															AABB.ofSize(new Vec3(
																	(entity.level()
																			.clip(new ClipContext(
																					entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())),
																	20, 20, 20),
															e -> true)
													.stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ())))
													.findFirst().orElse(null))))
							.getBlockPos().getX()),
							(((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
									20, 20, 20), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf((entity.level().clip(
											new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity
													.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
															entity))
													.getBlockPos().getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(
													1f).add(
															entity.getViewVector(1f).scale(8)),
													ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
									.findFirst().orElse(null)).getY()),
							(((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
									20, 20, 20), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY()),
											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ())))
									.findFirst().orElse(null))
									.level().clip(
											new ClipContext(
													((Entity) world.getEntitiesOfClass(LivingEntity.class,
															AABB.ofSize(new Vec3(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())),
																	20, 20, 20),
															e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getZ())))
															.findFirst().orElse(null)).getEyePosition(1f),
													((Entity) world
															.getEntitiesOfClass(LivingEntity.class,
																	AABB.ofSize(new Vec3(
																			(entity.level()
																					.clip(new ClipContext(
																							entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																					.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																			20, 20, 20),
																	e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(
																					1f).add(
																							entity.getViewVector(1f).scale(8)),
																					ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getZ())))
															.findFirst().orElse(null)).getEyePosition(1f).add(
																	((Entity) world
																			.getEntitiesOfClass(LivingEntity.class,
																					AABB.ofSize(new Vec3(
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getX()),
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getY()),
																							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																							20, 20, 20),
																					e -> true)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																				}
																			}.compareDistOf(
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getX()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getY()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getZ())))
																			.findFirst().orElse(null)).getViewVector(1f).scale((-2))),
													ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
													((Entity) world
															.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
																	(entity.level()
																			.clip(new ClipContext(
																					entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(
																					entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())),
																	20, 20, 20), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																					entity))
																			.getBlockPos().getY()),
																	(entity.level().clip(
																			new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ())))
															.findFirst().orElse(null))))
									.getBlockPos().getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection
								.teleport(
										(((Entity) world
												.getEntitiesOfClass(LivingEntity.class,
														AABB.ofSize(
																new Vec3(
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(
																						entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ())),
																20, 20, 20),
														e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ())))
												.findFirst().orElse(null))
												.level().clip(
														new ClipContext(
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getZ())))
																		.findFirst().orElse(null)).getEyePosition(1f),
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getZ())))
																		.findFirst().orElse(null))
																		.getEyePosition(1f)
																		.add(((Entity) world
																				.getEntitiesOfClass(LivingEntity.class,
																						AABB.ofSize(new Vec3(
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)),
																										ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																								20, 20, 20),
																						e -> true)
																				.stream().sorted(new Object() {
																					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																					}
																				}.compareDistOf(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getZ())))
																				.findFirst().orElse(null)).getViewVector(1f).scale((-2))),
																ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getZ())))
																		.findFirst().orElse(null))))
												.getBlockPos().getX()),
										(((Entity) world
												.getEntitiesOfClass(LivingEntity.class,
														AABB.ofSize(
																new Vec3(
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(
																						entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ())),
																20, 20, 20),
														e -> true)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ())))
												.findFirst().orElse(null)).getY()),
										(((Entity) world.getEntitiesOfClass(LivingEntity.class,
												AABB.ofSize(new Vec3(
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ())),
														20, 20, 20),
												e -> true).stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
													}
												}.compareDistOf(
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ())))
												.findFirst().orElse(null))
												.level().clip(
														new ClipContext(
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getZ())))
																		.findFirst().orElse(null)).getEyePosition(1f),
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getZ())))
																		.findFirst().orElse(null))
																		.getEyePosition(1f)
																		.add(((Entity) world
																				.getEntitiesOfClass(LivingEntity.class,
																						AABB.ofSize(new Vec3(
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)),
																										ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																								20, 20, 20),
																						e -> true)
																				.stream().sorted(new Object() {
																					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																					}
																				}.compareDistOf(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getZ())))
																				.findFirst().orElse(null)).getViewVector(1f).scale((-2))),
																ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE,
																((Entity) world
																		.getEntitiesOfClass(LivingEntity.class,
																				AABB.ofSize(new Vec3(
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
																						20, 20, 20),
																				e -> true)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																			}
																		}.compareDistOf(
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
																		.findFirst().orElse(null))))
												.getBlockPos().getZ()),
										_ent.getYRot(), _ent.getXRot());
				}
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(
						new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
						20, 20, 20), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
						.findFirst().orElse(null)).getX()),
						(((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())), 20,
								20, 20), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ())))
								.findFirst().orElse(null)).getY() + 1.6),
						(((Entity) world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())), 20,
								20, 20), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ())))
								.findFirst().orElse(null)).getZ())));
			}
		}
	}
}
