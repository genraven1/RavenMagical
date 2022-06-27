package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.util.RavenUtils;

public class EmeraldKnife extends RavenItem {

    public static final String CODE_NAME = "emerald_knife";
    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Emerald Knife";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_ITEM + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.ITEM_PATH + CODE_NAME;
    }
}
