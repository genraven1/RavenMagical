package com.genraven1.vampire_raven.data.model;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class RavenModelTemplates {
    public static final ModelTemplate CROP = create("crop", TextureSlot.CROP);

    private static ModelTemplate create(final String modelLocation, final TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(new ResourceLocation("minecraft", "block/" + modelLocation)), Optional.empty(), textureSlots);
    }
}
