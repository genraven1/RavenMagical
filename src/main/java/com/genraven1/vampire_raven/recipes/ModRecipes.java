package com.genraven1.vampire_raven.recipes;

import com.genraven1.vampire_raven.VampireRaven;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, VampireRaven.MOD_ID);

    public static void register(final IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
