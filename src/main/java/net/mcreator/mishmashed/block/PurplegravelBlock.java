
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PurplegravelBlock extends FallingBlock {

	public PurplegravelBlock() {
		super(BlockBehaviour.Properties.of(Material.CLAY).sound(SoundType.GRAVEL).strength(0.35f, 2.5f).lightLevel(s -> 15).friction(5f)
				.jumpFactor(10f));

		setRegistryName("purplegravel");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MishmashedModItems.DELETED_MOD_ELEMENT));
	}

}
