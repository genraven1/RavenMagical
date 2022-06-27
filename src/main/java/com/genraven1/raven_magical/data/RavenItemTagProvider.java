package com.genraven1.raven_magical.data;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.block.ModBlockTags;
import com.genraven1.raven_magical.item.ModItemTags;
import com.genraven1.raven_magical.item.ModItems;
import com.genraven1.raven_magical.item.RavenItem;
import com.genraven1.raven_magical.item.block.ModBlockItemTags;
import com.genraven1.raven_magical.item.gemstone.GemstoneItem;
import com.genraven1.raven_magical.item.gemstone.RawGemstoneItem;
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
        this.tag(ModItemTags.RAW_GEMSTONES).add(ModItems.getRawGemstones().toArray(new RawGemstoneItem[0]));
        this.tag(ModItemTags.GEMSTONES).add(ModItems.getGemstones().toArray(new GemstoneItem[0]));
        this.tag(ModItemTags.KNIVES).add(ModItems.getKnives().toArray(new RavenItem[0]));
    }
}
