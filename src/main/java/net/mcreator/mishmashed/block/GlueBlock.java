
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GlueBlock extends LiquidBlock {
	public GlueBlock() {
		super(MishmashedModFluids.GLUE, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.SNOW).strength(100f)

		);
		setRegistryName("glue");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 11;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		GlueMobplayerCollidesBlockProcedure.execute(entity);
	}

}