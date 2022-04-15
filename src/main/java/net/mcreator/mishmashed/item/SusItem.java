
package net.mcreator.mishmashed.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mishmashed.init.MishmashedModTabs;

public abstract class SusItem extends ArmorItem {
	public SusItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 12, 15, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 50;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:sus"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.WET_SPONGE));
			}

			@Override
			public String getName() {
				return "sus";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SusItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MishmashedModTabs.TAB_HELL));
			setRegistryName("sus_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/sus_layer_1.png";
		}
	}

	public static class Chestplate extends SusItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MishmashedModTabs.TAB_HELL));
			setRegistryName("sus_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/sus_layer_1.png";
		}
	}

	public static class Leggings extends SusItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MishmashedModTabs.TAB_HELL));
			setRegistryName("sus_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/sus_layer_2.png";
		}
	}

	public static class Boots extends SusItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MishmashedModTabs.TAB_HELL));
			setRegistryName("sus_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mishmashed:textures/models/armor/sus_layer_1.png";
		}
	}
}
