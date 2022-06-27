package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RavenRecipeProvider extends RecipeProvider {
    public RavenRecipeProvider(final DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(final @NotNull Consumer<FinishedRecipe> recipeConsumer) {
        super.buildCraftingRecipes(recipeConsumer);
        buildItemRecipes(recipeConsumer);
    }

    private void buildItemRecipes(final @NotNull Consumer<FinishedRecipe> recipeConsumer) {
        ModItems.getRawGemstones().forEach(gemstone -> gemstone.getRefinementRecipe(recipeConsumer));
    }
}
