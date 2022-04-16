
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModFluids;

public class PurplefluidItem extends BucketItem {
	public PurplefluidItem() {
		super(() -> MishmashedModFluids.PURPLEFLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(MishmashedModTabs.TAB_REDSTONES));
		setRegistryName("purplefluid_bucket");
	}
}
