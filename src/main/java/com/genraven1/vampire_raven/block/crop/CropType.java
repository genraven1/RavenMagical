package com.genraven1.vampire_raven.block.crop;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum CropType implements StringRepresentable {
    AGE("top"),
    BOTTOM("bottom"),
    DOUBLE("double");
    private final String name;

    private CropType(final String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}
