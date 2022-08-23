package com.genraven1.vampire_raven.block.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Material;

public class RavenLiquidBlock extends LiquidBlock {
    public RavenLiquidBlock(final FlowingFluid flowingFluid) {
        super(() -> flowingFluid, BlockBehaviour.Properties.of(Material.WATER).noCollission().noDrops());
    }
}
