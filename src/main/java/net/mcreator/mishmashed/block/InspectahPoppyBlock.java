
package net.mcreator.mishmashed.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mishmashed.init.MishmashedModBlocks;

import java.util.List;
import java.util.Collections;

public class InspectahPoppyBlock extends FlowerBlock {
	public InspectahPoppyBlock() {
		super(MobEffects.DIG_SPEED, 100,
				BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.NONE).noCollission()
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("mishmashed:gluebucket")),
								() -> new SoundEvent(new ResourceLocation("mishmashed:gluebucket")),
								() -> new SoundEvent(new ResourceLocation("mishmashed:gluebucket")),
								() -> new SoundEvent(new ResourceLocation("mishmashed:gluebucket")),
								() -> new SoundEvent(new ResourceLocation("mishmashed:gluebucket"))))
						.instabreak());
		setRegistryName("inspectah_poppy");
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Gives haste when made into sus stew"));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 3));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MishmashedModBlocks.INSPECTAH_POPPY, renderType -> renderType == RenderType.cutout());
	}
}
