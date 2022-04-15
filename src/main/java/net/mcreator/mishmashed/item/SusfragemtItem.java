
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class SusfragemtItem extends Item {
	public SusfragemtItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_HELL).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("susfragemt");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
