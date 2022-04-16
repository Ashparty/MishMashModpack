
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CloudsSwordItem extends SwordItem {
	public CloudsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.GREEN));
			}
		},

				3, -2.6f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());

		setRegistryName("clouds_sword");
	}

}
