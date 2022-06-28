package com.genraven1.vampire_raven.data;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.block.ModBlocks;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RavenBlockStateProvider extends BlockStateProvider {

    public RavenBlockStateProvider(final DataGenerator dataGenerator, final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, VampireRaven.MOD_ID, existingFileHelper);
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
        ModBlocks.getMushroomPotBlocks().forEach(mushroomPot -> getVariantBuilder(mushroomPot).partialState().addModels(createCustomFlowerPot(mushroomPot.getCodeName(), mushroomPot.getCodePath())));
    }

    private void registerPottedMushrooms() {
        ModBlocks.getMushroomPottedBlocks().forEach(pottedMushroom -> getVariantBuilder(pottedMushroom).partialState().addModels(createConfiguredPlantModel(pottedMushroom.getCodeName(), pottedMushroom.getCodePath())));
    }

    private ConfiguredModel createConfiguredPlantModel(final String name, final String codePath) {
        return new ConfiguredModel(models().withExistingParent(name, RavenUtils.BLOCK_PATH + "flower_pot_cross").texture("plant", modLoc(codePath)));
    }

    private ConfiguredModel createCustomFlowerPot(final String name, final String codePath) {
        final BlockModelBuilder modelBuilder = models().getBuilder(name);
        modelBuilder.ao(false);
        modelBuilder.element().to(6, 6, 11).from(5, 0, 5).face(Direction.DOWN).texture("#flowerpot").cullface(Direction.DOWN).uvs(5, 5, 6, 11);
        modelBuilder.texture("flowerpot", modLoc(codePath));
        modelBuilder.texture("particle", modLoc(codePath));
        modelBuilder.texture("dirt","minecraft:block/dirt");
        return new ConfiguredModel(modelBuilder);
    }
}
