package com.genraven1.vampire_raven.item.block;

import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public abstract class SeedRavenBlockItem extends RavenBlockItem {
    public static final ResourceLocation RESOURCE_LOCATION = RavenUtils.getResourceLocation("blood_seed");

    public SeedRavenBlockItem(final Block block) {
        super(block);
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
