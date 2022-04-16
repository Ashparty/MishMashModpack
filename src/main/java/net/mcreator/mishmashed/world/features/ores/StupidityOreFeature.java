
package net.mcreator.mishmashed.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.mishmashed.init.MishmashedModBlocks;

import java.util.Set;
import java.util.Random;

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
