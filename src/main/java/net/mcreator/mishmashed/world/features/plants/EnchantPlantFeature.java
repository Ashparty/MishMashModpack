
package net.mcreator.mishmashed.world.features.plants;

import com.mojang.serialization.Codec;

public class EnchantPlantFeature extends DefaultFlowerFeature {
	public static final EnchantPlantFeature FEATURE = (EnchantPlantFeature) new EnchantPlantFeature().setRegistryName("mishmashed:enchant_plant");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(MishmashedModBlocks.ENCHANT_PLANT.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(64)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public EnchantPlantFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}
}
