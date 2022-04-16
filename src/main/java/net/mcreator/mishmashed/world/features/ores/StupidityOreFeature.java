
package net.mcreator.mishmashed.world.features.ores;

public class StupidityOreFeature extends OreFeature {

	public static final StupidityOreFeature FEATURE = (StupidityOreFeature) new StupidityOreFeature().setRegistryName("mishmashed:stupidity_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(StupidityOreFeatureRuleTest.INSTANCE, MishmashedModBlocks.STUPIDITY_ORE.defaultBlockState(), 5))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(14), VerticalAnchor.absolute(83)))).squared().count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public StupidityOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class StupidityOreFeatureRuleTest extends RuleTest {

		static final StupidityOreFeatureRuleTest INSTANCE = new StupidityOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<StupidityOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<StupidityOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("mishmashed:stupidity_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
