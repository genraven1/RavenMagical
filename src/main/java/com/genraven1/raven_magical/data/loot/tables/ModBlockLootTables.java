package com.genraven1.raven_magical.data.loot.tables;

import com.genraven1.raven_magical.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        super.addTables();
        ModBlocks.getMushroomBlocks().forEach(this::dropSelf);
    }
}
