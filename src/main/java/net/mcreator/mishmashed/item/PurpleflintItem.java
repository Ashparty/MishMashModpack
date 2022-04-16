
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.mishmashed.init.MishmashedModTabs;

import java.util.List;

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
