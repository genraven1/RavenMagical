package com.genraven1.raven_magical.item.block;

import com.genraven1.raven_magical.util.RavenUtils;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModBlockItemTags {
    public static final TagKey<Item> MAGIC_MUSHROOM = TagKey.create(Registry.ITEM_REGISTRY, RavenUtils.getRavenMagicalResourceLocation("magic_mushroom"));
}
