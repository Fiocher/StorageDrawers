package com.jaquadro.minecraft.storagedrawers.service;

import com.jaquadro.minecraft.storagedrawers.block.tile.BlockEntityDrawersComp;
import com.jaquadro.minecraft.storagedrawers.block.tile.BlockEntityDrawersStandard;
import com.jaquadro.minecraft.storagedrawers.block.tile.PlatformBlockEntityDrawersComp;
import com.jaquadro.minecraft.storagedrawers.block.tile.PlatformBlockEntityDrawersStandard;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class PlatformResourceFactory implements ResourceFactory
{
    @Override
    public BlockEntityType.BlockEntitySupplier<BlockEntityDrawersStandard> createBlockEntityDrawersStandard (int slotCount) {
        return switch (slotCount) {
            case 1 -> PlatformBlockEntityDrawersStandard.Slot1::new;
            case 2 -> PlatformBlockEntityDrawersStandard.Slot2::new;
            case 4 -> PlatformBlockEntityDrawersStandard.Slot4::new;
            default -> null;
        };
    }

    @Override
    public BlockEntityType.BlockEntitySupplier<BlockEntityDrawersComp> createBlockEntityDrawersComp (int slotCount) {
        return switch (slotCount) {
            case 3 -> PlatformBlockEntityDrawersComp.Slot3::new;
            default -> null;
        };
    }
}
