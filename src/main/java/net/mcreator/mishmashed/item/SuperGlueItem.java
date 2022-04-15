
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class SuperGlueItem extends Item {
	public SuperGlueItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("super_glue");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
