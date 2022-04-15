
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PurplestickItem extends Item {

	public PurplestickItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("purplestick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
