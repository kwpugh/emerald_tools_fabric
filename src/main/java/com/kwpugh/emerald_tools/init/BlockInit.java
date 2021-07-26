package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit
{
	static boolean enableRuby = EmeraldTools.CONFIG.GENERAL.enableRubySet;
	static boolean enableSteel = EmeraldTools.CONFIG.GENERAL.enableSteelSet;

	public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(3.0F));
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(3.0F));
	
	public static void registerBlocks()
	{
		Registry.register(Registry.BLOCK, new Identifier(EmeraldTools.MOD_ID, "ruby_block"), RUBY_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(EmeraldTools.MOD_ID, "steel_block"), STEEL_BLOCK);
	}
	
	public static void registerBlockItems()
	{
		if(enableRuby)
		{
			Registry.register(Registry.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP)));
		}

		if(enableSteel)
		{
			Registry.register(Registry.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP)));
		}
	}
}