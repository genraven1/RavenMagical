package com.genraven1.raven_magical.block;

import net.minecraft.world.level.block.Block;

public abstract class RavenBlock extends Block {
    public RavenBlock(final Properties properties) {
        super(properties);
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
