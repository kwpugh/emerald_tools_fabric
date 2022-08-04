package com.kwpugh.emerald_tools.items.areatools;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.pugh_tools.Tools.HammerCrude;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ModHammerCrude extends HammerCrude
{
    public ModHammerCrude(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
    {
        super(material, attackDamage, attackSpeed, EmeraldTools.CONFIG.GENERAL.enableFullDamage, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        tooltip.add(Text.translatable("item.emerald_tools.hammer.tip1").formatted(Formatting.GREEN));
    }
}