package com.genraven1.raven_magical.block;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {
    public static final TagKey<Block> MAGIC_MUSHROOM = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("magic_mushroom"));
}
