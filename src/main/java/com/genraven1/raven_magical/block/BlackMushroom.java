package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.util.RavenUtils;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BlackMushroom extends RavenMushroomBlock {

    public static final String CODE_NAME = "black_mushroom";
    public static final String POTTED_CODE_NAME = "potted_" + CODE_NAME;

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

    @Override
    public String getPottedCodeName() {
        return POTTED_CODE_NAME;
    }
}
