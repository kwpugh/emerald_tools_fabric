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

public class ContentInit
{
	public static final Item EMERALD_SWORD = registerItem((String)"emerald_sword", (Item)(new ModSword(ModToolMaterials.EMERALD, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_PICKAXE = registerItem((String)"emerald_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.EMERALD, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_AXE = registerItem((String)"emerald_axe", (Item)(new ModAxe(ModToolMaterials.EMERALD, 5.0F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_SHOVEL = registerItem((String)"emerald_shovel", (Item)(new ModShovel(ModToolMaterials.EMERALD, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_HOE = registerItem((String)"emerald_hoe", (Item)(new ModHoe(ModToolMaterials.EMERALD, -3, 0.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));

	public static final Item EMERALD_HELMET = registerItem((String)"emerald_helmet", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_CHESTPLATE = registerItem((String)"emerald_chestplate", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_LEGGINGS = registerItem((String)"emerald_leggings", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item EMERALD_BOOTS = registerItem((String)"emerald_boots", (Item)(new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	
	public static final Item RUBY = registerItem("ruby", new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP)));	
	public static final BlockBase RUBY_BLOCK= new BlockBase("ruby_block", 5.0f, 5.0f);
	
	public static final Item RUBY_SWORD = registerItem((String)"ruby_sword", (Item)(new ModSword(ModToolMaterials.RUBY, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_PICKAXE = registerItem((String)"ruby_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.RUBY, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_AXE = registerItem((String)"ruby_axe", (Item)(new ModAxe(ModToolMaterials.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_SHOVEL = registerItem((String)"ruby_shovel", (Item)(new ModShovel(ModToolMaterials.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_HOE = registerItem((String)"ruby_hoe", (Item)(new ModHoe(ModToolMaterials.RUBY, -3, 0.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));

	public static final Item RUBY_HELMET = registerItem((String)"ruby_helmet", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_CHESTPLATE  = registerItem((String)"ruby_chestplate", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_LEGGINGS = registerItem((String)"ruby_leggings", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item RUBY_BOOTS = registerItem((String)"ruby_boots", (Item)(new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	
	public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP)));
	public static final BlockBase STEEL_BLOCK = new BlockBase("steel_block", 5.0f, 5.0f);
		
	public static final Item STEEL_SWORD = registerItem((String)"steel_sword", (Item)(new ModSword(ModToolMaterials.STEEL, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_PICKAXE = registerItem((String)"steel_pickaxe", (Item)(new ModPickaxe(ModToolMaterials.STEEL, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_AXE = registerItem((String)"steel_axe", (Item)(new ModAxe(ModToolMaterials.STEEL, 6.0F, -3.1F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_SHOVEL = registerItem((String)"steel_shovel", (Item)(new ModShovel(ModToolMaterials.STEEL, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_HOE = registerItem((String)"steel_hoe", (Item)(new ModHoe(ModToolMaterials.STEEL, -2, -1.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
			
	public static final Item STEEL_HELMET = registerItem((String)"steel_helmet", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_CHESTPLATE = registerItem((String)"steel_chestplate", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_LEGGINGS = registerItem((String)"steel_leggings", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));
	public static final Item STEEL_BOOTS = registerItem((String)"steel_boots", (Item)(new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP))));	     
	
	public static Item registerItem(String name, Item item)
	{
	    return Registry.register(Registry.ITEM, new Identifier(EmeraldTools.MOD_ID, name), item);
	}	
}