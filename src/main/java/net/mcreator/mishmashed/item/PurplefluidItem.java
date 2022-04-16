
package net.mcreator.mishmashed.item;

import net.minecraft.network.chat.Component;

public class PurplefluidItem extends BucketItem {

	public PurplefluidItem() {
		super(() -> MishmashedModFluids.PURPLEFLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(MishmashedModTabs.TAB_REDSTONES));
		setRegistryName("purplefluid_bucket");
	}

}
