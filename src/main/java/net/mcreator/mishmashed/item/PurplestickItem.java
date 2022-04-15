
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class PurplestickItem extends Item {
	public PurplestickItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_REDSTONES).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("purplestick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
