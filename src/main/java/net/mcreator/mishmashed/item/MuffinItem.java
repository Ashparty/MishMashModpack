
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.mishmashed.procedures.MuffinFoodEatenProcedure;
import net.mcreator.mishmashed.init.MishmashedModTabs;

import java.util.List;

public class MuffinItem extends Item {
	public MuffinItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_HM).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(4f).alwaysEat()

						.build()));
		setRegistryName("muffin");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 14;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Hmm... Definitely not from another mod"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MuffinFoodEatenProcedure.execute(entity);
		return retval;
	}
}
