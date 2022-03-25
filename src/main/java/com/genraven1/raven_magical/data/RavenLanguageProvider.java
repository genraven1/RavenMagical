package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class RavenLanguageProvider extends LanguageProvider {

    public RavenLanguageProvider(final DataGenerator dataGenerator, final String locale) {
        super(dataGenerator, RavenMagical.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        addItemTranslations();
    }

    private void addItemTranslations() {
        ModItems.getGeneratedItems().forEach(item -> add(item.getLanguageCodeName(), item.getEnglishName()));
    }
}
