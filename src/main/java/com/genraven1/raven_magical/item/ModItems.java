package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.gemstone.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RavenMagical.MOD_ID);

    public static final RegistryObject<RavenItem> CITRINE = ITEMS.register(Citrine.CODE_NAME, Citrine::new);
    public static final RegistryObject<RawGemstoneItem> RAW_CITRINE = ITEMS.register(RawCitrine.CODE_NAME, RawCitrine::new);
    public static final RegistryObject<RawGemstoneItem> RAW_RUBY = ITEMS.register(RawRuby.CODE_NAME, RawRuby::new);
    public static final RegistryObject<RavenItem> RUBY = ITEMS.register(Ruby.CODE_NAME, Ruby::new);

    public static void register(final IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    @SafeVarargs
    public static List<RavenItem> getItems(final List<RavenItem>... itemLists) {
        return Arrays.stream(itemLists).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static List<RawGemstoneItem> getRawGemstones() {
        return List.of(RAW_CITRINE.get(), RAW_RUBY.get());
    }

    public static List<RavenItem> getGemstones() {
        return List.of(CITRINE.get(), RUBY.get());
    }
}
