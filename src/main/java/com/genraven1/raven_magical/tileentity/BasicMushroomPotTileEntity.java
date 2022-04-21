package com.genraven1.raven_magical.tileentity;

import com.genraven1.raven_magical.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class BasicMushroomPotTileEntity extends RavenInventoryTileEntity {
    private final RavenItemStackHandler inventory;
    public static final String CODE_NAME = "basic_mushroom_pot";

    public BasicMushroomPotTileEntity(final BlockPos pos, final BlockState state) {
        super(ModTileEntities.BASIC_MUSHROOM_POT.get(), pos, state);
        this.inventory = createInventoryHandler(this::markDirtyAndDispatch);
    }

    @Override
    public @NotNull RavenItemStackHandler getInventory() {
        return this.inventory;
    }

    public static Supplier<Block[]> getBlocks() {
        return () -> new Block[] { ModBlocks.BASIC_MUSHROOM_POT.get() };
    }

    public static RavenItemStackHandler createInventoryHandler(final Runnable onContentsChanged) {
        var inventory = new RavenItemStackHandler(1, onContentsChanged);

        inventory.setDefaultSlotLimit(1);

        return inventory;
    }

    public boolean isEmpty() {
        return inventory.getStackInSlot(0).isEmpty();
    }

    public ItemStack getStoredItem() {
        return inventory.getStackInSlot(0);
    }

    public boolean addItem(final ItemStack itemStack) {
        if (isEmpty() && !itemStack.isEmpty()) {
            inventory.setStackInSlot(0, itemStack.split(1));
            inventoryChanged();
            return true;
        }
        return false;
    }

    public ItemStack removeItem() {
        if (!isEmpty()) {
            ItemStack item = getStoredItem().split(1);
            inventoryChanged();
            return item;
        }
        return ItemStack.EMPTY;
    }

    protected void inventoryChanged() {
        super.setChanged();
        if (level != null)
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), Block.UPDATE_CLIENTS);
    }
}
