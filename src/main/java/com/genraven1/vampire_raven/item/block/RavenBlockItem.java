package com.genraven1.vampire_raven.item.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RavenBlockItem extends BlockItem {
    public RavenBlockItem(final Block block) {
        super(block, new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }

    public RavenBlockItem(final Block block, final int stackSize) {
        super(block, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(stackSize));
    }
}
