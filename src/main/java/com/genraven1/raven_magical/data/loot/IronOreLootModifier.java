package com.genraven1.raven_magical.data.loot;

import com.genraven1.raven_magical.RavenMagical;
import com.genraven1.raven_magical.item.ModItems;
import com.genraven1.raven_magical.item.RavenItem;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class IronOreLootModifier extends LootModifier {
    private final List<RavenItem> items;
    public static final String NAME = "iron_ore_loot";
    public static final String GEMSTONE = "gemstone";

    public IronOreLootModifier(final List<RavenItem> items) {
        super(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.IRON_ORE).build()
        });
        this.items = items;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(final List<ItemStack> generatedLoot, final LootContext context) {
        if (context.getRandom().nextFloat() > 0.9) {
            generatedLoot.add(new ItemStack(getItem(), 1));
        }
        return generatedLoot;
    }

    private RavenItem getItem() {
        return switch (new Random().nextInt(10) + 1) {
            case 1, 2, 3, 4, 5 -> ModItems.RAW_CITRINE.get();
            case 6, 7, 8, 9, 10 -> ModItems.RAW_RUBY.get();
            default -> throw new IllegalArgumentException("Random number not valid choice");
        };
    }

    public static class Serializer extends GlobalLootModifierSerializer<IronOreLootModifier> {

        @Override
        public IronOreLootModifier read(final ResourceLocation location, final JsonObject object, final LootItemCondition[] lootConditions) {
            final List<RavenItem> items = new ArrayList<>();
            for (JsonElement name : object.getAsJsonArray(GEMSTONE)) {
                items.add((RavenItem) ForgeRegistries.ITEMS.getValue(new ResourceLocation(name.getAsString())));
            }
            return new IronOreLootModifier(items);
        }

        @Override
        public JsonObject write(final IronOreLootModifier instance) {
            return writeGemstones(instance);
        }

        private JsonObject writeGemstones(final IronOreLootModifier instance) {
            final JsonObject json = makeConditions(instance.conditions);
            final JsonArray array = new JsonArray();
            for (final Item item : instance.items) {
                array.add(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).toString());
            }
            json.add(GEMSTONE, array);
            return json;
        }
    }
}
