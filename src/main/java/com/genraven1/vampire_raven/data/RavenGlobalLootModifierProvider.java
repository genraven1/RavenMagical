package com.genraven1.vampire_raven.data;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.data.loot.global.IronOreLootModifier;
import com.genraven1.vampire_raven.data.loot.global.ModLootModifiers;
import com.genraven1.vampire_raven.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class RavenGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public RavenGlobalLootModifierProvider(final DataGenerator dataGenerator) {
        super(dataGenerator, VampireRaven.MOD_ID);
    }

    @Override
    protected void start() {
        add(IronOreLootModifier.NAME, ModLootModifiers.IRON_ORE.get(), new IronOreLootModifier(ModItems.getRawGemstones()));
    }
}
