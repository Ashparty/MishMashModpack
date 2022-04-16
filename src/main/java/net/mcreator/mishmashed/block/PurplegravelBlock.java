
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mishmashed.init.MishmashedModItems;

import java.util.List;
import java.util.Collections;

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
		return Collections.singletonList(new ItemStack(MishmashedModItems.PURPLEFLINT));
	}
}
