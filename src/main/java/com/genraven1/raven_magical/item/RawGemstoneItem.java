package com.genraven1.raven_magical.item;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public abstract class RawGemstoneItem extends RavenItem {

    public abstract void getRefinementRecipe(final Consumer<FinishedRecipe> finishedRecipe);
}
