package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;



public class RavenBlockStateProvider extends BlockStateProvider {

    public RavenBlockStateProvider(final DataGenerator dataGenerator, final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, RavenMagical.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerMushroomBlockStates();
    }

    private void registerMushroomBlockStates() {
        ModBlocks.getMushroomBlocks().forEach(mushroomBlock -> getVariantBuilder(mushroomBlock).partialState().addModels(new ConfiguredModel(models().cross(mushroomBlock.getCodeName(), modLoc(mushroomBlock.getCodePath())))));
    }
}
