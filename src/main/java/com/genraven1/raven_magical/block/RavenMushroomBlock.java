package com.genraven1.raven_magical.block;

import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public abstract class RavenMushroomBlock extends MushroomBlock {

    public RavenMushroomBlock(final DyeColor color) {
        super(BlockBehaviour.Properties.of(Material.PLANT, color), () -> TreeFeatures.HUGE_BROWN_MUSHROOM);
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();
}
