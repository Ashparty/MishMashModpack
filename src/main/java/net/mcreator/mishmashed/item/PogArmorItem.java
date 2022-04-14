
package net.mcreator.mishmashed.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mishmashed.procedures.PogArmorBootsTickEventProcedure;
import net.mcreator.mishmashed.procedures.PogArmorBodyTickEventProcedure;
import net.mcreator.mishmashed.procedures.FullPogProcedure;
import net.mcreator.mishmashed.init.MishmashedModTabs;
import net.mcreator.mishmashed.init.MishmashedModItems;

public abstract class PogArmorItem extends ArmorItem {
	public PogArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 12, 16, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
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
				return 4.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
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

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			FullPogProcedure.execute(entity);
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
