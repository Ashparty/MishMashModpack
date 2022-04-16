
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class FlimsyTwitchItem extends Item {
	public FlimsyTwitchItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("flimsy_twitch");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
