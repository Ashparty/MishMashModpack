
package net.mcreator.mishmashed.world.features.ores;

public class PurpleFeature extends OreFeature {

	public static final PurpleFeature FEATURE = (PurpleFeature) new PurpleFeature().setRegistryName("mishmashed:purple");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PurpleFeatureRuleTest.INSTANCE, MishmashedModBlocks.PURPLE.defaultBlockState(), 45))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)))).squared().count(46);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mishmashed:e"));

	public PurpleFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class PurpleFeatureRuleTest extends RuleTest {

		static final PurpleFeatureRuleTest INSTANCE = new PurpleFeatureRuleTest();
		static final com.mojang.serialization.Codec<PurpleFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<PurpleFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("mishmashed:purple_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.ANDESITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRANITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.COBBLED_DEEPSLATE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
