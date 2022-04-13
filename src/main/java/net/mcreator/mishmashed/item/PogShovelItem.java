
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PogShovelItem extends ShovelItem {
	public PogShovelItem() {
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
		},

				1, -3f,

				new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

		setRegistryName("pog_shovel");
	}

}
