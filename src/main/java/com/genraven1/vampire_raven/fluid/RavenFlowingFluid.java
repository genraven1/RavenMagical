package com.genraven1.vampire_raven.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

public abstract class RavenFlowingFluid extends ForgeFlowingFluid {

    protected RavenFlowingFluid(final Properties properties) {
        super(properties);
    }

    public abstract String getCodeName();

    public static abstract class Source extends ForgeFlowingFluid.Source {

        public Source(final Properties properties) {
            super(properties);
        }

        public abstract String getCodeName();
    }
}
