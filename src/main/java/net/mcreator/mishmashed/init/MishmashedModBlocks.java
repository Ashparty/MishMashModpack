
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mishmashed.block.SiftingBlockBlock;
import net.mcreator.mishmashed.block.PurplefluidBlock;
import net.mcreator.mishmashed.block.PurpleBlock;
import net.mcreator.mishmashed.block.PupleoreBlock;
import net.mcreator.mishmashed.block.PoggerrackBlock;
import net.mcreator.mishmashed.block.MuffinFlowerBlock;
import net.mcreator.mishmashed.block.InspectahPoppyBlock;
import net.mcreator.mishmashed.block.InspectahBlockBlock;
import net.mcreator.mishmashed.block.GlueBlock;
import net.mcreator.mishmashed.block.ExperienceOreBlock;
import net.mcreator.mishmashed.block.ExperienceFlowerBlock;
import net.mcreator.mishmashed.block.EnchantmentTableBlock;
import net.mcreator.mishmashed.block.EnchantPlantBlock;
import net.mcreator.mishmashed.block.CreepePlantBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block POGGERRACK = register(new PoggerrackBlock());
	public static final Block GLUE = register(new GlueBlock());
	public static final Block INSPECTAH_POPPY = register(new InspectahPoppyBlock());
	public static final Block INSPECTAH_BLOCK = register(new InspectahBlockBlock());
	public static final Block CREEPE_PLANT = register(new CreepePlantBlock());
	public static final Block ENCHANTMENT_TABLE = register(new EnchantmentTableBlock());
	public static final Block ENCHANT_PLANT = register(new EnchantPlantBlock());
	public static final Block SIFTING_BLOCK = register(new SiftingBlockBlock());
	public static final Block EXPERIENCE_FLOWER = register(new ExperienceFlowerBlock());
	public static final Block EXPERIENCE_ORE = register(new ExperienceOreBlock());
	public static final Block MUFFIN_FLOWER = register(new MuffinFlowerBlock());
	public static final Block PURPLE = register(new PurpleBlock());
	public static final Block PUPLEORE = register(new PupleoreBlock());
	public static final Block TWITCH_ORE = register(new TwitchOreBlock());
	public static final Block PURPLEFLUID = register(new PurplefluidBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			InspectahPoppyBlock.registerRenderLayer();
			CreepePlantBlock.registerRenderLayer();
			EnchantPlantBlock.registerRenderLayer();
			SiftingBlockBlock.registerRenderLayer();
			ExperienceFlowerBlock.registerRenderLayer();
			MuffinFlowerBlock.registerRenderLayer();
		}
	}
}
