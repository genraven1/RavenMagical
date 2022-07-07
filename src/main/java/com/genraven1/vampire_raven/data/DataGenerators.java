package com.genraven1.vampire_raven.data;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.data.loot.global.RavenGlobalLootModifierProvider;
import com.genraven1.vampire_raven.data.loot.tables.RavenLootTableProvider;
import com.genraven1.vampire_raven.data.model.RavenBlockStateProvider;
import com.genraven1.vampire_raven.data.model.RavenItemModelProvider;
import com.genraven1.vampire_raven.data.tag.RavenBlockTagsProvider;
import com.genraven1.vampire_raven.data.tag.RavenItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = VampireRaven.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    private static final String[] LOCALE_CODES = new String[]{"en_us"};

    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        final DataGenerator dataGenerator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        addLanguageProviders(dataGenerator);

        dataGenerator.addProvider(new RavenBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new RavenItemModelProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new RavenGlobalLootModifierProvider(dataGenerator));

        final RavenBlockTagsProvider blockTags = new RavenBlockTagsProvider(dataGenerator, existingFileHelper);
        dataGenerator.addProvider(blockTags);
        dataGenerator.addProvider(new RavenItemTagProvider(dataGenerator, blockTags, existingFileHelper));
        dataGenerator.addProvider(new RavenRecipeProvider(dataGenerator));
        dataGenerator.addProvider(new RavenLootTableProvider(dataGenerator));
    }

    private static void addLanguageProviders(final DataGenerator dataGenerator) {
        for (final String locale: LOCALE_CODES) {
            dataGenerator.addProvider(new RavenLanguageProvider(dataGenerator, locale));
        }
    }
}
