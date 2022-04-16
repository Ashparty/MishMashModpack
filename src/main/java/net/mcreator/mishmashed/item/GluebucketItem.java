
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class GluebucketItem extends Item {

	public GluebucketItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("gluebucket");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
