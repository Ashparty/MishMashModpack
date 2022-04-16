
package net.mcreator.mishmashed.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class InspectahFoodItem extends Item {
	public InspectahFoodItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_INSPECTAH_POP).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f)

						.build()));
		setRegistryName("inspectah_food");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 10;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.COCOA_BEANS);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
