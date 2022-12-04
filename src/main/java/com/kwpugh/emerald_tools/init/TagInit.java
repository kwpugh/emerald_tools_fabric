package com.kwpugh.emerald_tools.init;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagInit
{
    // Mod tag to expose to java code
    public static final TagKey<Item> RUBIES = TagKey.of(RegistryKeys.ITEM, new Identifier("emerald_tools", "rubies"));

    public static void registerTags()
    {
        // No Op for now
    }
}