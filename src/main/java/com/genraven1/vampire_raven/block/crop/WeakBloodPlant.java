package com.genraven1.vampire_raven.block.crop;

import com.genraven1.vampire_raven.item.ModItems;
import com.genraven1.vampire_raven.util.RavenUtils;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.NotNull;

public class WeakBloodPlant extends BloodPlant {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public static final String CODE_NAME = "weak_blood_plant";

    public WeakBloodPlant() {
        super(BloodCropTier.WEAK);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected @NotNull ItemLike getBaseSeedId() {
        return ModItems.WEAK_BLOOD_SEED.get();
    }

    @Override
    public String getCodeName() {
        return CODE_NAME;
    }

    @Override
    public String getEnglishName() {
        return "Weak Blood Plant";
    }

    @Override
    public String getLanguageCodeName() {
        return RavenUtils.LANG_BLOCK + CODE_NAME;
    }

    @Override
    public String getCodePath() {
        return RavenUtils.BLOCK_PATH + CODE_NAME;
    }
}
