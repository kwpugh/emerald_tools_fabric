package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial
{
	private static int durability = EmeraldTools.CONFIG.GENERAL.amethystDurability;
	private static float miningSpeed = EmeraldTools.CONFIG.GENERAL.amethystMiningSpeed;
	private static float attackDamage = EmeraldTools.CONFIG.GENERAL.amethystAttackDamage;
	private static int miningLevel = 3;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.amethystEnchantability;
	
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
		return Ingredient.ofItems(Items.AMETHYST_SHARD);
	}
}