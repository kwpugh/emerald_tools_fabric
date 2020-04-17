package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.ModArmor;
import com.kwpugh.emerald_tools.items.ModAxe;
import com.kwpugh.emerald_tools.items.ModHoe;
import com.kwpugh.emerald_tools.items.ModPickaxe;
import com.kwpugh.emerald_tools.items.ModShovel;
import com.kwpugh.emerald_tools.items.ModSword;
import com.kwpugh.emerald_tools.materials.ModArmorMaterials;
import com.kwpugh.emerald_tools.materials.ModToolMaterials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModInit
{
	public static void init()
	{
		
	}
	
	//public static final Item RUBY = register("ruby", new Item(new Item.Settings().maxCount(64).group(EmeraldTools.EMERALD_TOOLS_GROUP)));

	public static final Item EMERALD_SWORD;
	public static final Item EMERALD_PICKAXE;
	public static final Item EMERALD_AXE;
	public static final Item EMERALD_SHOVEL;
	public static final Item EMERALD_HOE;
	
	public static final Item EMERALD_HELMET;
	public static final Item EMERALD_CHESTPLATE;
	public static final Item EMERALD_LEGGINGS;
	public static final Item EMERALD_BOOTS;
	
	public static final Item RUBY;
	public static final Item RUBY_SWORD;
	public static final Item RUBY_PICKAXE;
	public static final Item RUBY_AXE;
	public static final Item RUBY_SHOVEL;
	public static final Item RUBY_HOE;
	
	public static final Item RUBY_HELMET;
	public static final Item RUBY_CHESTPLATE;
	public static final Item RUBY_LEGGINGS;
	public static final Item RUBY_BOOTS;
	
	public static final Item STEEL_INGOT;
	public static final Item STEEL_SWORD;
	public static final Item STEEL_PICKAXE;
	public static final Item STEEL_AXE;
	public static final Item STEEL_SHOVEL;
	public static final Item STEEL_HOE;
	
	public static final Item STEEL_HELMET;
	public static final Item STEEL_CHESTPLATE;
	public static final Item STEEL_LEGGINGS;
	public static final Item STEEL_BOOTS;
	
	static
	{
	    EMERALD_SWORD = register((String)"emerald_sword", (Item)(new ModSword(ModToolMaterials.EMERALD, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_PICKAXE = register((String)"emerald_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.EMERALD, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_AXE = register((String)"emerald_axe", (Item)(new ModAxe(ModToolMaterials.EMERALD, 5.0F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_SHOVEL = register((String)"emerald_shovel", (Item)(new ModShovel(ModToolMaterials.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_HOE = register((String)"emerald_hoe", (Item)(new ModHoe(ModToolMaterials.EMERALD, -3, 0.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		
	    EMERALD_HELMET = register((String)"emerald_helmet", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_CHESTPLATE = register((String)"emerald_chestplate", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_LEGGINGS = register((String)"emerald_leggings", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    EMERALD_BOOTS = register((String)"emerald_boots", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));

		RUBY = register("ruby", new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP)));		
		
		RUBY_SWORD = register((String)"ruby_sword", (Item)(new ModSword(ModToolMaterials.RUBY, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		RUBY_PICKAXE = register((String)"ruby_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.RUBY, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		RUBY_AXE = register((String)"ruby_axe", (Item)(new ModAxe(ModToolMaterials.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		RUBY_SHOVEL = register((String)"ruby_shovel", (Item)(new ModShovel(ModToolMaterials.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		RUBY_HOE = register((String)"ruby_hoe", (Item)(new ModHoe(ModToolMaterials.RUBY, -3, 0.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		
		RUBY_HELMET = register((String)"ruby_helmet", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
		RUBY_CHESTPLATE = register((String)"ruby_chestplate", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    RUBY_LEGGINGS = register((String)"ruby_leggings", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    RUBY_BOOTS = register((String)"ruby_boots", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    
	    STEEL_INGOT = register("steel_ingot", new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP)));
	    
	    STEEL_SWORD = register((String)"steel_sword", (Item)(new ModSword(ModToolMaterials.STEEL, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));  
	    STEEL_PICKAXE = register((String)"steel_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.STEEL, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_AXE = register((String)"steel_axe", (Item)(new ModAxe(ModToolMaterials.STEEL, 6.0F, -3.1F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_SHOVEL = register((String)"steel_shovel", (Item)(new ModShovel(ModToolMaterials.STEEL, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_HOE = register((String)"steel_hoe", (Item)(new ModHoe(ModToolMaterials.STEEL, -2, -1.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    
	    STEEL_HELMET = register((String)"steel_helmet", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_CHESTPLATE = register((String)"steel_chestplate", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_LEGGINGS = register((String)"steel_leggings", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	    STEEL_BOOTS = register((String)"steel_boots", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));	      
	}
	
	public static Item register(String name, Item item)
	{
	    return Registry.register(Registry.ITEM, new Identifier(EmeraldTools.MOD_ID, name), item);
	}
}