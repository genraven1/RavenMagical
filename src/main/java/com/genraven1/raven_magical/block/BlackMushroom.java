package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.util.RavenUtils;

public class BlackMushroom extends RavenMushroomBlock {

    public static final String CODE_NAME = "black_mushroom";

    public BlackMushroom() {
        super();
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Black Mushroom";
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
