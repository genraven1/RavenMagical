package com.genraven1.vampire_raven.util;

import com.genraven1.vampire_raven.block.fluid.RavenLiquidBlock;
import com.genraven1.vampire_raven.fluid.RavenFlowingFluid;
import com.genraven1.vampire_raven.item.RavenBucketItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.function.Supplier;

public class FluidUtils {

    public static ForgeFlowingFluid.Properties createFluidProperties(final Supplier<? extends RavenFlowingFluid.Source> fluid, final Supplier<? extends RavenFlowingFluid> flowingFluid, final int color, final Supplier<? extends RavenLiquidBlock> block, final Supplier<? extends RavenBucketItem> bucket) {
        return new ForgeFlowingFluid.Properties(fluid, flowingFluid, FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"))
                .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(new ResourceLocation("block/water_overlay"))
                .color(color)).slopeFindDistance(2).levelDecreasePerBlock(2).block(block).bucket(bucket);
    }

    public static ForgeFlowingFluid.Properties createFluidProperties(final Supplier<? extends RavenFlowingFluid.Source> fluid, final Supplier<? extends RavenFlowingFluid> flowingFluid, final int color, final Supplier<? extends RavenBucketItem> bucket) {
        return new ForgeFlowingFluid.Properties(fluid, flowingFluid, FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"))
                .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(new ResourceLocation("block/water_overlay"))
                .color(color)).slopeFindDistance(2).levelDecreasePerBlock(2).bucket(bucket);
    }
}
