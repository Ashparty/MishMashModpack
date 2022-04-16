
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class McdonaldsEmployeeItem extends AxeItem {
	public McdonaldsEmployeeItem() {
		super(new Tier() {
			public int getUses() {
				return 410;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.POTATO));
			}
		},

				1, -3f,

				new Item.Properties().tab(MishmashedModTabs.TAB_HM));

		setRegistryName("mcdonalds_employee");
	}

}
