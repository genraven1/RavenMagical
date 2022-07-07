package com.genraven1.vampire_raven.block;

import com.genraven1.vampire_raven.block.crop.BloodPlant;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {
    public static final TagKey<Block> MAGIC_MUSHROOM = createTagKey(RavenMushroomBlock.RESOURCE_LOCATION);
    public static final TagKey<Block> BLOOD_PLANT = createTagKey(BloodPlant.RESOURCE_LOCATION);

    private static TagKey<Block> createTagKey(final ResourceLocation location) {
        return TagKey.create(Registry.BLOCK_REGISTRY, location);
    }
}
