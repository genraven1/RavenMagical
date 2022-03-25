package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RavenItemTagProvider extends ItemTagsProvider {

    public RavenItemTagProvider(final DataGenerator dataGenerator, final BlockTagsProvider blockTagsProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, RavenMagical.MOD_ID, existingFileHelper);
    }
}
