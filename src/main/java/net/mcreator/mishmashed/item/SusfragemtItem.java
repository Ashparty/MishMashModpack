
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SusfragemtItem extends Item {

	public SusfragemtItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_HELL).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("susfragemt");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

}
