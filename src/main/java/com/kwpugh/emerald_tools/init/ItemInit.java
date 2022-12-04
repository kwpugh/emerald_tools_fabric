package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.*;
import com.kwpugh.emerald_tools.items.areatools.ModExcavator;
import com.kwpugh.emerald_tools.items.areatools.ModHammer;
import com.kwpugh.emerald_tools.items.areatools.ModTreeAxe;
import com.kwpugh.emerald_tools.items.arrows.AmethystArrowItem;
import com.kwpugh.emerald_tools.items.arrows.DiamondArrowItem;
import com.kwpugh.emerald_tools.items.arrows.EmeraldArrowItem;
import com.kwpugh.emerald_tools.items.arrows.RubyArrowItem;
import com.kwpugh.emerald_tools.items.special.AmethystBow;
import com.kwpugh.emerald_tools.items.special.AmethystHoe;
import com.kwpugh.emerald_tools.items.special.AmethystPickaxe;
import com.kwpugh.emerald_tools.items.special.NetheriteBow;
import com.kwpugh.emerald_tools.materials.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit
{
	public static final ToolMaterial EMERALD_TOOL_MATERIAL = new EmeraldToolMaterial();
	public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new EmeraldArmorMaterial();
	public static final ToolMaterial RUBY_TOOL_MATERIAL = new RubyToolMaterial();
	public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new RubyArmorMaterial();
	public static final ToolMaterial STEEL_TOOL_MATERIAL = new SteelToolMaterial();
	public static final ArmorMaterial STEEL_ARMOR_MATERIAL = new SteelArmorMaterial();
	public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();
	public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = new ObsidianArmorMaterial();
	public static final ToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();
	public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
	public static final ToolMaterial AMETHYST_TOOL_MATERIAL = new AmethystToolMaterial();
	public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new AmethystArmorMaterial();
	public static final ToolMaterial RUBY_STEEL_TOOL_MATERIAL = new RubySteelToolMaterial();


	static int emeraldDurability = EmeraldTools.CONFIG.GENERAL.emeraldDurability;
	static int rubyDurability = EmeraldTools.CONFIG.GENERAL.rubyDurability;
	static int amethystDurability = EmeraldTools.CONFIG.GENERAL.amethystDurability;
	static int steelDurability = EmeraldTools.CONFIG.GENERAL.steelDurability;
	static int obsidianDurability = EmeraldTools.CONFIG.GENERAL.obsidianDurability;
	static int copperDurability = EmeraldTools.CONFIG.GENERAL.copperDurability;

	static int goldDurability = EmeraldTools.CONFIG.GENERAL.goldBowDurability;
	static int ironDurability = EmeraldTools.CONFIG.GENERAL.ironBowDurability;
	static int diamondDurability = EmeraldTools.CONFIG.GENERAL.diamondBowDurability;
	static int netheriteDurability = EmeraldTools.CONFIG.GENERAL.netheriteBowDurability;

	
	public static final Item EMERALD_SWORD = new ModSword(EMERALD_TOOL_MATERIAL, 3, -2.4F, new Item.Settings());
	public static final Item EMERALD_BOW = new ModBow((new Item.Settings()).maxDamage(emeraldDurability));
	public static final Item EMERALD_PICKAXE = new ModPickaxe(EMERALD_TOOL_MATERIAL, 1, -2.8F, new Item.Settings());
	public static final Item EMERALD_AXE = new ModAxe(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, new Item.Settings());
	public static final Item EMERALD_SHOVEL = new ModShovel(EMERALD_TOOL_MATERIAL, 1.5F, -3.0F, new Item.Settings());
	public static final Item EMERALD_HOE = new ModHoe(EMERALD_TOOL_MATERIAL, -3, 0.0F, new Item.Settings());
	public static final Item EMERALD_EXCAVATOR = new ModExcavator(EMERALD_TOOL_MATERIAL, 1.5F, -3.0F, new Item.Settings());
	public static final Item EMERALD_HAMMER = new ModHammer(EMERALD_TOOL_MATERIAL, 1, -2.8F, new Item.Settings());
	public static final Item EMERALD_PAXEL = new ModPaxel(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, new Item.Settings());
	public static final Item EMERALD_TREEAXE = new ModTreeAxe(EMERALD_TOOL_MATERIAL, 5.0F, -3.0F, new Item.Settings());
	public static final Item EMERALD_HELMET = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item EMERALD_CHESTPLATE = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item EMERALD_LEGGINGS = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item EMERALD_BOOTS = new ModArmor(EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));
	
	public static final Item RUBY = new Item((new Item.Settings()));
	public static final Item RUBY_SWORD = new ModSword(RUBY_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item RUBY_BOW = new ModBow((new Item.Settings()).maxDamage(rubyDurability));
	public static final Item RUBY_STEEL_SWORD = new ModSword(RUBY_STEEL_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item RUBY_PICKAXE = new ModPickaxe(RUBY_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item RUBY_AXE = new ModAxe(RUBY_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item RUBY_SHOVEL = new ModShovel(RUBY_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item RUBY_HOE = new ModHoe(RUBY_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()));
	public static final Item RUBY_EXCAVATOR = new ModExcavator(RUBY_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item RUBY_HAMMER = new ModHammer(RUBY_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item RUBY_PAXEL = new ModPaxel(RUBY_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item RUBY_TREEAXE = new ModTreeAxe(RUBY_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item RUBY_HELMET = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item RUBY_CHESTPLATE  = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item RUBY_LEGGINGS = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item RUBY_BOOTS = new ModArmor(RUBY_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));
	
	public static final Item AMETHYST_SWORD = new ModSword(AMETHYST_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item AMETHYST_BOW = new AmethystBow((new Item.Settings()).maxDamage(amethystDurability));
	public static final Item AMETHYST_PICKAXE = new AmethystPickaxe(AMETHYST_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item AMETHYST_AXE = new ModAxe(AMETHYST_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item AMETHYST_SHOVEL = new ModShovel(AMETHYST_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item AMETHYST_HOE = new AmethystHoe(AMETHYST_TOOL_MATERIAL, -3, 0.0F, (new Item.Settings()));
	public static final Item AMETHYST_EXCAVATOR = new ModExcavator(AMETHYST_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item AMETHYST_HAMMER = new ModHammer(AMETHYST_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item AMETHYST_PAXEL = new ModPaxel(AMETHYST_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item AMETHYST_TREEAXE = new ModTreeAxe(AMETHYST_TOOL_MATERIAL, 5.0F, -3.0F, (new Item.Settings()));
	public static final Item AMETHYST_HELMET = new ModArmor(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item AMETHYST_CHESTPLATE  = new ModArmor(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item AMETHYST_LEGGINGS = new ModArmor(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item AMETHYST_BOOTS = new ModArmor(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));
	
	public static final Item STEEL_INGOT = new Item((new Item.Settings()));
	public static final Item STEEL_SWORD = new ModSword(STEEL_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item STEEL_BOW = new ModBow((new Item.Settings()).maxDamage(steelDurability));
	public static final Item STEEL_PICKAXE = new ModPickaxe(STEEL_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item STEEL_AXE = new ModAxe(STEEL_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item STEEL_SHOVEL = new ModShovel(STEEL_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item STEEL_HOE = new ModHoe(STEEL_TOOL_MATERIAL, -2, -1.0F, (new Item.Settings()));
	public static final Item STEEL_EXCAVATOR = new ModExcavator(STEEL_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item STEEL_HAMMER = new ModHammer(STEEL_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item STEEL_PAXEL = new ModPaxel(STEEL_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item STEEL_TREEAXE = new ModTreeAxe(STEEL_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item STEEL_HELMET = new ModArmor(STEEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item STEEL_CHESTPLATE = new ModArmor(STEEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item STEEL_LEGGINGS = new ModArmor(STEEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item STEEL_BOOTS = new ModArmor(STEEL_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));
	
	public static final Item OBSIDIAN_SWORD = new ModSword(OBSIDIAN_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item OBSIDIAN_BOW = new ModBow((new Item.Settings()).maxDamage(obsidianDurability));
	public static final Item OBSIDIAN_PICKAXE = new ModPickaxe(OBSIDIAN_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item OBSIDIAN_AXE = new ModAxe(OBSIDIAN_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item OBSIDIAN_SHOVEL = new ModShovel(OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item OBSIDIAN_HOE = new ModHoe(OBSIDIAN_TOOL_MATERIAL, -2, -1.0F, (new Item.Settings()));
	public static final Item OBSIDIAN_EXCAVATOR = new ModExcavator(OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item OBSIDIAN_HAMMER = new ModHammer(OBSIDIAN_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item OBSIDIAN_PAXEL = new ModPaxel(OBSIDIAN_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item OBSIDIAN_TREEAXE = new ModTreeAxe(OBSIDIAN_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item OBSIDIAN_HELMET = new ModArmor(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item OBSIDIAN_CHESTPLATE = new ModArmor(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item OBSIDIAN_LEGGINGS = new ModArmor(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item OBSIDIAN_BOOTS = new ModArmor(OBSIDIAN_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));	
	
	public static final Item COPPER_SWORD = new ModSword(COPPER_TOOL_MATERIAL, 3, -2.4F, (new Item.Settings()));
	public static final Item COPPER_BOW = new ModBow((new Item.Settings()).maxDamage(copperDurability));
	public static final Item COPPER_PICKAXE = new ModPickaxe(COPPER_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item COPPER_AXE = new ModAxe(COPPER_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item COPPER_SHOVEL = new ModShovel(COPPER_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item COPPER_HOE = new ModHoe(COPPER_TOOL_MATERIAL, -2, -1.0F, (new Item.Settings()));
	public static final Item COPPER_EXCAVATOR = new ModExcavator(COPPER_TOOL_MATERIAL, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item COPPER_HAMMER = new ModHammer(COPPER_TOOL_MATERIAL, 1, -2.8F, (new Item.Settings()));
	public static final Item COPPER_PAXEL = new ModPaxel(COPPER_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item COPPER_TREEAXE = new ModTreeAxe(COPPER_TOOL_MATERIAL, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item COPPER_HELMET = new ModArmor(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings()));
	public static final Item COPPER_CHESTPLATE = new ModArmor(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings()));
	public static final Item COPPER_LEGGINGS = new ModArmor(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings()));
	public static final Item COPPER_BOOTS = new ModArmor(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings()));

	public static final Item EMERALD_ARROW = new EmeraldArrowItem((new Item.Settings()));
	public static final Item RUBY_ARROW = new RubyArrowItem((new Item.Settings()));
	public static final Item AMETHYST_ARROW = new AmethystArrowItem((new Item.Settings()));
	public static final Item DIAMOND_ARROW = new DiamondArrowItem((new Item.Settings()));

	public static final Item WOODEN_EXCAVATOR = new ModExcavator(ToolMaterials.WOOD, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item WOODEN_HAMMER = new ModHammer(ToolMaterials.WOOD, 1, -2.8F, (new Item.Settings()));
	public static final Item WOODEN_PAXEL = new ModPaxel(ToolMaterials.WOOD, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item WOODEN_TREEAXE = new ModTreeAxe(ToolMaterials.WOOD, 6.0F, -3.1F, (new Item.Settings()));

	public static final Item GOLD_EXCAVATOR = new ModExcavator(ToolMaterials.GOLD, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item GOLD_HAMMER = new ModHammer(ToolMaterials.GOLD, 1, -2.8F, (new Item.Settings()));
	public static final Item GOLD_PAXEL = new ModPaxel(ToolMaterials.GOLD, 6.0F, -3.0F, (new Item.Settings()));
	public static final Item GOLD_TREEAXE = new ModTreeAxe(ToolMaterials.GOLD, 6.0F, -3.0F, (new Item.Settings()));
	public static final Item GOLD_BOW = new ModBow((new Item.Settings()).maxDamage(goldDurability));

	public static final Item IRON_EXCAVATOR = new ModExcavator(ToolMaterials.IRON, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item IRON_HAMMER = new ModHammer(ToolMaterials.IRON, 1, -2.8F, (new Item.Settings()));
	public static final Item IRON_PAXEL = new ModPaxel(ToolMaterials.IRON, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item IRON_TREEAXE = new ModTreeAxe(ToolMaterials.IRON, 6.0F, -3.1F, (new Item.Settings()));
	public static final Item IRON_BOW = new ModBow((new Item.Settings()).maxDamage(ironDurability));

	public static final Item DIAMOND_EXCAVATOR = new ModExcavator(ToolMaterials.DIAMOND, 1.5F, -3.0F, (new Item.Settings()));
	public static final Item DIAMOND_HAMMER = new ModHammer(ToolMaterials.DIAMOND, 1, -2.8F, (new Item.Settings()));
	public static final Item DIAMOND_PAXEL = new ModPaxel(ToolMaterials.DIAMOND, 5.0F, -3.1F, (new Item.Settings()));
	public static final Item DIAMOND_TREEAXE = new ModTreeAxe(ToolMaterials.DIAMOND, 5.0F, -3.1F, (new Item.Settings()));
	public static final Item DIAMOND_BOW = new ModBow((new Item.Settings()).maxDamage(diamondDurability));

	public static final Item NETHERITE_EXCAVATOR = new ModExcavator(ToolMaterials.NETHERITE, 1.5F, -3.0F, (new Item.Settings()).fireproof());
	public static final Item NETHERITE_HAMMER = new ModHammer(ToolMaterials.NETHERITE, 1, -2.8F, (new Item.Settings()).fireproof());
	public static final Item NETHERITE_PAXEL = new ModPaxel(ToolMaterials.NETHERITE, 6.0F, -3.0F, (new Item.Settings()).fireproof());
	public static final Item NETHERITE_TREEAXE = new ModTreeAxe(ToolMaterials.NETHERITE, 6.0F, -3.0F, (new Item.Settings()).fireproof());
	public static final Item NETHERITE_BOW = new NetheriteBow((new Item.Settings()).maxDamage(netheriteDurability));


	public static void registerItems()
	{
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_axe"), EMERALD_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_hoe"), EMERALD_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_helmet"), EMERALD_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_boots"), EMERALD_BOOTS);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby"), RUBY);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_sword"), RUBY_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_steel_sword"), RUBY_STEEL_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_axe"), RUBY_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_hoe"), RUBY_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_helmet"), RUBY_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_boots"), RUBY_BOOTS);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_sword"), AMETHYST_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_pickaxe"), AMETHYST_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_axe"), AMETHYST_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_shovel"), AMETHYST_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_hoe"), AMETHYST_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_helmet"), AMETHYST_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_chestplate"), AMETHYST_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_leggings"), AMETHYST_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_boots"), AMETHYST_BOOTS);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_ingot"), STEEL_INGOT);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_sword"), STEEL_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_pickaxe"), STEEL_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_axe"), STEEL_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_shovel"), STEEL_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_hoe"), STEEL_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_helmet"), STEEL_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_chestplate"), STEEL_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_leggings"), STEEL_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_boots"), STEEL_BOOTS);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_sword"), COPPER_SWORD);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_axe"), COPPER_AXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_hoe"), COPPER_HOE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_helmet"), COPPER_HELMET);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_leggings"), COPPER_LEGGINGS);
 		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_boots"), COPPER_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_bow"), EMERALD_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_bow"), RUBY_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_bow"), AMETHYST_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_bow"), STEEL_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_bow"), OBSIDIAN_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_bow"), COPPER_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "gold_bow"), GOLD_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "iron_bow"), IRON_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_bow"), DIAMOND_BOW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "netherite_bow"), NETHERITE_BOW);

		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_arrow"), EMERALD_ARROW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_arrow"), RUBY_ARROW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_arrow"), AMETHYST_ARROW);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_arrow"), DIAMOND_ARROW);

		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_excavator"), EMERALD_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_excavator"), RUBY_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_excavator"), AMETHYST_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_excavator"), STEEL_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_excavator"), OBSIDIAN_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_excavator"), COPPER_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "wooden_excavator"), WOODEN_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "gold_excavator"), GOLD_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "iron_excavator"), IRON_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_excavator"), DIAMOND_EXCAVATOR);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "netherite_excavator"), NETHERITE_EXCAVATOR);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_hammer"), EMERALD_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_hammer"), RUBY_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_hammer"), AMETHYST_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_hammer"), STEEL_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_hammer"), OBSIDIAN_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_hammer"), COPPER_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "wooden_hammer"), WOODEN_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "gold_hammer"), GOLD_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "iron_hammer"), IRON_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_hammer"), DIAMOND_HAMMER);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "netherite_hammer"), NETHERITE_HAMMER);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_paxel"), EMERALD_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_paxel"), RUBY_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_paxel"), AMETHYST_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_paxel"), STEEL_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_paxel"), OBSIDIAN_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_paxel"), COPPER_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "wooden_paxel"), WOODEN_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "gold_paxel"), GOLD_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "iron_paxel"), IRON_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_paxel"), DIAMOND_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "netherite_paxel"), NETHERITE_PAXEL);


		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "emerald_treeaxe"), EMERALD_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "ruby_treeaxe"), RUBY_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "amethyst_treeaxe"), AMETHYST_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "steel_treeaxe"), STEEL_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "obsidian_treeaxe"), OBSIDIAN_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "copper_treeaxe"), COPPER_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "wooden_treeaxe"), WOODEN_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "gold_treeaxe"), GOLD_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "iron_treeaxe"), IRON_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "diamond_treeaxe"), DIAMOND_TREEAXE);
		Registry.register(Registries.ITEM, new Identifier(EmeraldTools.MOD_ID, "netherite_treeaxe"), NETHERITE_TREEAXE);
	 }	 	
}

