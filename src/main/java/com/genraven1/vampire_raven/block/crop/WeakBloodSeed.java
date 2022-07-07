package com.genraven1.vampire_raven.block.crop;

import com.genraven1.vampire_raven.block.ModBlocks;
import com.genraven1.vampire_raven.item.block.SeedRavenBlockItem;
import com.genraven1.vampire_raven.util.RavenUtils;

public class WeakBloodSeed extends SeedRavenBlockItem {

    public static final String CODE_NAME = "weak_blood_seed";

    public WeakBloodSeed() {
        super(ModBlocks.WEAK_BLOOD_PLANT.get());
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Weak Blood Seed";
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
