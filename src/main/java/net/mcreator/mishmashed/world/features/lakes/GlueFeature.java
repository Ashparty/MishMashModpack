
package net.mcreator.mishmashed.world.features.lakes;

public class GlueFeature extends LakeFeature {
	public static final GlueFeature FEATURE = (GlueFeature) new GlueFeature().setRegistryName("mishmashed:glue");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new BlockStateConfiguration(MishmashedModBlocks.GLUE.defaultBlockState()))
			.rangeUniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0)).squared().rarity(8);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("badlands"));

	public GlueFeature() {
		super(BlockStateConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
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
