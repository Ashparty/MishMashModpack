
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

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
