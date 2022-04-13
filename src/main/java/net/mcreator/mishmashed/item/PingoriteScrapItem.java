
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PingoriteScrapItem extends Item {

	public PingoriteScrapItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("pingorite_scrap");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
