package com.genraven1.vampire_raven.fluid;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

public class WeakBlood extends RavenBlood {

    public static final String CODE_NAME = "weak_blood";

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Weak Blood";
    }

    @Override
    public String getLanguageCodeName() {
        return null;
    }

    @Override
    public @NotNull Item getBucket() {
        return null;
    }

    @Override
    public @NotNull Fluid getFlowing() {
        return null;
    }

    @Override
    public @NotNull Fluid getSource() {
        return null;
    }
}
