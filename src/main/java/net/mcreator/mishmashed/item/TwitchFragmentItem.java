
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TwitchFragmentItem extends Item {

	public TwitchFragmentItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(63).rarity(Rarity.UNCOMMON));
		setRegistryName("twitch_fragment");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
