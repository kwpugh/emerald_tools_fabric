package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.init.ModInit;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer
{
    public static final String MOD_ID = "emerald_tools";

    public static final ItemGroup EMERALD_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "emerald_tools_group"), () -> new ItemStack(Items.EMERALD));
	
    @Override
    public void onInitialize()
    {
        ModInit.init();
    }
}
