
package net.mcreator.mishmashed.world.biome;

import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.placement.FrequencyWithExtraChanceDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoiseDependantDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.blockplacers.ColumnPlacer;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.mishmashed.world.features.treedecorators.ETrunkDecorator;
import net.mcreator.mishmashed.world.features.treedecorators.ELeaveDecorator;
import net.mcreator.mishmashed.world.features.treedecorators.EFruitDecorator;
import net.mcreator.mishmashed.init.MishmashedModBiomes;
import net.mcreator.mishmashed.MishmashedMod;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableList;

public class EBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(Blocks.PURPLE_CANDLE_CAKE.defaultBlockState(),
					Blocks.MAGENTA_GLAZED_TERRACOTTA.defaultBlockState(), Blocks.MAGENTA_GLAZED_TERRACOTTA.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-256).waterColor(-6750055).waterFogColor(-16751002).skyColor(-256)
				.foliageColorOverride(-13369498).grassColorOverride(-10066177)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("block.big_dripleaf.hit")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("block.respawn_anchor.ambient")), 6000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("block.azalea_leaves.hit")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("block.bell.use")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.ITEM_SLIME, 0.005f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addStructureStart(StructureFeatures.STRONGHOLD);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT_MESA);
		biomeGenerationSettings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
		biomeGenerationSettings.addStructureStart(StructureFeatures.VILLAGE_SNOWY);
		biomeGenerationSettings.addStructureStart(StructureFeatures.WOODLAND_MANSION);
		biomeGenerationSettings.addStructureStart(StructureFeatures.JUNGLE_TEMPLE);
		biomeGenerationSettings.addStructureStart(StructureFeatures.DESERT_PYRAMID);
		biomeGenerationSettings.addStructureStart(StructureFeatures.SWAMP_HUT);
		biomeGenerationSettings.addStructureStart(StructureFeatures.IGLOO);
		biomeGenerationSettings.addStructureStart(StructureFeatures.OCEAN_MONUMENT);
		biomeGenerationSettings.addStructureStart(StructureFeatures.SHIPWRECK);
		biomeGenerationSettings.addStructureStart(StructureFeatures.SHIPWRECH_BEACHED);
		biomeGenerationSettings.addStructureStart(StructureFeatures.BURIED_TREASURE);
		biomeGenerationSettings.addStructureStart(StructureFeatures.OCEAN_RUIN_COLD);
		biomeGenerationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_SWAMP);
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("trees", Feature.TREE
				.configured((new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(Blocks.HAY_BLOCK.defaultBlockState()),
						new StraightTrunkPlacer(143, 2, 0), new SimpleStateProvider(Blocks.TNT.defaultBlockState()),
						new SimpleStateProvider(Blocks.OAK_SAPLING.defaultBlockState()),
						new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
								.decorators(ImmutableList.of(ELeaveDecorator.INSTANCE, ETrunkDecorator.INSTANCE, EFruitDecorator.INSTANCE)).build())
				.decorated(Features.Decorators.HEIGHTMAP_SQUARE)
				.decorated(FeatureDecorator.COUNT_EXTRA.configured(new FrequencyWithExtraChanceDecoratorConfiguration(1, 0.1F, 1)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("grass",
						Feature.RANDOM_PATCH.configured(Features.Configs.DEFAULT_GRASS_CONFIG).decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
								.decorated(FeatureDecorator.COUNT_NOISE.configured(new NoiseDependantDecoratorConfiguration(-0.8D, 5, 4)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("seagrass", Feature.SEAGRASS
				.configured(new ProbabilityFeatureConfiguration(0.3F)).count(17).decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("flower", Feature.FLOWER.configured(Features.Configs.DEFAULT_FLOWER_CONFIG).decorated(Features.Decorators.ADD_32)
						.decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("brown_mushroom",
						Feature.RANDOM_PATCH.configured((new RandomPatchConfiguration.GrassConfigurationBuilder(
								new SimpleStateProvider(Blocks.BROWN_MUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1)
										.noProjection().build())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("red_mushroom",
						Feature.RANDOM_PATCH.configured((new RandomPatchConfiguration.GrassConfigurationBuilder(
								new SimpleStateProvider(Blocks.RED_MUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(1).noProjection()
										.build())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("brown_mushroom_huge",
						Feature.HUGE_BROWN_MUSHROOM.configured(new HugeMushroomFeatureConfiguration(
								new SimpleStateProvider(Blocks.BROWN_MUSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.TRUE)
										.setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
								new SimpleStateProvider(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE)
										.setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
								2))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("red_mushroom_huge",
				Feature.HUGE_RED_MUSHROOM.configured(new HugeMushroomFeatureConfiguration(
						new SimpleStateProvider(Blocks.RED_MUSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
						new SimpleStateProvider(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE)
								.setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
						2))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("disk_sand",
						Feature.DISK
								.configured(new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 4), 2,
										ImmutableList.of(Blocks.PURPLE_CANDLE_CAKE.defaultBlockState(),
												Blocks.MAGENTA_GLAZED_TERRACOTTA.defaultBlockState())))
								.decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE).count(1)));
		biomeGenerationSettings
				.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						register("patch_cactus",
								Feature.RANDOM_PATCH.configured((new RandomPatchConfiguration.GrassConfigurationBuilder(
										new SimpleStateProvider(Blocks.CACTUS.defaultBlockState()), new ColumnPlacer(BiasedToBottomInt.of(1, 2))))
												.tries(10).noProjection().build())));
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.ICY).depth(1.4000000000000001f)
				.scale(2f).temperature(2f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MishmashedMod.MODID, "e"), SURFACE_BUILDER);
		CONFIGURED_FEATURES.forEach((resourceLocation, configuredFeature) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation,
				configuredFeature));
		BiomeManager.addBiome(BiomeManager.BiomeType.ICY,
				new BiomeManager.BiomeEntry(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(MishmashedModBiomes.E)), 5));
	}

	private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = new HashMap<>();

	private static ConfiguredFeature<?, ?> register(String name, ConfiguredFeature<?, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(new ResourceLocation(MishmashedMod.MODID, name + "_e"), configuredFeature);
		return configuredFeature;
	}
}
