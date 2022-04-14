
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

import net.mcreator.mishmashed.item.SandPaperItem;
import net.mcreator.mishmashed.item.PombItem;
import net.mcreator.mishmashed.item.PogeriteCompositeItem;
import net.mcreator.mishmashed.item.PogSwordItem;
import net.mcreator.mishmashed.item.PogShovelItem;
import net.mcreator.mishmashed.item.PogPickaxeItem;
import net.mcreator.mishmashed.item.PogLocatorItem;
import net.mcreator.mishmashed.item.PogHoeItem;
import net.mcreator.mishmashed.item.PogAxeItem;
import net.mcreator.mishmashed.item.PogArmorItem;
import net.mcreator.mishmashed.item.PingotItem;
import net.mcreator.mishmashed.item.PingoriteScrapItem;
import net.mcreator.mishmashed.item.PekoCreativeTabIconItem;
import net.mcreator.mishmashed.item.MuffinLauncherItem;
import net.mcreator.mishmashed.item.MuffinItem;
import net.mcreator.mishmashed.item.InspectahFoodItem;
import net.mcreator.mishmashed.item.GlueItem;
import net.mcreator.mishmashed.item.FunnyCookieItem;
import net.mcreator.mishmashed.item.AncientNuggetItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item POGGERRACK = register(MishmashedModBlocks.POGGERRACK, MishmashedModTabs.TAB_WHAT);
	public static final Item PEKO_CREATIVE_TAB_ICON = register(new PekoCreativeTabIconItem());
	public static final Item GLUE_BUCKET = register(new GlueItem());
	public static final Item PINGOT = register(new PingotItem());
	public static final Item POG_PICKAXE = register(new PogPickaxeItem());
	public static final Item INSPECTAH_POPPY = register(MishmashedModBlocks.INSPECTAH_POPPY, CreativeModeTab.TAB_DECORATIONS);
	public static final Item POG_AXE = register(new PogAxeItem());
	public static final Item POG_SWORD = register(new PogSwordItem());
	public static final Item POG_SHOVEL = register(new PogShovelItem());
	public static final Item INSPECTAH_FOOD = register(new InspectahFoodItem());
	public static final Item POG_HOE = register(new PogHoeItem());
	public static final Item POG_ARMOR_HELMET = register(new PogArmorItem.Helmet());
	public static final Item POG_ARMOR_CHESTPLATE = register(new PogArmorItem.Chestplate());
	public static final Item POG_ARMOR_LEGGINGS = register(new PogArmorItem.Leggings());
	public static final Item POG_ARMOR_BOOTS = register(new PogArmorItem.Boots());
	public static final Item POG_LOCATOR = register(new PogLocatorItem());
	public static final Item POMB = register(new PombItem());
	public static final Item FUNNY_COOKIE = register(new FunnyCookieItem());
	public static final Item MUFFIN_LAUNCHER = register(new MuffinLauncherItem());
	public static final Item MUFFIN = register(new MuffinItem());
	public static final Item PINGORITE_SCRAP = register(new PingoriteScrapItem());
	public static final Item POGERITE_COMPOSITE = register(new PogeriteCompositeItem());
	public static final Item SAND_PAPER = register(new SandPaperItem());
	public static final Item INSPECTAH_BLOCK = register(MishmashedModBlocks.INSPECTAH_BLOCK, MishmashedModTabs.TAB_WHAT);
	public static final Item CREEPE_PLANT = register(MishmashedModBlocks.CREEPE_PLANT, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ANCIENT_NUGGET = register(new AncientNuggetItem());
	public static final Item SIFTING_BLOCK = register(MishmashedModBlocks.SIFTING_BLOCK, MishmashedModTabs.TAB_WHAT);

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
