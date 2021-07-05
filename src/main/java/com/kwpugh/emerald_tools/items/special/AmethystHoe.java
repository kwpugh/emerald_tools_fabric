package com.kwpugh.emerald_tools.items.special;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.ModHoe;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class AmethystHoe extends ModHoe
{
    static boolean enable = EmeraldTools.CONFIG.GENERAL.amethystEnableUnbreakable;

    public AmethystHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player)
    {
        if(enable)
        {
            stack.getOrCreateTag().putBoolean("Unbreakable", true);
        }
    }
}