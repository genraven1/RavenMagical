package com.genraven1.vampire_raven.block;

import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.world.level.block.Blocks;

public class BasicEmptyMushroomPot extends BasicMushroomPot {

    public static final String CODE_NAME = "basic_empty_mushroom_pot";

    public BasicEmptyMushroomPot() {
        super(() -> Blocks.AIR);
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Basic Empty Mushroom Pot";
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
