package com.genraven1.vampire_raven.item;

import com.genraven1.vampire_raven.item.block.SeedRavenBlockItem;
import com.genraven1.vampire_raven.item.gemstone.GemstoneItem;
import com.genraven1.vampire_raven.item.gemstone.RawGemstoneItem;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
    public static final TagKey<Item> RAW_GEMSTONES = createTagKey(RawGemstoneItem.RESOURCE_LOCATION);
    public static final TagKey<Item> GEMSTONES = createTagKey(GemstoneItem.RESOURCE_LOCATION);
    public static final TagKey<Item> BLOOD_SEEDS = createTagKey(SeedRavenBlockItem.RESOURCE_LOCATION);

    private static TagKey<Item> createTagKey(final ResourceLocation location) {
        return TagKey.create(Registry.ITEM_REGISTRY, location);
    }
}
