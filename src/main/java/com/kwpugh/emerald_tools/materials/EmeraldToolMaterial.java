package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial
{
	private static int durability = EmeraldTools.CONFIG.GENERAL.emeraldDurability;
	private static float miningSpeed = EmeraldTools.CONFIG.GENERAL.emeraldtMiningSpeed;
	private static float attackDamage = EmeraldTools.CONFIG.GENERAL.emeraldAttackDamage;
	private static int miningLevel = EmeraldTools.CONFIG.GENERAL.emeraldMiningLevel;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.emeraldEnchantability;
	
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
		return Ingredient.ofItems(Items.EMERALD);
	}
}
