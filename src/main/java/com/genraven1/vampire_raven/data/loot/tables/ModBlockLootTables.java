package com.genraven1.vampire_raven.data.loot.tables;

import com.genraven1.vampire_raven.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        super.addTables();
        ModBlocks.getMushroomBlocks().forEach(this::dropSelf);
        ModBlocks.getMushroomPotBlocks().forEach(this::dropSelf);
        ModBlocks.getMushroomPottedBlocks().forEach(this::dropSelf);
        ModBlocks.getBloodPlants().forEach(this::dropSelf);
    }
}
