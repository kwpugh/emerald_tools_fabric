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

public class RubyArrowItem extends ArrowItem
{
    public RubyArrowItem(Settings settings)
    {
        super(settings);
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter)
    {
        return new RubyArrowEntity(world, shooter);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(EmeraldTools.CONFIG.GENERAL.rubyExtraDamage > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.damage", EmeraldTools.CONFIG.GENERAL.rubyExtraDamage).formatted(Formatting.GREEN));
        }

        if(EmeraldTools.CONFIG.GENERAL.rubyPierceLevel > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.pierce", EmeraldTools.CONFIG.GENERAL.rubyPierceLevel).formatted(Formatting.GREEN));
        }

        if(EmeraldTools.CONFIG.GENERAL.rubyPunchLevel > 0)
        {
            tooltip.add(Text.translatable("item.emerald_tools.arrow.punch", EmeraldTools.CONFIG.GENERAL.rubyPunchLevel).formatted(Formatting.GREEN));
        }
    }
}