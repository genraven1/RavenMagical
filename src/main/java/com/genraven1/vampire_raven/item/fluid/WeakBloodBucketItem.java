package com.genraven1.vampire_raven.item.fluid;

import com.genraven1.vampire_raven.fluid.ModFluids;
import com.genraven1.vampire_raven.fluid.WeakBlood;
import com.genraven1.vampire_raven.util.RavenUtils;

public class WeakBloodBucketItem extends RavenBucketItem {

    public static final String CODE_NAME = WeakBlood.CODE_NAME + RavenUtils.BUCKET_SUFFIX;

    public WeakBloodBucketItem() {
        super(ModFluids.WEAK_BLOOD.get());
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Weak Blood Bucket";
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
