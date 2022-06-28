package com.genraven1.raven_magical.util;

import com.genraven1.raven_magical.RavenMagical;
import net.minecraft.resources.ResourceLocation;

public class RavenUtils {

    public static final String BLANK = " ";
    public static final String LANG_BLOCK = "block." + RavenMagical.MOD_ID + ".";
    public static final String LANG_ITEM =  "item." + RavenMagical.MOD_ID + ".";
    public static final String BLOCK_PATH = "block/";
    public static final String ITEM_PATH = "item/";
    public static final String HAS_PREFIX = "has_";
    public static final String SMITHING_SUFFIX = "_smithing";

    public static ResourceLocation getRavenMagicalResourceLocation(final String name) {
        return new ResourceLocation(RavenMagical.MOD_ID, name);
    }
}
