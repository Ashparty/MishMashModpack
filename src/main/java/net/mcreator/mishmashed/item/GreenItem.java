
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class GreenItem extends Item {

	public GreenItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_HM).stacksTo(7).rarity(Rarity.UNCOMMON));
		setRegistryName("green");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
