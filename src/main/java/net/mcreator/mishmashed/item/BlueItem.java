
package net.mcreator.mishmashed.item;

import net.minecraft.network.chat.Component;

public class BlueItem extends RecordItem {

	public BlueItem() {
		super(0, MishmashedModSounds.REGISTRY.get(new ResourceLocation("mishmashed:letsanotgo")),
				new Item.Properties().tab(MishmashedModTabs.TAB_HM).stacksTo(1).rarity(Rarity.RARE));

		setRegistryName("blue");
	}

}
