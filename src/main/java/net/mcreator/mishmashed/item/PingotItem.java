
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class PingotItem extends Item {
	public PingotItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(63).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("pingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
