package com.kwpugh.emerald_tools.items.arrows;

import com.kwpugh.emerald_tools.EmeraldTools;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class DiamondArrowItem extends ArrowItem
{
    public DiamondArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new DiamondArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(EmeraldTools.CONFIG.GENERAL.diamondExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.damage", EmeraldTools.CONFIG.GENERAL.diamondExtraDamage).formatted(Formatting.GREEN));
        }

        if(EmeraldTools.CONFIG.GENERAL.diamondPierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.pierce", EmeraldTools.CONFIG.GENERAL.diamondPierceLevel).formatted(Formatting.GREEN));
        }

        if(EmeraldTools.CONFIG.GENERAL.diamondPunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.punch", EmeraldTools.CONFIG.GENERAL.diamondPunchLevel).formatted(Formatting.GREEN));
        }
    }
}