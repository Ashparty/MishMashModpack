
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AshCreativeTabIconItem extends Item {
	public AshCreativeTabIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("ash_creative_tab_icon");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
