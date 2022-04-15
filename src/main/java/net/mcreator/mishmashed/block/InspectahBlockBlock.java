
package net.mcreator.mishmashed.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class InspectahBlockBlock extends Block {
	public InspectahBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("mishmashed:inspectahblockbreaks")),
						() -> new SoundEvent(new ResourceLocation("mishmashed:inblockabient")),
						() -> new SoundEvent(new ResourceLocation("mishmashed:inblockabient")),
						() -> new SoundEvent(new ResourceLocation("mishmashed:inblockabient")),
						() -> new SoundEvent(new ResourceLocation("mishmashed:inblockabient"))))
				.strength(0.3f, 10f));
		setRegistryName("inspectah_block");
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
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
