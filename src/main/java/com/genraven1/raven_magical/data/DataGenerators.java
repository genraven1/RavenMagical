package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = RavenMagical.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
//        dataGenerator.addProvider(new RecipeProviderRIC(dataGenerator));
//        dataGenerator.addProvider(new LootTableProviderRIC(dataGenerator));
    }

    private static void addLanguageProviders(final DataGenerator dataGenerator) {
        for (final String locale: LOCALE_CODES) {
            dataGenerator.addProvider(new RavenLanguageProvider(dataGenerator, locale));
        }
    }
}
