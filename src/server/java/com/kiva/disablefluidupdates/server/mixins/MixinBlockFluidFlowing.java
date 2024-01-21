package com.kiva.disablefluidupdates.server.mixins;

import net.minecraft.src.game.block.BlockFluidFlowing;
import net.minecraft.src.game.level.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(BlockFluidFlowing.class)
public class MixinBlockFluidFlowing {
    @Inject(method = "updateTick", at = @At("HEAD"), cancellable = true)
    public void cancelFluidUpdates(World world, int x, int y, int z, Random rand, CallbackInfo ci){
        ci.cancel();
    }
}
