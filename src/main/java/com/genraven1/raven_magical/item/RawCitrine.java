package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.util.RavenUtils;
import lombok.NoArgsConstructor;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

@NoArgsConstructor
public class RawCitrine extends RawGemstoneItem {

    public static final String CODE_NAME = "raw_citrine";

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Raw Citrine";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_ITEM + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.ITEM_PATH + CODE_NAME;
    }

    public void getRefinementRecipe(final Consumer<FinishedRecipe> finishedRecipe) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.RAW_CITRINE.get()), Ingredient.of(Items.NETHERITE_INGOT), ModItems.CITRINE.get())
                .unlocks(RavenUtils.HAS_PREFIX, RavenUtils.has(ModItems.RAW_CITRINE.get()))
                .save(finishedRecipe,  CODE_NAME + RavenUtils.SMITHING_SUFFIX);
    }

}
