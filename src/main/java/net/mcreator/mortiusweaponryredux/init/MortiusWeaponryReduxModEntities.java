
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mortiusweaponryredux.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mortiusweaponryredux.entity.WoodenThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.WoodenJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.WoodenChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.WaterWaveEntity;
import net.mcreator.mortiusweaponryredux.entity.TimeBulletEntity;
import net.mcreator.mortiusweaponryredux.entity.StoneThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.StoneJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.StoneChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.SteelJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.SpikedMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.SlugEntity;
import net.mcreator.mortiusweaponryredux.entity.SilverJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.RoseGoldJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.PhantomBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.ObsidianKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.NetheriteThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.NetheriteJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.NetheriteChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.NetheriteArrowEntity;
import net.mcreator.mortiusweaponryredux.entity.MusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.MusketBallPieceProjEntity;
import net.mcreator.mortiusweaponryredux.entity.IronThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.IronJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.IronChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.IronArrowEntity;
import net.mcreator.mortiusweaponryredux.entity.HellfireMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.HellfireFlameEntity;
import net.mcreator.mortiusweaponryredux.entity.HeavyMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.GoldenThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.GoldenJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.GoldenChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.GhostlyDaggerEntity;
import net.mcreator.mortiusweaponryredux.entity.FieryMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.ExplosiveMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.EstocPointProjEntity;
import net.mcreator.mortiusweaponryredux.entity.EnderFireballEntity;
import net.mcreator.mortiusweaponryredux.entity.EnderBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.DiamondThrowingKnifeProjEntity;
import net.mcreator.mortiusweaponryredux.entity.DiamondJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.DiamondChakramProjEntity;
import net.mcreator.mortiusweaponryredux.entity.DiamondArrowEntity;
import net.mcreator.mortiusweaponryredux.entity.CuttingDashEntity;
import net.mcreator.mortiusweaponryredux.entity.CrystallizedMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CrystalPieceProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CrackedMusketBallProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CopperJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.CopperArrowEntity;
import net.mcreator.mortiusweaponryredux.entity.CannonballEntity;
import net.mcreator.mortiusweaponryredux.entity.BronzeJavelinProjEntity;
import net.mcreator.mortiusweaponryredux.entity.AutoArrowEntity;
import net.mcreator.mortiusweaponryredux.MortiusWeaponryReduxMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MortiusWeaponryReduxModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MortiusWeaponryReduxMod.MODID);
	public static final RegistryObject<EntityType<MusketBallProjEntity>> MUSKET_BALL_PROJ = register("musket_ball_proj",
			EntityType.Builder.<MusketBallProjEntity>of(MusketBallProjEntity::new, MobCategory.MISC).setCustomClientFactory(MusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrackedMusketBallProjEntity>> CRACKED_MUSKET_BALL_PROJ = register("cracked_musket_ball_proj", EntityType.Builder.<CrackedMusketBallProjEntity>of(CrackedMusketBallProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrackedMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MusketBallPieceProjEntity>> MUSKET_BALL_PIECE_PROJ = register("musket_ball_piece_proj", EntityType.Builder.<MusketBallPieceProjEntity>of(MusketBallPieceProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MusketBallPieceProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FieryMusketBallProjEntity>> FIERY_MUSKET_BALL_PROJ = register("fiery_musket_ball_proj", EntityType.Builder.<FieryMusketBallProjEntity>of(FieryMusketBallProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FieryMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrystallizedMusketBallProjEntity>> CRYSTALLIZED_MUSKET_BALL_PROJ = register("crystallized_musket_ball_proj",
			EntityType.Builder.<CrystallizedMusketBallProjEntity>of(CrystallizedMusketBallProjEntity::new, MobCategory.MISC).setCustomClientFactory(CrystallizedMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrystalPieceProjEntity>> CRYSTAL_PIECE_PROJ = register("crystal_piece_proj", EntityType.Builder.<CrystalPieceProjEntity>of(CrystalPieceProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrystalPieceProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellfireMusketBallProjEntity>> HELLFIRE_MUSKET_BALL_PROJ = register("hellfire_musket_ball_proj",
			EntityType.Builder.<HellfireMusketBallProjEntity>of(HellfireMusketBallProjEntity::new, MobCategory.MISC).setCustomClientFactory(HellfireMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellfireFlameEntity>> HELLFIRE_FLAME = register("hellfire_flame",
			EntityType.Builder.<HellfireFlameEntity>of(HellfireFlameEntity::new, MobCategory.MISC).setCustomClientFactory(HellfireFlameEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnderBallProjEntity>> ENDER_BALL_PROJ = register("ender_ball_proj",
			EntityType.Builder.<EnderBallProjEntity>of(EnderBallProjEntity::new, MobCategory.MISC).setCustomClientFactory(EnderBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpikedMusketBallProjEntity>> SPIKED_MUSKET_BALL_PROJ = register("spiked_musket_ball_proj", EntityType.Builder.<SpikedMusketBallProjEntity>of(SpikedMusketBallProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SpikedMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosiveMusketBallProjEntity>> EXPLOSIVE_MUSKET_BALL_PROJ = register("explosive_musket_ball_proj",
			EntityType.Builder.<ExplosiveMusketBallProjEntity>of(ExplosiveMusketBallProjEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosiveMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HeavyMusketBallProjEntity>> HEAVY_MUSKET_BALL_PROJ = register("heavy_musket_ball_proj", EntityType.Builder.<HeavyMusketBallProjEntity>of(HeavyMusketBallProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HeavyMusketBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GhostlyDaggerEntity>> GHOSTLY_DAGGER = register("ghostly_dagger",
			EntityType.Builder.<GhostlyDaggerEntity>of(GhostlyDaggerEntity::new, MobCategory.MISC).setCustomClientFactory(GhostlyDaggerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CuttingDashEntity>> CUTTING_DASH = register("cutting_dash",
			EntityType.Builder.<CuttingDashEntity>of(CuttingDashEntity::new, MobCategory.MISC).setCustomClientFactory(CuttingDashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterWaveEntity>> WATER_WAVE = register("water_wave",
			EntityType.Builder.<WaterWaveEntity>of(WaterWaveEntity::new, MobCategory.MISC).setCustomClientFactory(WaterWaveEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EstocPointProjEntity>> ESTOC_POINT_PROJ = register("estoc_point_proj",
			EntityType.Builder.<EstocPointProjEntity>of(EstocPointProjEntity::new, MobCategory.MISC).setCustomClientFactory(EstocPointProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronArrowEntity>> IRON_ARROW = register("iron_arrow",
			EntityType.Builder.<IronArrowEntity>of(IronArrowEntity::new, MobCategory.MISC).setCustomClientFactory(IronArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteArrowEntity>> NETHERITE_ARROW = register("netherite_arrow",
			EntityType.Builder.<NetheriteArrowEntity>of(NetheriteArrowEntity::new, MobCategory.MISC).setCustomClientFactory(NetheriteArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondArrowEntity>> DIAMOND_ARROW = register("diamond_arrow",
			EntityType.Builder.<DiamondArrowEntity>of(DiamondArrowEntity::new, MobCategory.MISC).setCustomClientFactory(DiamondArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AutoArrowEntity>> AUTO_ARROW = register("auto_arrow",
			EntityType.Builder.<AutoArrowEntity>of(AutoArrowEntity::new, MobCategory.MISC).setCustomClientFactory(AutoArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhantomBallProjEntity>> PHANTOM_BALL_PROJ = register("phantom_ball_proj", EntityType.Builder.<PhantomBallProjEntity>of(PhantomBallProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PhantomBallProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenChakramProjEntity>> WOODEN_CHAKRAM_PROJ = register("wooden_chakram_proj", EntityType.Builder.<WoodenChakramProjEntity>of(WoodenChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WoodenChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneChakramProjEntity>> STONE_CHAKRAM_PROJ = register("stone_chakram_proj", EntityType.Builder.<StoneChakramProjEntity>of(StoneChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StoneChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenChakramProjEntity>> GOLDEN_CHAKRAM_PROJ = register("golden_chakram_proj", EntityType.Builder.<GoldenChakramProjEntity>of(GoldenChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GoldenChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronChakramProjEntity>> IRON_CHAKRAM_PROJ = register("iron_chakram_proj", EntityType.Builder.<IronChakramProjEntity>of(IronChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IronChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondChakramProjEntity>> DIAMOND_CHAKRAM_PROJ = register("diamond_chakram_proj", EntityType.Builder.<DiamondChakramProjEntity>of(DiamondChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DiamondChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteChakramProjEntity>> NETHERITE_CHAKRAM_PROJ = register("netherite_chakram_proj", EntityType.Builder.<NetheriteChakramProjEntity>of(NetheriteChakramProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(NetheriteChakramProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenThrowingKnifeProjEntity>> WOODEN_THROWING_KNIFE_PROJ = register("wooden_throwing_knife_proj",
			EntityType.Builder.<WoodenThrowingKnifeProjEntity>of(WoodenThrowingKnifeProjEntity::new, MobCategory.MISC).setCustomClientFactory(WoodenThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneThrowingKnifeProjEntity>> STONE_THROWING_KNIFE_PROJ = register("stone_throwing_knife_proj",
			EntityType.Builder.<StoneThrowingKnifeProjEntity>of(StoneThrowingKnifeProjEntity::new, MobCategory.MISC).setCustomClientFactory(StoneThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenThrowingKnifeProjEntity>> GOLDEN_THROWING_KNIFE_PROJ = register("golden_throwing_knife_proj",
			EntityType.Builder.<GoldenThrowingKnifeProjEntity>of(GoldenThrowingKnifeProjEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronThrowingKnifeProjEntity>> IRON_THROWING_KNIFE_PROJ = register("iron_throwing_knife_proj", EntityType.Builder.<IronThrowingKnifeProjEntity>of(IronThrowingKnifeProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IronThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondThrowingKnifeProjEntity>> DIAMOND_THROWING_KNIFE_PROJ = register("diamond_throwing_knife_proj",
			EntityType.Builder.<DiamondThrowingKnifeProjEntity>of(DiamondThrowingKnifeProjEntity::new, MobCategory.MISC).setCustomClientFactory(DiamondThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteThrowingKnifeProjEntity>> NETHERITE_THROWING_KNIFE_PROJ = register("netherite_throwing_knife_proj",
			EntityType.Builder.<NetheriteThrowingKnifeProjEntity>of(NetheriteThrowingKnifeProjEntity::new, MobCategory.MISC).setCustomClientFactory(NetheriteThrowingKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ObsidianKnifeProjEntity>> OBSIDIAN_KNIFE_PROJ = register("obsidian_knife_proj", EntityType.Builder.<ObsidianKnifeProjEntity>of(ObsidianKnifeProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ObsidianKnifeProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenJavelinProjEntity>> WOODEN_JAVELIN_PROJ = register("wooden_javelin_proj", EntityType.Builder.<WoodenJavelinProjEntity>of(WoodenJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WoodenJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneJavelinProjEntity>> STONE_JAVELIN_PROJ = register("stone_javelin_proj", EntityType.Builder.<StoneJavelinProjEntity>of(StoneJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StoneJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenJavelinProjEntity>> GOLDEN_JAVELIN_PROJ = register("golden_javelin_proj", EntityType.Builder.<GoldenJavelinProjEntity>of(GoldenJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GoldenJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronJavelinProjEntity>> IRON_JAVELIN_PROJ = register("iron_javelin_proj", EntityType.Builder.<IronJavelinProjEntity>of(IronJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IronJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondJavelinProjEntity>> DIAMOND_JAVELIN_PROJ = register("diamond_javelin_proj", EntityType.Builder.<DiamondJavelinProjEntity>of(DiamondJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DiamondJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteJavelinProjEntity>> NETHERITE_JAVELIN_PROJ = register("netherite_javelin_proj", EntityType.Builder.<NetheriteJavelinProjEntity>of(NetheriteJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(NetheriteJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SteelJavelinProjEntity>> STEEL_JAVELIN_PROJ = register("steel_javelin_proj", EntityType.Builder.<SteelJavelinProjEntity>of(SteelJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SteelJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BronzeJavelinProjEntity>> BRONZE_JAVELIN_PROJ = register("bronze_javelin_proj", EntityType.Builder.<BronzeJavelinProjEntity>of(BronzeJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BronzeJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SilverJavelinProjEntity>> SILVER_JAVELIN_PROJ = register("silver_javelin_proj", EntityType.Builder.<SilverJavelinProjEntity>of(SilverJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SilverJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RoseGoldJavelinProjEntity>> ROSE_GOLD_JAVELIN_PROJ = register("rose_gold_javelin_proj", EntityType.Builder.<RoseGoldJavelinProjEntity>of(RoseGoldJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RoseGoldJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CopperJavelinProjEntity>> COPPER_JAVELIN_PROJ = register("copper_javelin_proj", EntityType.Builder.<CopperJavelinProjEntity>of(CopperJavelinProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CopperJavelinProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CopperArrowEntity>> COPPER_ARROW = register("copper_arrow",
			EntityType.Builder.<CopperArrowEntity>of(CopperArrowEntity::new, MobCategory.MISC).setCustomClientFactory(CopperArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SlugEntity>> SLUG = register("slug",
			EntityType.Builder.<SlugEntity>of(SlugEntity::new, MobCategory.MISC).setCustomClientFactory(SlugEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CannonballEntity>> CANNONBALL = register("cannonball",
			EntityType.Builder.<CannonballEntity>of(CannonballEntity::new, MobCategory.MISC).setCustomClientFactory(CannonballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TimeBulletEntity>> TIME_BULLET = register("time_bullet",
			EntityType.Builder.<TimeBulletEntity>of(TimeBulletEntity::new, MobCategory.MISC).setCustomClientFactory(TimeBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnderFireballEntity>> ENDER_FIREBALL = register("ender_fireball",
			EntityType.Builder.<EnderFireballEntity>of(EnderFireballEntity::new, MobCategory.MISC).setCustomClientFactory(EnderFireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
