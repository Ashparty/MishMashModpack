
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TwitchyAxeItem extends AxeItem {
	public TwitchyAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3553;
			}

			public float getSpeed() {
				return 15.5f;
			}

			public float getAttackDamageBonus() {
				return 40f;
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
		},

				1, -2.5f,

				new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

		setRegistryName("twitchy_axe");
	}

}
