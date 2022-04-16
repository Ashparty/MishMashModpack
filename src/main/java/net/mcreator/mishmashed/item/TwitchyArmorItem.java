
package net.mcreator.mishmashed.item;

import net.minecraft.sounds.SoundEvent;

public abstract class TwitchyArmorItem extends ArmorItem {

	public TwitchyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 69;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 28, 24, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 42;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:poggers"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.DELETED_MOD_ELEMENT));
			}

			@Override
			public String getName() {
				return "twitchy_armor";
			}

			@Override
			public float getToughness() {
				return 6.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TwitchyArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("twitchy_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/twitchy_layer_1.png";
		}

	}

	public static class Chestplate extends TwitchyArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("twitchy_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/twitchy_layer_1.png";
		}

	}

	public static class Leggings extends TwitchyArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("twitchy_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/twitchy_layer_2.png";
		}

	}

	public static class Boots extends TwitchyArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("twitchy_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/twitchy_layer_1.png";
		}

	}

}
