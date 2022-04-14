
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

public class ExperienceOreFeature extends OreFeature {
	public static final ExperienceOreFeature FEATURE = (ExperienceOreFeature) new ExperienceOreFeature().setRegistryName("mishmashed:experience_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(ExperienceOreFeatureRuleTest.INSTANCE, MishmashedModBlocks.EXPERIENCE_ORE.defaultBlockState(), 4))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(24)))).squared().count(2);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mishmashed:experience_plains"));

	public ExperienceOreFeature() {
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

	private static class ExperienceOreFeatureRuleTest extends RuleTest {
		static final ExperienceOreFeatureRuleTest INSTANCE = new ExperienceOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<ExperienceOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<ExperienceOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("mishmashed:experience_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
