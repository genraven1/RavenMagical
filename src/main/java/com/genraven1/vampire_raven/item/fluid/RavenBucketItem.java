package com.genraven1.vampire_raven.item.fluid;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class RavenBucketItem extends BucketItem {
    public RavenBucketItem(final Fluid fluid) {
        super(() -> fluid, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1));
    }
}
