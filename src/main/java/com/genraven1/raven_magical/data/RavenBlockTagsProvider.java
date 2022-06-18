package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlockTags;
import com.genraven1.raven_magical.block.ModBlocks;
import com.genraven1.raven_magical.block.RavenMushroomBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RavenBlockTagsProvider extends BlockTagsProvider {

    public RavenBlockTagsProvider(final DataGenerator dataGenerator, @Nullable final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, RavenMagical.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        addMushroomTags();

    }

    private void addMushroomTags() {
        for (RavenMushroomBlock mushroomBlock : ModBlocks.getMushroomBlocks()) {
            tag(ModBlockTags.MUSHROOMS).add(mushroomBlock);
        }
    }
}
