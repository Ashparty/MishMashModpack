
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CorruptedTestItem extends Item {
	public CorruptedTestItem() {e
		super(new Item.Properties().tab(CwreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("corrupted_test");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
