
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.mishmashed.world.features.plants.MuffinFlowerFeature;
import net.mcreator.mishmashed.world.features.plants.InspectahPoppyFeature;
import net.mcreator.mishmashed.world.features.plants.ExperienceFlowerFeature;
import net.mcreator.mishmashed.world.features.plants.EnchantPlantFeature;
import net.mcreator.mishmashed.world.features.plants.CreepePlantFeature;
import net.mcreator.mishmashed.world.features.ores.StupidityOreFeature;
import net.mcreator.mishmashed.world.features.ores.PurplegravelFeature;
import net.mcreator.mishmashed.world.features.ores.PurpleFeature;
import net.mcreator.mishmashed.world.features.ores.PupleoreFeature;
import net.mcreator.mishmashed.world.features.ores.PoggerrackFeature;
import net.mcreator.mishmashed.world.features.ores.ExperienceOreFeature;
import net.mcreator.mishmashed.world.features.lakes.PurplefluidFeature;
import net.mcreator.mishmashed.world.features.lakes.GlueFeature;
import net.mcreator.mishmashed.world.features.SubwayFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(PoggerrackFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PoggerrackFeature.GENERATE_BIOMES,
				PoggerrackFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GlueFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, GlueFeature.GENERATE_BIOMES, GlueFeature.CONFIGURED_FEATURE));
		REGISTRY.put(InspectahPoppyFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				InspectahPoppyFeature.GENERATE_BIOMES, InspectahPoppyFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CreepePlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				CreepePlantFeature.GENERATE_BIOMES, CreepePlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EnchantPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				EnchantPlantFeature.GENERATE_BIOMES, EnchantPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ExperienceFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ExperienceFlowerFeature.GENERATE_BIOMES, ExperienceFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ExperienceOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ExperienceOreFeature.GENERATE_BIOMES, ExperienceOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MuffinFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MuffinFlowerFeature.GENERATE_BIOMES, MuffinFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PurpleFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PurpleFeature.GENERATE_BIOMES, PurpleFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PupleoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PupleoreFeature.GENERATE_BIOMES,
				PupleoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StupidityOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				StupidityOreFeature.GENERATE_BIOMES, StupidityOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PurplefluidFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, PurplefluidFeature.GENERATE_BIOMES, PurplefluidFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SubwayFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SubwayFeature.GENERATE_BIOMES,
				SubwayFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PurplegravelFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PurplegravelFeature.GENERATE_BIOMES, PurplegravelFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
