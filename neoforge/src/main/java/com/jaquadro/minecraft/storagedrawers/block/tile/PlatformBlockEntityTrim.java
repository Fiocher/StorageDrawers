package com.jaquadro.minecraft.storagedrawers.block.tile;

import com.jaquadro.minecraft.storagedrawers.block.tile.modelprops.FramedModelProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.jetbrains.annotations.NotNull;

public class PlatformBlockEntityTrim extends BlockEntityTrim
{
    public PlatformBlockEntityTrim (BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @NotNull
    @Override
    public ModelData getModelData () {
        return FramedModelProperties.getModelData(this);
    }
}
