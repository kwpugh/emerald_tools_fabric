package com.kwpugh.emerald_tools.init;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class TagInit
{
    // Mod tag to expose to java code
    public static final Tag<Item> RUBIES = TagFactory.ITEM.create(new Identifier("emerald_tools", "rubies"));


    public static void registerTags()
    {
        // No Op for now
    }
}