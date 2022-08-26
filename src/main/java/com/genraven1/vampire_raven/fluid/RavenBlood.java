package com.genraven1.vampire_raven.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public abstract class RavenBlood extends RavenFlowingFluid {

    protected RavenBlood(final Properties properties) {
        super(properties);
    }
    @Override
    protected boolean canConvertToSource() {
        return true;
    }

    @Nullable
    public ParticleOptions getDripParticle() {
        return ParticleTypes.DRIPPING_WATER;
    }

    @Override
    public int getTickDelay(final @NotNull LevelReader level) {
        return 5;
    }

    @Override
    protected boolean canBeReplacedWith(final @NotNull FluidState state, final @NotNull BlockGetter getter, final @NotNull BlockPos pos, final @NotNull Fluid fluid, final @NotNull Direction direction) {
        return direction == Direction.DOWN && !fluid.is(FluidTags.WATER);
    }

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }

    @Override
    protected @NotNull BlockState createLegacyBlock(final @NotNull FluidState state) {
        return Blocks.WATER.defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
    }

    @Override
    protected void beforeDestroyingBlock(final @NotNull LevelAccessor level, final @NotNull BlockPos pos, final @NotNull BlockState state) {

    }

    public int getSlopeFindDistance(final @NotNull LevelReader level) {
        return 4;
    }

    @Override
    protected int getDropOff(final @NotNull LevelReader level) {
        return 1;
    }
}
