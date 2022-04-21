package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.util.RavenUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class BasicMushroomPot extends BaseMushroomPot {

    public static final String CODE_NAME = "basic_mushroom_pot";

    public BasicMushroomPot() {
        super(() -> Blocks.AIR);
    }

    public BasicMushroomPot(final Supplier<? extends Block> content) {
        super(content);
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Basic Mushroom Pot";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_BLOCK + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.BLOCK_PATH + CODE_NAME;
    }
}
