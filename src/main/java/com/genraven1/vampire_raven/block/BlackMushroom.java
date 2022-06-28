package com.genraven1.vampire_raven.block;

import com.genraven1.vampire_raven.util.RavenUtils;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BlackMushroom extends RavenMushroomBlock {

    public static final String CODE_NAME = "black_mushroom";

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
