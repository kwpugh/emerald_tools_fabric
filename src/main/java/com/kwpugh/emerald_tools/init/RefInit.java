package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;

public class RefInit
{
    public static int steelDurabilityMultiplier;
    public static int steelEnchantability;
    public static float steelToughness;
    public static float steelKnockback;
    public static int steelHeadProtection;
    public static int steelChestProtection;
    public static int steelLeggingsProtection;
    public static int steelBootsProtection;

    public static void init()
    {
        steelDurabilityMultiplier = EmeraldTools.CONFIG.GENERAL.steelDurabilityMultiplier;
        steelEnchantability = EmeraldTools.CONFIG.GENERAL.steelArmorEnchantability;
        steelToughness = EmeraldTools.CONFIG.GENERAL.steelToughness;
        steelKnockback = EmeraldTools.CONFIG.GENERAL.steelKnockbackResistance;
        steelHeadProtection = EmeraldTools.CONFIG.GENERAL.steelHeadProtection;
        steelChestProtection = EmeraldTools.CONFIG.GENERAL.steelChestProtection;
        steelLeggingsProtection = EmeraldTools.CONFIG.GENERAL.steelLeggingsProtection;
        steelBootsProtection = EmeraldTools.CONFIG.GENERAL.steelBootsProtection;
    }
}
