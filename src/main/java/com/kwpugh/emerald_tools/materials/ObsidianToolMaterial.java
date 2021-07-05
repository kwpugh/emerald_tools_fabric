package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial
{
	private static int durability = EmeraldTools.CONFIG.GENERAL.obsidianDurability;
	private static float miningSpeed = EmeraldTools.CONFIG.GENERAL.obsidianMiningSpeed;
	private static float attackDamage = EmeraldTools.CONFIG.GENERAL.obsidianAttackDamage;
	private static int miningLevel = EmeraldTools.CONFIG.GENERAL.obsidianMiningLevel;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.obsidianEnchantability;
	
	@Override
	public int getDurability() 
	{
		return durability;
	}

	@Override
	public float getMiningSpeedMultiplier()
	{
		return miningSpeed;
	}

	@Override
	public float getAttackDamage() 
	{
		return attackDamage;
	}

	@Override
	public int getMiningLevel()
	{
		return miningLevel;
	}

	@Override
	public int getEnchantability()
	{
		return enchantability;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.ofItems(Items.OBSIDIAN);
	}
}
