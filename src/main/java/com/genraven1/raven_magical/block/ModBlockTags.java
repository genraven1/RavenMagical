package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.RavenMagical;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> MUSHROOMS = tag("mushroom");

    private static TagKey<Block> tag(final String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, prefix(name));
    }

    public static ResourceLocation prefix(final String path) {
        return new ResourceLocation(RavenMagical.MOD_ID, path);
    }
}
