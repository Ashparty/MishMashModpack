
package net.mcreator.mishmashed.world.features.ores;

public class PurplegravelFeature extends OreFeature {

	public static final PurplegravelFeature FEATURE = (PurplegravelFeature) new PurplegravelFeature().setRegistryName("mishmashed:purplegravel");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PurplegravelFeatureRuleTest.INSTANCE, MishmashedModBlocks.PURPLEGRAVEL.defaultBlockState(), 16))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)))).squared().count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public PurplegravelFeature() {
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

	private static class PurplegravelFeatureRuleTest extends RuleTest {

		static final PurplegravelFeatureRuleTest INSTANCE = new PurplegravelFeatureRuleTest();
		static final com.mojang.serialization.Codec<PurplegravelFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<PurplegravelFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("mishmashed:purplegravel_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.WATER)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.WATER)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.BUBBLE_COLUMN)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
