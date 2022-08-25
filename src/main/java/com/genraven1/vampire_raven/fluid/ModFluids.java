package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.block.ModBlocks;
import com.genraven1.vampire_raven.block.fluid.RavenLiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, VampireRaven.MOD_ID);

    public static final RegistryObject<RavenBlood> WEAK_BLOOD = registerFluid(WeakBlood.CODE_NAME, WeakBlood.Source::new);

    public static final RegistryObject<RavenBlood> FLOWING_WEAK_BLOOD = registerFluid(WeakBlood.FLOWING_CODE_NAME, WeakBlood.Flowing::new);

    private static <T extends Fluid> RegistryObject<T> registerFluid(final String name, final Supplier<T> fluid) {
        RegistryObject<T> toReturn = FLUIDS.register(name, fluid);
        ModBlocks.BLOCKS.register(name, () -> new RavenLiquidBlock((FlowingFluid) fluid.get()));
        return toReturn;
    }

    public static void register(final IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
