package com.jetpacker06.CreateBrokenBad.block.blockentity;

import com.jetpacker06.CreateBrokenBad.block.BrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.block.TrappedBrassCallBellBlock;
import com.jetpacker06.CreateBrokenBad.register.CBBBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TrappedBrassCallBellBlockEntity extends BlockEntity {
    private int ticksRemaining = 5;
    public TrappedBrassCallBellBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(pType, pWorldPosition, pBlockState);
    }
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, TrappedBrassCallBellBlockEntity pBlockEntity) {
        if (pState.getValue(BrassCallBellBlock.DOWN)) {
            if (pBlockEntity.ticksRemaining > 0) {
                pBlockEntity.ticksRemaining--;
            } else {
                pLevel.setBlock(pPos, pState.setValue(BrassCallBellBlock.DOWN, false), 3);
                pBlockEntity.ticksRemaining = 5;
            }
        }
        if (pLevel instanceof ServerLevel) {
            if (pLevel.getBlockState(pPos).getValue(TrappedBrassCallBellBlock.DOWN)) {
                pLevel.setBlock(pPos, CBBBlocks.TRAPPED_BRASS_CALL_BELL.get().defaultBlockState(), 3);
                pLevel.updateNeighbourForOutputSignal(pPos, CBBBlocks.TRAPPED_BRASS_CALL_BELL.get());
            }
        }
    }
}