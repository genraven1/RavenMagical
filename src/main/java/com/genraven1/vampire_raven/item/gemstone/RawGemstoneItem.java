package com.genraven1.vampire_raven.item.gemstone;

import com.genraven1.vampire_raven.item.RavenItem;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public abstract class RawGemstoneItem extends RavenItem {

    public abstract void getRefinementRecipe(final Consumer<FinishedRecipe> finishedRecipe);
}
