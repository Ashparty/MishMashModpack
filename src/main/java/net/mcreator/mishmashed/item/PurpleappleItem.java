
package net.mcreator.mishmashed.item;

public class PurpleappleItem extends Item {

	public PurpleappleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(100).saturationMod(100f).alwaysEat()

						.build()));
		setRegistryName("purpleapple");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 20;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.TOTEM_OF_UNDYING);
		super.finishUsingItem(itemstack, world, entity);

		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

}
