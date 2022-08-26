package com.genraven1.vampire_raven.fluid;

import com.genraven1.vampire_raven.VampireRaven;
import com.genraven1.vampire_raven.block.ModBlocks;
import com.genraven1.vampire_raven.block.fluid.RavenLiquidBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, VampireRaven.MOD_ID);

    public static final RegistryObject<RavenFlowingFluid.Source> SOURCE_WEAK_BLOOD = FLUIDS.register(PoorBlood.SOURCE_CODE_NAME, PoorBlood.Source::new);

    public static final RegistryObject<RavenBlood> FLOWING_WEAK_BLOOD = FLUIDS.register(PoorBlood.FLOWING_CODE_NAME, PoorBlood.Flowing::new);

//    public static final RegistryObject<RavenLiquidBlock> WEAK_BLOOD_BLOCK = ModBlocks.BLOCKS.register(PoorBlood.BLOCK_CODE_NAME, PoorBlood.Block::new);

    public static void register(final IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

    public static List<RavenFlowingFluid.Source> getSourceBloodFluids() {
        return List.of(SOURCE_WEAK_BLOOD.get());
    }

    public static List<RavenBlood> getFlowingBloodFluids() {
        return List.of(FLOWING_WEAK_BLOOD.get());
    }

//    public static List<LiquidBlock> getBloodBlocks() {
//        return List.of(WEAK_BLOOD_BLOCK.get());
//    }
}
