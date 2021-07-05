package com.kwpugh.emerald_tools.items.special;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.ModBow;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AmethystBow extends ModBow
{
    static boolean enable = EmeraldTools.CONFIG.GENERAL.amethystEnableInfinity;

    public AmethystBow(Settings settings)
    {
        super(settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player)
    {
        super.onCraft(stack, world, player);

        if(enable)
        {
            stack.addEnchantment(Enchantments.INFINITY, 1);
        }

    }
}