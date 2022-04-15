
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PurpleingotItem extends Item {

	public PurpleingotItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
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
