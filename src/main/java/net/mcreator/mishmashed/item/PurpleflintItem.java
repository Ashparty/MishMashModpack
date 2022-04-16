
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PurpleflintItem extends Item {

	public PurpleflintItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_REDSTONES).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("purpleflint");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("flinty be plurply"));
	}

}
