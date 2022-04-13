
package net.mcreator.mishmashed.fluid;

public abstract class GlueFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MishmashedModFluids.GLUE,
			() -> MishmashedModFluids.FLOWING_GLUE,
			FluidAttributes.builder(new ResourceLocation("mishmashed:blocks/new_project_5"), new ResourceLocation("mishmashed:blocks/new_project_6"))

					.density(10000).viscosity(10000)

					.rarity(Rarity.RARE).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:gluebucket"))))
							.explosionResistance(100f)

							.tickRate(23).levelDecreasePerBlock(2)

							.bucket(() -> MishmashedModItems.GLUE_BUCKET).block(() -> (LiquidBlock) MishmashedModBlocks.GLUE);

	private GlueFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(4.8999999999999995);
	}

	public static class Source extends GlueFluid {
		public Source() {
			super();
			setRegistryName("glue");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GlueFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_glue");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}

}
