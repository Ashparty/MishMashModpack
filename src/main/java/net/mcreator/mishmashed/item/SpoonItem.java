
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public class SpoonItem extends ShovelItem {
	public SpoonItem() {
		super(new Tier() {
			public int getUses() {
				return 361;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.MILK_BUCKET));
			}
		}, 1, -1f, new Item.Properties().tab(MishmashedModTabs.TAB_HM).fireResistant());
		setRegistryName("spoon");
	}
}
