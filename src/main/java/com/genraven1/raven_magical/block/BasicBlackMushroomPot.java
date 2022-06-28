package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.util.RavenUtils;

public class BasicBlackMushroomPot extends BasicMushroomPot {

    public static final String CODE_NAME = "basic_black_mushroom_pot";

    public BasicBlackMushroomPot() {
        super(ModBlocks.BLACK_MUSHROOM);
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Basic Black Mushroom Pot";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_BLOCK + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.BLOCK_PATH + BlackMushroom.CODE_NAME;
    }
}
