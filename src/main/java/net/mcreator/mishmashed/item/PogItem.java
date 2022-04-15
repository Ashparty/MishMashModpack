
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mishmashed.procedures.PogFoodEatenProcedure;
import net.mcreator.mishmashed.init.MishmashedModTabs;

public class PogItem extends Item {
	public PogItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(15).saturationMod(10f).alwaysEat().meat().build()));
		setRegistryName("pog");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PogFoodEatenProcedure.execute(world, x, y, z);
		return retval;
	}
}
