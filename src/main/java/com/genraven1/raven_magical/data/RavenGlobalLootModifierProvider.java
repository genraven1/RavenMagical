package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.data.loot.IronOreLootModifier;
import com.genraven1.raven_magical.data.loot.ModLootModifiers;
import com.genraven1.raven_magical.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class RavenGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public RavenGlobalLootModifierProvider(final DataGenerator dataGenerator) {
        super(dataGenerator, RavenMagical.MOD_ID);
    }

    @Override
    protected void start() {
        add(IronOreLootModifier.NAME, ModLootModifiers.IRON_ORE.get(), new IronOreLootModifier(ModItems.getRawGemstones()));
    }
}
