
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class PurpleingotItem extends Item {
	public PurpleingotItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_REDSTONES).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("purpleingot");
	}

	@Override
	public int getEnchantmentValue() {
		return 30;
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
