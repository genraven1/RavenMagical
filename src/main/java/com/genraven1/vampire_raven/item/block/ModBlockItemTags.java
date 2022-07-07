package com.genraven1.vampire_raven.item.block;

import com.genraven1.vampire_raven.block.RavenMushroomBlock;
import com.genraven1.vampire_raven.block.crop.BloodPlant;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModBlockItemTags {
    public static final TagKey<Item> MAGIC_MUSHROOM = createTagKey(RavenMushroomBlock.RESOURCE_LOCATION);
    public static final TagKey<Item> BLOOD_PLANT = createTagKey(BloodPlant.RESOURCE_LOCATION);

    private static TagKey<Item> createTagKey(final ResourceLocation location) {
        return TagKey.create(Registry.ITEM_REGISTRY, location);
    }
}
