
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PekoCreativeTabIconItem extends Item {
	public PekoCreativeTabIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("peko_creative_tab_icon");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
