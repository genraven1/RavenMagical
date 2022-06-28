package com.genraven1.raven_magical.item;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.gemstone.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RavenMagical.MOD_ID);

    public static final RegistryObject<RawGemstoneItem> RAW_CITRINE = ITEMS.register(RawCitrine.CODE_NAME, RawCitrine::new);
    public static final RegistryObject<RawGemstoneItem> RAW_RUBY = ITEMS.register(RawRuby.CODE_NAME, RawRuby::new);
    public static final RegistryObject<GemstoneItem> CITRINE = ITEMS.register(Citrine.CODE_NAME, Citrine::new);
    public static final RegistryObject<GemstoneItem> RUBY = ITEMS.register(Ruby.CODE_NAME, Ruby::new);
    public static void register(final IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static List<RawGemstoneItem> getRawGemstones() {
        return List.of(RAW_CITRINE.get(), RAW_RUBY.get());
    }

    public static List<GemstoneItem> getGemstones() {
        return List.of(CITRINE.get(), RUBY.get());
    }
}
