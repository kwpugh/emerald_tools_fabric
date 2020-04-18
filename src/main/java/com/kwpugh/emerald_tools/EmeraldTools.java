package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.init.ModBlocks;
import com.kwpugh.emerald_tools.init.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer
{
    public static final String MOD_ID = "emerald_tools";

    public static final ItemGroup EMERALD_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "emerald_tools_group"), () -> new ItemStack(ModItems.EMERALD_SWORD));
	
    @Override
    public void onInitialize()
    {
    	ModBlocks.init();
        new ModItems();
    }
}
