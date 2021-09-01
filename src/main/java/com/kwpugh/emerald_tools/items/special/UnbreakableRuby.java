package com.kwpugh.emerald_tools.items.special;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.mixin.ForgingScreenHandlerAccessor;
import net.minecraft.item.ItemStack;

import net.minecraft.screen.Property;
import net.minecraft.text.LiteralText;
import org.apache.commons.lang3.StringUtils;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class UnbreakableRuby
{
    static boolean enableRubySpecial = EmeraldTools.CONFIG.GENERAL.rubySpecial;

    public static void anvilAction(ForgingScreenHandlerAccessor accessor, Property levelCost, String newItemName, CallbackInfo ci)
    {
        if(enableRubySpecial)
        {
            // Logic will be skipped if a ruby is not in second slot
            if(accessor.getInput().getStack(1).getItem().equals(ItemInit.RUBY))
            {
                if(!(accessor.getInput().getStack(0).getItem().getMaxDamage() == 0) &&
                        !(accessor.getInput().getStack(0).getOrCreateNbt().getByte("Unbreakable") == (byte) 1))
                {
                    ItemStack result = accessor.getInput().getStack(0).copy();
                    result.getOrCreateNbt().putByte("Unbreakable", (byte) 1);

                    if(!StringUtils.isBlank(newItemName))
                    {
                        result.setCustomName(new LiteralText(newItemName));
                    }
                    else
                    {
                        result.removeCustomName();
                    }

                    accessor.getOutput().setStack(0, result);
                    levelCost.set(30);
                    ci.cancel();
                }
            }
        }
    }
}
