package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlockTags;
import com.genraven1.raven_magical.item.ModItemTags;
import com.genraven1.raven_magical.item.ModItems;
import com.genraven1.raven_magical.item.block.ModBlockItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class RavenItemTagProvider extends ItemTagsProvider {

    public RavenItemTagProvider(final DataGenerator dataGenerator, final BlockTagsProvider blockTagsProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, RavenMagical.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.copy(ModBlockTags.MAGIC_MUSHROOM, ModBlockItemTags.MAGIC_MUSHROOM);
        this.tag(ModItemTags.RAW_GEMSTONES).add(ModItems.getRawGemstones().toArray(new Item[0]));
    }
}
