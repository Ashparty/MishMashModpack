
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PurplefluidBlock extends LiquidBlock {
	public PurplefluidBlock() {
		super(MishmashedModFluids.PURPLEFLUID, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_PURPLE).strength(1f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15));
		setRegistryName("purplefluid");
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 70;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 47;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}