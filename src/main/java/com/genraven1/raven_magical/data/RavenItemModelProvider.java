package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlocks;
import com.genraven1.raven_magical.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RavenItemModelProvider extends ItemModelProvider {
    public RavenItemModelProvider(final DataGenerator dataGenerator, final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, RavenMagical.MOD_ID, existingFileHelper);
    }

    private final ResourceLocation generatedResourceLocation = new ResourceLocation("minecraft", "item/generated");
    private final ResourceLocation handheldResourceLocation = new ResourceLocation("minecraft", "item/handheld");

    private final ModelFile generatedModelFile = getExistingFile(generatedResourceLocation);
    private final ModelFile handheldModelFile = getExistingFile(handheldResourceLocation);

    @Override
    protected void registerModels() {
        registerItemModels();
    }

    private ItemModelBuilder generatedItemBuilder(final String name, final String path) {
        return withExistingParent(name, generatedResourceLocation).texture("layer0", path);
    }

    private ItemModelBuilder handheldBuilder(final String name, final String path) {
        return withExistingParent(name, handheldResourceLocation).texture("layer0", path);
    }

    private void registerItemBlockModels(final String name, final String path) {
        generatedItemBuilder(name, path);
    }

    private void registerItemModels() {
        registerGeneratedItemModels();
        registerRavenMushroomBlock();
    }

    private void registerGeneratedItemModels() {
        ModItems.getGeneratedItems().forEach(item -> generatedItemBuilder(item.getCodeName(), item.getCodePath()));
    }

    private void registerRavenMushroomBlock() {
        ModBlocks.getMushroomBlocks().forEach(ravenMushroomBlock -> registerItemBlockModels(ravenMushroomBlock.getCodeName(), ravenMushroomBlock.getCodePath()));
    }
}
