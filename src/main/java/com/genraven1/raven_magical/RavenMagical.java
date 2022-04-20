package com.genraven1.raven_magical;

import com.genraven1.raven_magical.block.ModBlocks;
import com.genraven1.raven_magical.data.loot.ModLootModifiers;
import com.genraven1.raven_magical.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RavenMagical.MOD_ID)
public class RavenMagical
{
    public static final String MOD_ID = "raven_magical";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RavenMagical()
    {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModLootModifiers.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}
