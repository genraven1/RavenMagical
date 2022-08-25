package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.VampireRaven;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, VampireRaven.MOD_ID);

    public static final RegistryObject<RavenBlood> WEAK_BLOOD = FLUIDS.register(WeakBlood.CODE_NAME, WeakBlood.Source::new);

    public static final RegistryObject<RavenBlood> FLOWING_WEAK_BLOOD = FLUIDS.register(WeakBlood.FLOWING_CODE_NAME, WeakBlood.Flowing::new);

    public static void register(final IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

    public static List<RavenBlood> getBloodFluids() {
        return List.of(WEAK_BLOOD.get(), FLOWING_WEAK_BLOOD.get());
    }
}
