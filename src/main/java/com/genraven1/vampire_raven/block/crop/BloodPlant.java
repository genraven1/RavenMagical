package com.genraven1.vampire_raven.block.crop;

import com.genraven1.vampire_raven.util.RavenUtils;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

@Getter
@Setter
public abstract class BloodPlant extends RavenCropBlock {

    public static final ResourceLocation RESOURCE_LOCATION = RavenUtils.getResourceLocation("blood_plant");
    public BloodPlant(final BloodCropTier tier) {
        super(Properties.copy(Blocks.WHEAT).noOcclusion().sound(SoundType.CROP));
        this.tier = tier;
    }

    private BloodCropTier tier;
}
