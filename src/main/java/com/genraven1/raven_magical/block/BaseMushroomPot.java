package com.genraven1.raven_magical.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public abstract class BaseMushroomPot extends FlowerPotBlock {
    public BaseMushroomPot(final Supplier<? extends Block> content) {
        super(() -> (FlowerPotBlock) Blocks.FLOWER_POT.delegate.get(), content, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT));
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
