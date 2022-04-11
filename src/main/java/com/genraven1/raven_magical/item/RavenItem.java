package com.genraven1.raven_magical.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public abstract class RavenItem extends Item {

    public RavenItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    public RavenItem(final int stackSize) {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(stackSize));
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
