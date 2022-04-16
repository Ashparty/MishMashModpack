
package net.mcreator.mishmashed.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModItems;

public class TwitchyHoeItem extends HoeItem {
	public TwitchyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3553;
			}

			public float getSpeed() {
				return 15.5f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 64;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.TWITCH));
			}
		}, 0, -3f, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());
		setRegistryName("twitchy_hoe");
	}
}
