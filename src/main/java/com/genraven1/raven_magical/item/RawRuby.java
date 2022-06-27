package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.util.RavenUtils;
import lombok.NoArgsConstructor;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;

import java.util.function.Consumer;

@NoArgsConstructor
public class RawRuby extends RawGemstoneItem {

    public static final String CODE_NAME = "raw_ruby";

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Raw Ruby";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_ITEM + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.ITEM_PATH + CODE_NAME;
    }

    @Override
    public void getRefinementRecipe(final Consumer<FinishedRecipe> finishedRecipe) {

    }
}
