package com.genraven1.vampire_raven.tileentity;

import com.genraven1.vampire_raven.VampireRaven;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModTileEntities {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, VampireRaven.MOD_ID);

    public static final RegistryObject<BlockEntityType<BasicMushroomPotTileEntity>> BASIC_MUSHROOM_POT = register(BasicMushroomPotTileEntity.CODE_NAME, BasicMushroomPotTileEntity::new, BasicMushroomPotTileEntity.getBlocks());

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String name, BlockEntityType.BlockEntitySupplier<T> tile, Supplier<Block[]> blocks) {
        return TILE_ENTITIES.register(name, () -> BlockEntityType.Builder.of(tile, blocks.get()).build(null));
    }

    public static void register(final IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}
