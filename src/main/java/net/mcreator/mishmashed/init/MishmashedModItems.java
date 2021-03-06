
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mishmashed.item.TwitchySwordItem;
import net.mcreator.mishmashed.item.TwitchyShovelItem;
import net.mcreator.mishmashed.item.TwitchyPickaxeItem;
import net.mcreator.mishmashed.item.TwitchyHoeItem;
import net.mcreator.mishmashed.item.TwitchyAxeItem;
import net.mcreator.mishmashed.item.TwitchyArmorItem;
import net.mcreator.mishmashed.item.TwitchItem;
import net.mcreator.mishmashed.item.TwitchFragmentItem;
import net.mcreator.mishmashed.item.TwitchFragment4Item;
import net.mcreator.mishmashed.item.TwitchFragment3Item;
import net.mcreator.mishmashed.item.TwitchFragment2Item;
import net.mcreator.mishmashed.item.SusfragemtItem;
import net.mcreator.mishmashed.item.SusItem;
import net.mcreator.mishmashed.item.SuperGlueItem;
import net.mcreator.mishmashed.item.SpoonItem;
import net.mcreator.mishmashed.item.SandPaperItem;
import net.mcreator.mishmashed.item.PurplyItem;
import net.mcreator.mishmashed.item.PurpleswordItem;
import net.mcreator.mishmashed.item.PurplestickItem;
import net.mcreator.mishmashed.item.PurplepickaxeItem;
import net.mcreator.mishmashed.item.PurpleingotItem;
import net.mcreator.mishmashed.item.PurplefluidItem;
import net.mcreator.mishmashed.item.PurpleflintItem;
import net.mcreator.mishmashed.item.PurpleappleItem;
import net.mcreator.mishmashed.item.PombItem;
import net.mcreator.mishmashed.item.PogeriteCompositeItem;
import net.mcreator.mishmashed.item.PogSwordItem;
import net.mcreator.mishmashed.item.PogShovelItem;
import net.mcreator.mishmashed.item.PogPickaxeItem;
import net.mcreator.mishmashed.item.PogLocatorItem;
import net.mcreator.mishmashed.item.PogItem;
import net.mcreator.mishmashed.item.PogHoeItem;
import net.mcreator.mishmashed.item.PogAxeItem;
import net.mcreator.mishmashed.item.PogArmorItem;
import net.mcreator.mishmashed.item.PingotItem;
import net.mcreator.mishmashed.item.PingoriteScrapItem;
import net.mcreator.mishmashed.item.PekoCreativeTabIconItem;
import net.mcreator.mishmashed.item.MuffinTravellerItem;
import net.mcreator.mishmashed.item.MuffinLauncherItem;
import net.mcreator.mishmashed.item.MuffinItem;
import net.mcreator.mishmashed.item.McdonaldsEmployeeItem;
import net.mcreator.mishmashed.item.InspectahFoodItem;
import net.mcreator.mishmashed.item.GreenItem;
import net.mcreator.mishmashed.item.GluebucketItem;
import net.mcreator.mishmashed.item.GlueItem;
import net.mcreator.mishmashed.item.FunnyCookieItem;
import net.mcreator.mishmashed.item.FlimsyTwitchItem;
import net.mcreator.mishmashed.item.EnchantDustItem;
import net.mcreator.mishmashed.item.CloudsSwordItem;
import net.mcreator.mishmashed.item.BlueItem;
import net.mcreator.mishmashed.item.AshCreativeTabIconItem;
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
	public static final Item INSPECTAH_POPPY = register(MishmashedModBlocks.INSPECTAH_POPPY, MishmashedModTabs.TAB_INSPECTAH_POP);
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
	public static final Item INSPECTAH_BLOCK = register(MishmashedModBlocks.INSPECTAH_BLOCK, MishmashedModTabs.TAB_INSPECTAH_POP);
	public static final Item CREEPE_PLANT = register(MishmashedModBlocks.CREEPE_PLANT, MishmashedModTabs.TAB_INSPECTAH_POP);
	public static final Item ENCHANTMENT_TABLE = register(MishmashedModBlocks.ENCHANTMENT_TABLE, CreativeModeTab.TAB_MISC);
	public static final Item ANCIENT_NUGGET = register(new AncientNuggetItem());
	public static final Item ENCHANT_DUST = register(new EnchantDustItem());
	public static final Item ENCHANT_PLANT = register(MishmashedModBlocks.ENCHANT_PLANT, MishmashedModTabs.TAB_INSPECTAH_POP);
	public static final Item SIFTING_BLOCK = register(MishmashedModBlocks.SIFTING_BLOCK, MishmashedModTabs.TAB_WHAT);
	public static final Item MUFFIN_TRAVELLER = register(new MuffinTravellerItem());
	public static final Item EXPERIENCE_FLOWER = register(MishmashedModBlocks.EXPERIENCE_FLOWER, MishmashedModTabs.TAB_HM);
	public static final Item ASH_CREATIVE_TAB_ICON = register(new AshCreativeTabIconItem());
	public static final Item EXPERIENCE_ORE = register(MishmashedModBlocks.EXPERIENCE_ORE, MishmashedModTabs.TAB_HM);
	public static final Item POG = register(new PogItem());
	public static final Item SUS_HELMET = register(new SusItem.Helmet());
	public static final Item SUS_CHESTPLATE = register(new SusItem.Chestplate());
	public static final Item SUS_LEGGINGS = register(new SusItem.Leggings());
	public static final Item SUS_BOOTS = register(new SusItem.Boots());
	public static final Item IMPOSTER = register(
			new SpawnEggItem(MishmashedModEntities.IMPOSTER, -3407872, -16724788, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("imposter_spawn_egg"));
	public static final Item SUSFRAGEMT = register(new SusfragemtItem());
	public static final Item ENTITY_MUFFIN = register(
			new SpawnEggItem(MishmashedModEntities.ENTITY_MUFFIN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("entity_muffin_spawn_egg"));
	public static final Item MUFFIN_FLOWER = register(MishmashedModBlocks.MUFFIN_FLOWER, MishmashedModTabs.TAB_HM);
	public static final Item PURPLE = register(MishmashedModBlocks.PURPLE, MishmashedModTabs.TAB_REDSTONES);
	public static final Item PURPLEINGOT = register(new PurpleingotItem());
	public static final Item PUPLEORE = register(MishmashedModBlocks.PUPLEORE, MishmashedModTabs.TAB_REDSTONES);
	public static final Item PURPLEPICKAXE = register(new PurplepickaxeItem());
	public static final Item PURPLESTICK = register(new PurplestickItem());
	public static final Item PURPLESWORD = register(new PurpleswordItem());
	public static final Item TWITCH_ORE = register(MishmashedModBlocks.TWITCH_ORE, MishmashedModTabs.TAB_WHAT);
	public static final Item SUPER_GLUE = register(new SuperGlueItem());
	public static final Item PURPLEAPPLE = register(new PurpleappleItem());
	public static final Item STUPIDITY_ORE = register(MishmashedModBlocks.STUPIDITY_ORE, MishmashedModTabs.TAB_WHAT);
	public static final Item GREEN = register(new GreenItem());
	public static final Item GLUEBUCKET = register(new GluebucketItem());
	public static final Item TWITCH_FRAGMENT = register(new TwitchFragmentItem());
	public static final Item BLUE = register(new BlueItem());
	public static final Item TWITCH_FRAGMENT_2 = register(new TwitchFragment2Item());
	public static final Item PURPLEFLUID_BUCKET = register(new PurplefluidItem());
	public static final Item TWITCH_FRAGMENT_3 = register(new TwitchFragment3Item());
	public static final Item PURPLY = register(new PurplyItem());
	public static final Item TWITCH_FRAGMENT_4 = register(new TwitchFragment4Item());
	public static final Item PURPLEGRAVEL = register(MishmashedModBlocks.PURPLEGRAVEL, MishmashedModTabs.TAB_REDSTONES);
	public static final Item PURPLEFLINT = register(new PurpleflintItem());
	public static final Item SPOON = register(new SpoonItem());
	public static final Item FLIMSY_TWITCH = register(new FlimsyTwitchItem());
	public static final Item TWITCH = register(new TwitchItem());
	public static final Item MCDONALDS_EMPLOYEE = register(new McdonaldsEmployeeItem());
	public static final Item TWITCHY_PICKAXE = register(new TwitchyPickaxeItem());
	public static final Item TWITCHY_AXE = register(new TwitchyAxeItem());
	public static final Item CLOUDS_SWORD = register(new CloudsSwordItem());
	public static final Item TWITCHY_SWORD = register(new TwitchySwordItem());
	public static final Item TWITCHY_SHOVEL = register(new TwitchyShovelItem());
	public static final Item TWITCHY_HOE = register(new TwitchyHoeItem());
	public static final Item TWITCHY_ARMOR_HELMET = register(new TwitchyArmorItem.Helmet());
	public static final Item TWITCHY_ARMOR_CHESTPLATE = register(new TwitchyArmorItem.Chestplate());
	public static final Item TWITCHY_ARMOR_LEGGINGS = register(new TwitchyArmorItem.Leggings());
	public static final Item TWITCHY_ARMOR_BOOTS = register(new TwitchyArmorItem.Boots());

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
