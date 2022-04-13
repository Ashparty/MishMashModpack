
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.mishmashed.procedures.GlueMobplayerCollidesBlockProcedure;
import net.mcreator.mishmashed.init.MishmashedModFluids;

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
