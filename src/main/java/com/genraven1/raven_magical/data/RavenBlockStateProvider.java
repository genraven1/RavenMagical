package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlocks;
import com.genraven1.raven_magical.util.RavenUtils;
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
        registerMushroomPotBlockStates();
        registerPottedMushrooms();
    }

    private void registerMushroomBlockStates() {
        ModBlocks.getMushroomBlocks().forEach(mushroomBlock -> getVariantBuilder(mushroomBlock).partialState().addModels(new ConfiguredModel(models().cross(mushroomBlock.getCodeName(), modLoc(mushroomBlock.getCodePath())))));
    }

    private void registerMushroomPotBlockStates() {
        ModBlocks.getMushroomPotBlocks().forEach(mushroomPot -> getVariantBuilder(mushroomPot).partialState().addModels(new ConfiguredModel(models().withExistingParent(mushroomPot.getCodeName(), "minecraft:block/flower_pot_cross"))));
    }

    private void registerPottedMushrooms() {
        ModBlocks.getMushroomPottedBlocks().forEach(pottedMushroom -> getVariantBuilder(pottedMushroom).partialState().addModels(plant(pottedMushroom.getCodeName(), pottedMushroom.getCodePath())));
    }

    private ConfiguredModel plant(final String name, final String codePath) {
        return new ConfiguredModel(models().withExistingParent(name, RavenUtils.BLOCK_PATH + "flower_pot_cross").texture("plant", modLoc(codePath)));
    }
}
