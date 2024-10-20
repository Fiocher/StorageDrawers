package com.jaquadro.minecraft.storagedrawers.block.tile;

import com.jaquadro.minecraft.storagedrawers.block.tile.modelprops.DrawerModelProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.jetbrains.annotations.NotNull;

public abstract class PlatformBlockEntityDrawersStandard extends BlockEntityDrawersStandard
{
    public PlatformBlockEntityDrawersStandard (BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
    }

    public static class Slot1 extends BlockEntityDrawersStandard.Slot1 {
        public Slot1 (BlockPos pos, BlockState state) {
            super(pos, state);
        }

        @NotNull
        @Override
        public ModelData getModelData () {
            return DrawerModelProperties.getModelData(this);
        }

        @Override
        protected void onAttributeChanged () {
            super.onAttributeChanged();
            requestModelDataUpdate();
        }
    }

    public static class Slot2 extends BlockEntityDrawersStandard.Slot2 {
        public Slot2 (BlockPos pos, BlockState state) {
            super(pos, state);
        }

        @NotNull
        @Override
        public ModelData getModelData () {
            return DrawerModelProperties.getModelData(this);
        }

        @Override
        protected void onAttributeChanged () {
            super.onAttributeChanged();
            requestModelDataUpdate();
        }
    }

    public static class Slot4 extends BlockEntityDrawersStandard.Slot4 {
        public Slot4 (BlockPos pos, BlockState state) {
            super(pos, state);
        }

        @NotNull
        @Override
        public ModelData getModelData () {
            return DrawerModelProperties.getModelData(this);
        }

        @Override
        protected void onAttributeChanged () {
            super.onAttributeChanged();
            requestModelDataUpdate();
        }
    }
}
