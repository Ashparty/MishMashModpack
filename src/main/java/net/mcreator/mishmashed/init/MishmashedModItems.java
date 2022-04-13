
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mishmashed.item.InspectahFoodItem;
import net.mcreator.mishmashed.item.GlueItem;
import net.mcreator.mishmashed.item.AmazingBlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GLUE_BUCKET = register(new GlueItem());
	public static final Item INSPECTAH_POPPY = register(MishmashedModBlocks.INSPECTAH_POPPY, CreativeModeTab.TAB_DECORATIONS);
	public static final Item AMAZING_BLOCK = register(new AmazingBlockItem());
	public static final Item INSPECTAH_FOOD = register(new InspectahFoodItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
