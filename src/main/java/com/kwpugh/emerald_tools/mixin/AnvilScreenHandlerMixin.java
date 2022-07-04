package com.kwpugh.emerald_tools.mixin;

import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.items.special.UnbreakableRuby;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.Property;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin
{
    @Shadow @Final private Property levelCost;
    @Shadow private String newItemName;

    @Inject(method = "canTakeOutput", at = @At("HEAD"), cancellable = true)
    public void emeraldCanTakeOutput(PlayerEntity player, boolean present, CallbackInfoReturnable<Boolean> cir)
    {
        ForgingScreenHandlerAccessor accessor = (ForgingScreenHandlerAccessor) (Object) this;

        // Logic will be skipped if a ruby is not in second slot
        if(accessor.getInput().getStack(1).getItem().equals(ItemInit.RUBY))
        {
            cir.setReturnValue(levelCost.get() <= player.experienceLevel);
            cir.cancel();
        }
    }

    @Inject(method = "updateResult", at = @At("HEAD"), cancellable = true)
    public void emeraldUpdateResult(CallbackInfo ci)
    {
        ForgingScreenHandlerAccessor accessor = (ForgingScreenHandlerAccessor) this;

        UnbreakableRuby.anvilAction(accessor, levelCost,  newItemName, ci);
    }
}