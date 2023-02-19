package com.genraven1.vampire_raven.item;

import net.minecraft.world.item.Item;

public abstract class RavenItem extends Item {

    public RavenItem() {
        super(new Item.Properties().tab(VampireRavenCreativeTab.VAMPIRE_RAVEN_TAB));
    }

    public RavenItem(final int stackSize) {
        super(new Item.Properties().tab(VampireRavenCreativeTab.VAMPIRE_RAVEN_TAB).stacksTo(stackSize));
    }

    public abstract String getCodeName();

    public abstract String getEnglishName();

    public abstract String getLanguageCodeName();

    public abstract String getCodePath();
}
