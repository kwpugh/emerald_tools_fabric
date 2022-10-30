package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.config.EmeraldToolsConfig;
import com.kwpugh.emerald_tools.init.*;
import com.kwpugh.emerald_tools.util.EmeraldToolsGroup;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;

public class EmeraldTools implements ModInitializer
{
    public static final String MOD_ID = "emerald_tools";
    public static final EmeraldToolsConfig CONFIG = AutoConfig.register(EmeraldToolsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
    
    @Override
    public void onInitialize()
    {
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();
    	ItemInit.registerItems();
        EmeraldToolsGroup.addGroup();
        TagInit.registerTags();
        RecipeInit.registerRecipes();
        EntityInit.registerEntities();
        DispenserBehaviorInit.registerBehaviors();
    }
}
