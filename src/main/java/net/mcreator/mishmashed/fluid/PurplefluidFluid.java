
package net.mcreator.mishmashed.fluid;

public abstract class PurplefluidFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MishmashedModFluids.PURPLEFLUID,
			() -> MishmashedModFluids.FLOWING_PURPLEFLUID,
			FluidAttributes.builder(new ResourceLocation("mishmashed:blocks/untitled"), new ResourceLocation("mishmashed:blocks/untitled"))

					.temperature(283)

					.rarity(Rarity.EPIC).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chain.fall"))))
							.explosionResistance(1f).canMultiply()

							.bucket(() -> MishmashedModItems.PURPLEFLUID_BUCKET).block(() -> (LiquidBlock) MishmashedModBlocks.PURPLEFLUID);

	private PurplefluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE;
	}

	public static class Source extends PurplefluidFluid {
		public Source() {
			super();
			setRegistryName("purplefluid");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PurplefluidFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_purplefluid");
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
