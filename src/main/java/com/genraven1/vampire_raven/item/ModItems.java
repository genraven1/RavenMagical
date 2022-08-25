package com.genraven1.vampire_raven.item;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.item.fluid.RavenBucketItem;
import com.genraven1.vampire_raven.item.fluid.WeakBloodBucketItem;
import com.genraven1.vampire_raven.item.gemstone.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VampireRaven.MOD_ID);

    public static final RegistryObject<RawGemstoneItem> RAW_CITRINE = ITEMS.register(RawCitrine.CODE_NAME, RawCitrine::new);
    public static final RegistryObject<RawGemstoneItem> RAW_RUBY = ITEMS.register(RawRuby.CODE_NAME, RawRuby::new);
    public static final RegistryObject<GemstoneItem> CITRINE = ITEMS.register(Citrine.CODE_NAME, Citrine::new);
    public static final RegistryObject<GemstoneItem> RUBY = ITEMS.register(Ruby.CODE_NAME, Ruby::new);

    public static final RegistryObject<RavenBucketItem> WEAK_BLOOD_BUCKET = ITEMS.register(WeakBloodBucketItem.CODE_NAME, WeakBloodBucketItem::new);
    public static void register(final IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static List<RawGemstoneItem> getRawGemstones() {
        return List.of(RAW_CITRINE.get(), RAW_RUBY.get());
    }

    public static List<GemstoneItem> getGemstones() {
        return List.of(CITRINE.get(), RUBY.get());
    }

    public static List<RavenBucketItem> getBucketItems() {
        return List.of(WEAK_BLOOD_BUCKET.get());
    }
}
