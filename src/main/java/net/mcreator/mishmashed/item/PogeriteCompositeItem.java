
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PogeriteCompositeItem extends Item {

	public PogeriteCompositeItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("pogerite_composite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
