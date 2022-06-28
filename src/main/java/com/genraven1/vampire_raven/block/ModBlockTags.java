package com.genraven1.vampire_raven.block;

import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {
    public static final TagKey<Block> MAGIC_MUSHROOM = TagKey.create(Registry.BLOCK_REGISTRY, RavenUtils.getRavenMagicalResourceLocation("magic_mushroom"));
}
