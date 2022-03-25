package com.genraven1.raven_magical.data.loot;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class IronOreLootModifier extends LootModifier {
    private final Item item;
    public static final String NAME = "iron_ore_loot";

    public IronOreLootModifier(final Item item) {
        super(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.IRON_ORE).build()
        });
        this.item = item;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(final List<ItemStack> generatedLoot, final LootContext context) {
        generatedLoot.add(new ItemStack(item, 1));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<IronOreLootModifier> {

        @Override
        public IronOreLootModifier read(final ResourceLocation location, final JsonObject object, final LootItemCondition[] lootConditions) {
            final Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "gemstone")));
            return new IronOreLootModifier(item);
        }

        @Override
        public JsonObject write(final IronOreLootModifier instance) {
            final JsonObject json = makeConditions(instance.conditions);
            json.addProperty("gemstone", ForgeRegistries.ITEMS.getKey(instance.item).toString());
            return json;
        }
    }
}
