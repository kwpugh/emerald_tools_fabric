package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockBase extends Block
{
	
public BlockBase(String name, float hardness, float resistance)
{
	super(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).strength(hardness, resistance).build());
	
	Registry.register(Registry.BLOCK, new Identifier(EmeraldTools.MOD_ID, name), this);
	Registry.register(Registry.ITEM,new Identifier(EmeraldTools.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(EmeraldTools.EMERALD_TOOLS_GROUP)));

    }
}