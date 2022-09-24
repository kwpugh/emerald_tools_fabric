package com.kwpugh.emerald_tools.items.special;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.ModPickaxe;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class AmethystPickaxe extends ModPickaxe
{
    static boolean enable = EmeraldTools.CONFIG.GENERAL.amethystEnableSilkTouch;

    public AmethystPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player)
    {
        super.onCraft(stack, world, player);

        boolean hasSilkTouch = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) > 0;

        if(enable && !hasSilkTouch)
        {
            stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
        }
    }
}