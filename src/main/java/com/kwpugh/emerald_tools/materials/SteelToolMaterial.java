package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial
{
	private static int durability = EmeraldTools.CONFIG.GENERAL.steelDurability;
	private static float miningSpeed = EmeraldTools.CONFIG.GENERAL.steelMiningSpeed;
	private static float attackDamage = EmeraldTools.CONFIG.GENERAL.steelAttackDamage;
	private static int miningLevel = EmeraldTools.CONFIG.GENERAL.steelMiningLevel;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.steelEnchantability;
	
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
		return Ingredient.ofItems(ItemInit.STEEL_INGOT);
	}
}
