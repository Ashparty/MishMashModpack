
package net.mcreator.mishmashed.world.features.ores;

public class PoggerrackFeature extends OreFeature {

	public static final PoggerrackFeature FEATURE = (PoggerrackFeature) new PoggerrackFeature().setRegistryName("mishmashed:poggerrack");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PoggerrackFeatureRuleTest.INSTANCE, MishmashedModBlocks.POGGERRACK.defaultBlockState(), 4))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(100), VerticalAnchor.absolute(128)))).squared().count(13);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public PoggerrackFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class PoggerrackFeatureRuleTest extends RuleTest {

		static final PoggerrackFeatureRuleTest INSTANCE = new PoggerrackFeatureRuleTest();
		static final com.mojang.serialization.Codec<PoggerrackFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<PoggerrackFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("mishmashed:poggerrack_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
