
package net.mcreator.mishmashed.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StupidityOreBlock extends FallingBlock {

	public StupidityOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.SLIME_BLOCK).strength(1.25f, 10f).requiresCorrectToolForDrops()
				.friction(1f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));

		setRegistryName("stupidity_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public MaterialColor defaultMaterialColor() {
		return MaterialColor.SAND;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MishmashedModItems.DELETED_MOD_ELEMENT));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 1; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.1D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.1D * 100;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.1D;
			world.addParticle(ParticleTypes.NOTE, x0, y0, z0, 0, 0, 0);
		}
	}

}
