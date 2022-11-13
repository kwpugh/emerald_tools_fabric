package com.kwpugh.emerald_tools.init;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKeys;

public class TagInit
{
    // Mod tag to expose to java code
    public static final TagKey<Item> RUBIES = TagKey.of(RegistryKeys.ITEM, new Identifier("emerald_tools", "rubies"));

    public static void registerTags()
    {
        // No Op for now
    }
}