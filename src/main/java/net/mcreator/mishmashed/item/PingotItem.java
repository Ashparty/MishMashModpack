
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PingotItem extends Item {

	public PingotItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(63).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("pingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
