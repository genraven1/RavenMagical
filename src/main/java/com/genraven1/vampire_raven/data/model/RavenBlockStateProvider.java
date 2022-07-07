package com.genraven1.vampire_raven.data.model;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.block.ModBlocks;
import com.genraven1.vampire_raven.util.RavenUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class RavenBlockStateProvider extends BlockStateProvider {

    public RavenBlockStateProvider(final DataGenerator dataGenerator, final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, VampireRaven.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerMushroomBlockStates();
        registerMushroomPotBlockStates();
        registerPottedMushrooms();
        registerBloodPlants();
    }

    private void registerMushroomBlockStates() {
        ModBlocks.getMushroomBlocks().forEach(mushroomBlock -> getVariantBuilder(mushroomBlock).partialState().addModels(new ConfiguredModel(models().cross(mushroomBlock.getCodeName(), modLoc(mushroomBlock.getCodePath())))));
    }

    private void registerMushroomPotBlockStates() {
        ModBlocks.getMushroomPotBlocks().forEach(mushroomPot -> getVariantBuilder(mushroomPot).partialState().addModels(createCustomFlowerPot(mushroomPot.getCodeName(), mushroomPot.getCodePath())));
    }

//    private void createPlant(Block pPlantBlock, Block pPottedPlantBlock, BlockModelGenerators.TintState pTintState) {
//        this.createCrossBlockWithDefaultItem(pPlantBlock, pTintState);
//        TextureMapping texturemapping = TextureMapping.plant(pPlantBlock);
//        ResourceLocation resourcelocation = pTintState.getCrossPot().create(pPottedPlantBlock, texturemapping, this.modelOutput);
//        this.blockStateOutput.accept(createSimpleBlock(pPottedPlantBlock, resourcelocation));
//    }

    private void registerPottedMushrooms() {
//        this.createPlant(Blocks.RED_MUSHROOM, Blocks.POTTED_RED_MUSHROOM, BlockModelGenerators.TintState.NOT_TINTED);
        ModBlocks.getMushroomPottedBlocks().forEach(pottedMushroom -> getVariantBuilder(pottedMushroom).partialState().addModels(createConfiguredPlantModel(pottedMushroom.getCodeName(), pottedMushroom.getCodePath())));
    }

//    private ResourceLocation createSuffixedVariant(Block pBlock, String pSuffix, ModelTemplate pModelTemplate, Function<ResourceLocation, TextureMapping> pTextureMappingGetter) {
//        return pModelTemplate.createWithSuffix(pBlock, pSuffix, pTextureMappingGetter.apply(TextureMapping.getBlockTexture(pBlock, pSuffix)), this.modelOutput);
//    }

//    private void createCropBlock(final Block cropBlock, final Property<Integer> ageProperty, final int... pAgeToVisualStageMapping) {
//        if (ageProperty.getPossibleValues().size() != pAgeToVisualStageMapping.length) {
//            throw new IllegalArgumentException();
//        } else {
//            final Int2ObjectMap<ResourceLocation> int2objectmap = new Int2ObjectOpenHashMap<>();
//            PropertyDispatch propertydispatch = PropertyDispatch.property(ageProperty).generate((p_176172_) -> {
//                int i = pAgeToVisualStageMapping[p_176172_];
//                ResourceLocation resourcelocation = int2objectmap.computeIfAbsent(i, (p_176098_) -> {
//                    return this.createSuffixedVariant(cropBlock, "_stage" + i, RavenModelTemplates.CROP, TextureMapping::crop);
//                });
//                return Variant.variant().with(VariantProperties.MODEL, resourcelocation);
//            });
//            this.createSimpleFlatItemModel(cropBlock.asItem());
//            this.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cropBlock).with(propertydispatch));
//        }
//    }

    private void registerBloodPlants() {
//        this.createCropBlock(Blocks.WHEAT, BlockStateProperties.AGE_7, 0, 1, 2, 3, 4, 5, 6, 7);

        ModBlocks.getBloodPlants().forEach(bloodPlant -> getVariantBuilder(bloodPlant).partialState().addModels(new ConfiguredModel((models().crop(bloodPlant.getCodeName(), modLoc(bloodPlant.getCodePath()))))));
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
