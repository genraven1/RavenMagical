package com.genraven1.vampire_raven.block.crop;

import com.genraven1.vampire_raven.util.RavenUtils;

public class WeakBloodPlant extends BloodPlant {

    public static final String CODE_NAME = "weak_blood_plant";

    public WeakBloodPlant() {
        super(BloodCropTier.WEAK);
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Weak Blood Plant";
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
