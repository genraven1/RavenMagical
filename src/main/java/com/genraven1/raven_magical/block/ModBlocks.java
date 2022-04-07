package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.ModItems;
import com.genraven1.raven_magical.item.RavenBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RavenMagical.MOD_ID);

    public static final RegistryObject<RavenMushroomBlock> BLACK_MUSHROOM = registerBlock(BlackMushroom.CODE_NAME, BlackMushroom::new);

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(final String name, final RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new RavenBlockItem(block.get()));
    }

    public static void register(final IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
