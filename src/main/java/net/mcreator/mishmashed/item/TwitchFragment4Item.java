
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class TwitchFragment4Item extends Item {
	public TwitchFragment4Item() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(63).rarity(Rarity.UNCOMMON));
		setRegistryName("twitch_fragment_4");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
