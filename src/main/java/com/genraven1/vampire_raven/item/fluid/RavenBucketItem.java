package com.genraven1.vampire_raven.item.fluid;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public abstract class RavenBucketItem extends BucketItem {
    public RavenBucketItem(final Fluid fluid) {
        super(() -> fluid, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1));
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
