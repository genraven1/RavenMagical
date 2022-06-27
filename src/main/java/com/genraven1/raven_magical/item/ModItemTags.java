package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.util.RavenUtils;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
    public static final TagKey<Item> RAW_GEMSTONES = TagKey.create(Registry.ITEM_REGISTRY, RavenUtils.getRavenMagicalResourceLocation("raw_gemstones"));
}
