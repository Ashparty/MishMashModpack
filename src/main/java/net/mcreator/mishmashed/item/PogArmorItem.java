
package net.mcreator.mishmashed.item;

import net.minecraft.sounds.SoundEvent;

public abstract class PogArmorItem extends ArmorItem {

	public PogArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{15, 50, 55, 25}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 95;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:poggers"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MishmashedModItems.PINGOT));
			}

			@Override
			public String getName() {
				return "pog_armor";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PogArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("pog_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/layer_1_layer_1.png";
		}

	}

	public static class Chestplate extends PogArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("pog_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/layer_1_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PogArmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends PogArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("pog_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/layer_1_layer_2.png";
		}

	}

	public static class Boots extends PogArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MishmashedModTabs.TAB_WHAT).fireResistant());

			setRegistryName("pog_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/layer_1_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PogArmorBootsTickEventProcedure.execute(entity);
		}
	}

}
