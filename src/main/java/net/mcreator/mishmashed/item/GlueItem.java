
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mishmashed.init.MishmashedModFluids;

public class GlueItem extends BucketItem {
	public GlueItem() {
		super(() -> MishmashedModFluids.GLUE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("glue_bucket");
	}
}
