package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ObsidianArmorMaterial implements ArmorMaterial
{
	private static int durabilityMultiplier = EmeraldTools.CONFIG.GENERAL.obsidianDurabilityMultiplier;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.obsidianArmorEnchantability;
	private static float toughness = EmeraldTools.CONFIG.GENERAL.obsidianToughness;
	private static float knochback = EmeraldTools.CONFIG.GENERAL.obsidianKnockbackResistance;
	
			
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{2, 5, 6, 2};
    
	@Override
	public int getDurability(EquipmentSlot slot) 
	{
		return BASE_DURABILITY[slot.getEntitySlotId()] * durabilityMultiplier;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) 
	{
		return PROTECTION_AMOUNT[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability()
	{
		return enchantability;
	}

	@Override
	public SoundEvent getEquipSound() 
	{
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public Ingredient getRepairIngredient() 
	{
		return Ingredient.ofItems(Items.OBSIDIAN);
	}

	@Override
	public String getName() 
	{
		return "obsidian";
	}

	@Override
	public float getToughness()
	{
		return toughness;
	}

	@Override
	public float getKnockbackResistance()
	{
		return knochback;
	}
}
