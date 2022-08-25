package com.genraven1.vampire_raven.util;

import com.genraven1.vampire_raven.VampireRaven;
import net.minecraft.resources.ResourceLocation;

public class RavenUtils {

    public static final String BLANK = " ";
    public static final String LANG_BLOCK = "block." + VampireRaven.MOD_ID + ".";
    public static final String LANG_ITEM =  "item." + VampireRaven.MOD_ID + ".";
    public static final String BLOCK_PATH = "block/";
    public static final String ITEM_PATH = "item/";
    public static final String HAS_PREFIX = "has_";
    public static final String SMITHING_SUFFIX = "_smithing";
    public static final String BUCKET_SUFFIX = "_bucket";
    public static final String FLOWING_SUFFIX = "_flowing";

    public static ResourceLocation getResourceLocation(final String name) {
        return new ResourceLocation(VampireRaven.MOD_ID, name);
    }
}
