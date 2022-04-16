
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TwitchyPickaxeItem extends PickaxeItem {
	public TwitchyPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3553;
			}

			public float getSpeed() {
				return 15.5f;
			}

			public float getAttackDamageBonus() {
				return 7.1f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 64;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.DELETED_MOD_ELEMENT));
			}
		},

				1, -3f,

				new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

		setRegistryName("twitchy_pickaxe");
	}

}
