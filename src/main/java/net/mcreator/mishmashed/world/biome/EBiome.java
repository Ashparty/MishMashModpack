
package net.mcreator.mishmashed.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;

public class EBiome {

	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderBaseConfiguration(
			Blocks.PURPLE_CANDLE_CAKE.defaultBlockState(), Blocks.BAMBOO.defaultBlockState(), Blocks.BAMBOO.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-256).waterColor(-6750055).waterFogColor(-16751002).skyColor(-256)
				.foliageColorOverride(-13369498).grassColorOverride(-10066177).build();

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

		biomeGenerationSettings.addStructureStart(StructureFeatures.NETHER_BRIDGE);

		biomeGenerationSettings.addStructureStart(StructureFeatures.NETHER_FOSSIL);

		biomeGenerationSettings.addStructureStart(StructureFeatures.BASTION_REMNANT);

		biomeGenerationSettings.addStructureStart(StructureFeatures.END_CITY);

		biomeGenerationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_SWAMP);

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("trees",
				Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(Blocks.HAY_BLOCK.defaultBlockState()),
						new StraightTrunkPlacer(255, 2, 0), new SimpleStateProvider(Blocks.TNT.defaultBlockState()),
						new SimpleStateProvider(Blocks.OAK_SAPLING.defaultBlockState()),
						new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
								.decorators(ImmutableList.of(ELeaveDecorator.INSTANCE, ETrunkDecorator.INSTANCE

										, EFruitDecorator.INSTANCE))
								.build())
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
										ImmutableList.of(Blocks.PURPLE_CANDLE_CAKE.defaultBlockState(), Blocks.BAMBOO.defaultBlockState())))
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

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).depth(0.1f).scale(0.2f)
				.temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MishmashedMod.MODID, "e"), SURFACE_BUILDER);

		CONFIGURED_FEATURES.forEach((resourceLocation, configuredFeature) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation,
				configuredFeature));

		BiomeManager.addBiome(BiomeManager.BiomeType.WARM,
				new BiomeManager.BiomeEntry(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(MishmashedModBiomes.E)), 10));
	}

	private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = new HashMap<>();

	private static ConfiguredFeature<?, ?> register(String name, ConfiguredFeature<?, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(new ResourceLocation(MishmashedMod.MODID, name + "_e"), configuredFeature);
		return configuredFeature;
	}

}
