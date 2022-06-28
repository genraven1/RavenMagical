package com.genraven1.vampire_raven.data.loot.global;

import com.genraven1.vampire_raven.VampireRaven;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {

    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLOBAL_LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, VampireRaven.MOD_ID);

    public static final RegistryObject<IronOreLootModifier.Serializer> IRON_ORE = GLOBAL_LOOT_MODIFIERS.register(IronOreLootModifier.NAME, IronOreLootModifier.Serializer::new);

    public static void register(final IEventBus eventBus) {
        GLOBAL_LOOT_MODIFIERS.register(eventBus);
    }
}
