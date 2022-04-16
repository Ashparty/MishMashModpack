
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TwitchItem extends Item {

	public TwitchItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("twitch");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
