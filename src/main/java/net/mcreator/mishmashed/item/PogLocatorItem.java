
package net.mcreator.mishmashed.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PogLocatorItem extends Item {

	public PogLocatorItem() {
		super(new Item.Properties().tab(MishmashedModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("pog_locator");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PogLocatorRightClickedInAirProcedure.execute(entity);
		return ar;
	}

}
