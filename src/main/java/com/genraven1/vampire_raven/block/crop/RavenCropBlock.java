package com.genraven1.vampire_raven.block.crop;

import net.minecraft.world.level.block.CropBlock;

public abstract class RavenCropBlock extends CropBlock {
    public RavenCropBlock(final Properties properties) {
        super(properties);
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
