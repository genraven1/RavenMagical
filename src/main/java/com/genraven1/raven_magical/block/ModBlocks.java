package com.genraven1.raven_magical.block;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.ModItems;
import com.genraven1.raven_magical.item.RavenBlockItem;
import com.genraven1.raven_magical.item.RavenItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RavenMagical.MOD_ID);

    // Mushrooms
    public static final RegistryObject<RavenMushroomBlock> BLACK_MUSHROOM = registerBlock(BlackMushroom.CODE_NAME, BlackMushroom::new);

    // Basic Mushroom Pots
    public static final RegistryObject<BaseMushroomPot> BASIC_MUSHROOM_POT = registerBlock(BasicEmptyMushroomPot.CODE_NAME, BasicEmptyMushroomPot::new);
    public static final RegistryObject<BaseMushroomPot> POTTED_BLACK_MUSHROOM = registerBlock(BlackMushroom.POTTED_CODE_NAME, BasicBlackMushroomPot::new);

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(final String name, final RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new RavenBlockItem(block.get()));
    }

    public static void register(final IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static List<RavenMushroomBlock> getMushroomBlocks() {
        return List.of(BLACK_MUSHROOM.get());
    }

    public static List<BaseMushroomPot> getMushroomPotBlocks() {
        return List.of(BASIC_MUSHROOM_POT.get());
    }

    public static List<BaseMushroomPot> getMushroomPottedBlocks() {
        return List.of(POTTED_BLACK_MUSHROOM.get());
    }
}
