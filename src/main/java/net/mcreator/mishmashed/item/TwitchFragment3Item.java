
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TwitchFragment3Item extends Item {

	public TwitchFragment3Item() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(63).rarity(Rarity.UNCOMMON));
		setRegistryName("twitch_fragment_3");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
