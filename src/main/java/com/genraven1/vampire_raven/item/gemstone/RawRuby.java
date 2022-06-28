package com.genraven1.vampire_raven.item.gemstone;

import com.genraven1.vampire_raven.item.ModItems;
import com.genraven1.vampire_raven.util.RavenUtils;
import lombok.NoArgsConstructor;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

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
        UpgradeRecipeBuilder.smithing(Ingredient.of(ModItems.RAW_RUBY.get()), Ingredient.of(Items.STICK), ModItems.RUBY.get())
                .unlocks(RavenUtils.HAS_PREFIX + CODE_NAME, InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RAW_RUBY.get()))
                .save(finishedRecipe,  CODE_NAME + RavenUtils.SMITHING_SUFFIX);
    }
}
