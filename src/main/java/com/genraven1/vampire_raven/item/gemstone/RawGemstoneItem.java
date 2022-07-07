package com.genraven1.vampire_raven.item.gemstone;

import com.genraven1.vampire_raven.item.RavenItem;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public abstract class RawGemstoneItem extends RavenItem {

    public static final ResourceLocation RESOURCE_LOCATION = RavenUtils.getResourceLocation("raw_gemstone");

    public abstract void getRefinementRecipe(final Consumer<FinishedRecipe> finishedRecipe);
}
