
package net.mcreator.mishmashed.item;

import net.minecraft.network.chat.Component;

public class GlueItem extends BucketItem {

	public GlueItem() {
		super(() -> MishmashedModFluids.GLUE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("glue_bucket");
	}

}
