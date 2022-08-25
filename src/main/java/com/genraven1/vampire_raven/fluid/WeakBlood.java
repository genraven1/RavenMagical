package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.item.ModItems;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public abstract class WeakBlood extends RavenBlood {

    public static final String CODE_NAME = "weak_blood";
    public static final String FLOWING_CODE_NAME = CODE_NAME + RavenUtils.FLOWING_SUFFIX;

    @Override
    public @NotNull Fluid getFlowing() {
        return ModFluids.FLOWING_WEAK_BLOOD.get();
    }

    @Override
    public @NotNull Fluid getSource() {
        return ModFluids.WEAK_BLOOD.get();
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
    protected boolean canBeReplacedWith(final @NotNull FluidState state, final @NotNull BlockGetter getter, final @NotNull BlockPos pos, final @NotNull Fluid fluid, final @NotNull Direction direction) {
        return direction == Direction.DOWN && !fluid.is(FluidTags.WATER);
    }

    @Override
    public int getTickDelay(final @NotNull LevelReader level) {
        return 5;
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
        Block.dropResources(state, level, pos, state.hasBlockEntity() ? level.getBlockEntity(pos) : null);
    }

    public int getSlopeFindDistance(final @NotNull LevelReader level) {
        return 4;
    }

    @Override
    protected int getDropOff(final @NotNull LevelReader level) {
        return 1;
    }

    @Override
    public @NotNull Item getBucket() {
        return ModItems.WEAK_BLOOD_BUCKET.get();
    }

    public static class Source extends WeakBlood {

        @Override
        public String getCodeName() {
            return CODE_NAME;
        }

        public int getAmount(final @NotNull FluidState state) {
            return 8;
        }

        public boolean isSource(final @NotNull FluidState state) {
            return true;
        }
    }

    public static class Flowing extends WeakBlood {

        @Override
        public String getCodeName() {
            return FLOWING_CODE_NAME;
        }

        protected void createFluidStateDefinition(final StateDefinition.@NotNull Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(final FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(final @NotNull FluidState state) {
            return false;
        }
    }
}
