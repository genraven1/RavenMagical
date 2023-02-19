package com.genraven1.vampire_raven.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class VampireRavenCreativeTab {
    public static final String TabName = "vampireraventab";
    public static final String EnglishTabName = "Vampire Raven";
    public static final CreativeModeTab VAMPIRE_RAVEN_TAB = new CreativeModeTab(TabName) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ModItems.CITRINE.get().getDefaultInstance();
        }
    };
}
