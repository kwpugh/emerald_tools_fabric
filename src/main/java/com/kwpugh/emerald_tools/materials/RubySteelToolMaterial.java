package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubySteelToolMaterial implements ToolMaterial
{
	private static int durability = EmeraldTools.CONFIG.GENERAL.rubySteelDurability;
	private static float miningSpeed = EmeraldTools.CONFIG.GENERAL.rubySteelMiningSpeed;
	private static float attackDamage = EmeraldTools.CONFIG.GENERAL.rubySteelAttackDamage;
	private static int miningLevel = 3;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.rubySteelEnchantability;
	
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
		return Ingredient.ofItems(ItemInit.RUBY);
	}
}