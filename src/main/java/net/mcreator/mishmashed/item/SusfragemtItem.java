
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SusfragemtItem extends Item {

	public SusfragemtItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("susfragemt");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
