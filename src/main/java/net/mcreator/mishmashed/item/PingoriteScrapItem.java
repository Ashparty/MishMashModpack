
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

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
