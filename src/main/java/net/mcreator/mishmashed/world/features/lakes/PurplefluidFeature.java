
package net.mcreator.mishmashed.world.features.lakes;

import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.mcreator.mishmashed.init.MishmashedModBlocks;

import java.util.Set;

public class PurplefluidFeature extends LakeFeature {
	public static final PurplefluidFeature FEATURE = (PurplefluidFeature) new PurplefluidFeature().setRegistryName("mishmashed:purplefluid");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new BlockStateConfiguration(MishmashedModBlocks.PURPLEFLUID.defaultBlockState()))
			.rangeUniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0)).squared().rarity(5);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mishmashed:e"));

	public PurplefluidFeature() {
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
