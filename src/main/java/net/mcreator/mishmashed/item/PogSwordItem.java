
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PogSwordItem extends SwordItem {
	public PogSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 41f;
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

				3, -2f,

				new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

		setRegistryName("pog_sword");
	}

}
