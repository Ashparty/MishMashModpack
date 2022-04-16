
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class EnchantDustItem extends Item {
	public EnchantDustItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_INSPECTAH_POP).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("enchant_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
