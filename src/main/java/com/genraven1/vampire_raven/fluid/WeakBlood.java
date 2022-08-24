package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.item.ModItems;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public abstract class WeakBlood extends RavenBlood {

    public static class Flowing extends WeakBlood {

    }

    public static class Source extends WeakBlood {

    }














    public static final String CODE_NAME = "weak_blood";
    public static final String BUCKET_CODE_NAME = CODE_NAME + RavenUtils.BUCKET_SUFFIX;

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public @NotNull Item getBucket() {
        return ModItems.WEAK_BLOOD_BUCKET.get();
    }

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

    @Override
    protected void beforeDestroyingBlock(final @NotNull LevelAccessor level, final @NotNull BlockPos pos, final @NotNull BlockState state) {
        Block.dropResources(state, level, pos, state.hasBlockEntity() ? level.getBlockEntity(pos) : null);
    }

    @Override
    protected int getSlopeFindDistance(LevelReader pLevel) {
        return 0;
    }

    @Override
    protected int getDropOff(LevelReader pLevel) {
        return 0;
    }

    @Override
    public int getAmount(FluidState pState) {
        return 0;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState pFluidState, BlockGetter pBlockReader, BlockPos pPos, Fluid pFluid, Direction pDirection) {
        return false;
    }

    @Override
    public int getTickDelay(LevelReader p_76120_) {
        return 0;
    }

    @Override
    protected float getExplosionResistance() {
        return 0;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState pState) {
        return null;
    }
}
