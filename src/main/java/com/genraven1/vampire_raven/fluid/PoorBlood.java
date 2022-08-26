package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.item.ModItems;
import com.genraven1.vampire_raven.item.RavenBucketItem;
import com.genraven1.vampire_raven.util.FluidUtils;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.jetbrains.annotations.NotNull;

public abstract class PoorBlood extends RavenBlood {

    public static final String CODE_NAME = "poor_blood";
    public static final String BLOCK_CODE_NAME = CODE_NAME + RavenUtils.BLOCK_SUFFIX;
    public static final String FLOWING_CODE_NAME = CODE_NAME + RavenUtils.FLOWING_SUFFIX;
    public static final String BUCKET_CODE_NAME = CODE_NAME + RavenUtils.BUCKET_SUFFIX;

    public static final String SOURCE_CODE_NAME = CODE_NAME + "_source";

    public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = FluidUtils.createFluidProperties(ModFluids.SOURCE_WEAK_BLOOD, ModFluids.FLOWING_WEAK_BLOOD, 0xbffbfbf, ModItems.WEAK_BLOOD_BUCKET);

    protected PoorBlood() {
        super(BLOOD_PROPERTIES);
    }

    @Override
    public @NotNull Fluid getFlowing() {
        return ModFluids.FLOWING_WEAK_BLOOD.get();
    }

    @Override
    public @NotNull Fluid getSource() {
        return ModFluids.SOURCE_WEAK_BLOOD.get();
    }

    @Override
    public @NotNull Item getBucket() {
        return ModItems.WEAK_BLOOD_BUCKET.get();
    }

    public static class Source extends RavenFlowingFluid.Source {

        public Source() {
            super(BLOOD_PROPERTIES);
        }

        @Override
        public String getCodeName() {
            return SOURCE_CODE_NAME;
        }

        public int getAmount(final @NotNull FluidState state) {
            return 8;
        }

        public boolean isSource(final @NotNull FluidState state) {
            return true;
        }
    }

    public static class Flowing extends PoorBlood {

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

    public static class Bucket extends RavenBucketItem {

        public Bucket() {
            super(ModFluids.SOURCE_WEAK_BLOOD.get());
        }

        @Override
        public String getCodeName() {
            return BUCKET_CODE_NAME;
        }

        @Override
        public String getEnglishName() {
            return "Weak Blood Bucket";
        }

        @Override
        public String getLanguageCodeName() {
            return RavenUtils.LANG_ITEM + BUCKET_CODE_NAME;
        }

        @Override
        public String getCodePath() {
            return RavenUtils.ITEM_PATH + BUCKET_CODE_NAME;
        }
    }
}
