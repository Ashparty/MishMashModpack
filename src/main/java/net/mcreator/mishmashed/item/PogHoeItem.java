
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModItems;

public class PogHoeItem extends HoeItem {
	public PogHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 15;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.PINGOT));
			}
		}, 0, -3f, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());
		setRegistryName("pog_hoe");
	}
}
