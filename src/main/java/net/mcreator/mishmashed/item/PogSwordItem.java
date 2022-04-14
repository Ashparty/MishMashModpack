
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModItems;

public class PogSwordItem extends SwordItem {
	public PogSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2532;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 15;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.PINGOT));
			}
		}, 3, -2.3f, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());
		setRegistryName("pog_sword");
	}
}
