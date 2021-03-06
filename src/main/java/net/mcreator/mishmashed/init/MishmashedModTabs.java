
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MishmashedModTabs {
	public static CreativeModeTab TAB_WHAT;
	public static CreativeModeTab TAB_HM;
	public static CreativeModeTab TAB_HELL;
	public static CreativeModeTab TAB_REDSTONES;
	public static CreativeModeTab TAB_INSPECTAH_POP;

	public static void load() {
		TAB_WHAT = new CreativeModeTab("tabwhat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MishmashedModItems.PEKO_CREATIVE_TAB_ICON);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_HM = new CreativeModeTab("tabhm") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MishmashedModItems.ASH_CREATIVE_TAB_ICON);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_HELL = new CreativeModeTab("tabhell") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MishmashedModItems.SUS_BOOTS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_REDSTONES = new CreativeModeTab("tabredstones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.REDSTONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_INSPECTAH_POP = new CreativeModeTab("tabinspectah_pop") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MishmashedModBlocks.INSPECTAH_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
