
package net.mcreator.mishmashed.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.mishmashed.init.MishmashedModItems;
import net.mcreator.mishmashed.init.MishmashedModFluids;
import net.mcreator.mishmashed.init.MishmashedModBlocks;

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
