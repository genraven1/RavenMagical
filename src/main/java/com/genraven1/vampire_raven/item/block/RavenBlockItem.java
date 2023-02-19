package com.genraven1.vampire_raven.item.block;

import com.genraven1.vampire_raven.item.VampireRavenCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RavenBlockItem extends BlockItem {
    public RavenBlockItem(final Block block) {
        super(block, new Item.Properties().tab(VampireRavenCreativeTab.VAMPIRE_RAVEN_TAB));
    }

    public RavenBlockItem(final Block block, final int stackSize) {
        super(block, new Item.Properties().tab(VampireRavenCreativeTab.VAMPIRE_RAVEN_TAB).stacksTo(stackSize));
    }
}
