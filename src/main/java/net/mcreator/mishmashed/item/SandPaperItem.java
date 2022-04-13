
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SandPaperItem extends Item {

	public SandPaperItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("sand_paper");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
