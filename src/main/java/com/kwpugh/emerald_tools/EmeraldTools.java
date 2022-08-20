package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.config.EmeraldToolsConfig;
import com.kwpugh.emerald_tools.init.*;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.ModifyItemAttributeModifiersCallback;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer
{
    public static final String MOD_ID = "emerald_tools";
    public static final ItemGroup EMERALD_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "emerald_tools_group"), () -> new ItemStack(Items.EMERALD));
    public static final EmeraldToolsConfig CONFIG = AutoConfig.register(EmeraldToolsConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();
    
    @Override
    public void onInitialize()
    {
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();
    	ItemInit.registerItems();
        TagInit.registerTags();
        RecipeInit.registerRecipes();
        EntityInit.registerEntities();
        DispenserBehaviorInit.registerBehaviors();
    }
}
