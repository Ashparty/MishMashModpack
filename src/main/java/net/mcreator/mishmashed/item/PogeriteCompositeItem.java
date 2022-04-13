
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class PogeriteCompositeItem extends Item {
	public PogeriteCompositeItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("pogerite_composite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
