
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModSounds;

public class BlueItem extends RecordItem {
	public BlueItem() {
		super(0, MishmashedModSounds.REGISTRY.get(new ResourceLocation("mishmashed:letsanotgo")),
				new Item.Properties().tab(MishmashedModTabs.TAB_HM).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("blue");
	}
}
