package com.genraven1.raven_magical.block;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public abstract class BasicMushroomPot extends BaseMushroomPot {

    public BasicMushroomPot(final Supplier<? extends Block> content) {
        super(content);
    }
}
