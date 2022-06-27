package com.genraven1.raven_magical.util;

import com.genraven1.raven_magical.RavenMagical;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

public class RavenUtils {

    public static final String BLANK = " ";
    public static final String LANG_BLOCK = "block." + RavenMagical.MOD_ID + ".";
    public static final String LANG_ITEM =  "item." + RavenMagical.MOD_ID + ".";
    public static final String BLOCK_PATH = "block/";
    public static final String ITEM_PATH = "item/";
    public static final String HAS_PREFIX = "has_";
    public static final String SMITHING_SUFFIX = "_smithing";

    public static ResourceLocation getRavenMagicalResourceLocation(final String name) {
        return new ResourceLocation(RavenMagical.MOD_ID, name);
    }

    private static InventoryChangeTrigger.TriggerInstance inventoryTrigger(final ItemPredicate... pPredicates) {
        return new InventoryChangeTrigger.TriggerInstance(EntityPredicate.Composite.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, pPredicates);
    }

    public static InventoryChangeTrigger.TriggerInstance has(final ItemLike pItemLike) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(pItemLike).build());
    }
}
