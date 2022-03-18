package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldArmorMaterial implements ArmorMaterial
{
	private static int durabilityMultiplier = EmeraldTools.CONFIG.GENERAL.emeraldDurabilityMultiplier;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.emeraldArmorEnchantability;
	private static float toughness = EmeraldTools.CONFIG.GENERAL.emeraldToughness;
	private static float knochback = EmeraldTools.CONFIG.GENERAL.emeraldKnockbackResistance;
	private static int emeraldHeadProtection = EmeraldTools.CONFIG.GENERAL.emeraldHeadProtection;
	private static int emeraldChestProtection = EmeraldTools.CONFIG.GENERAL.emeraldChestProtection;
	private static int emeraldLeggingsProtection = EmeraldTools.CONFIG.GENERAL.emeraldLeggingsProtection;
	private static int emeraldBootsProtection = EmeraldTools.CONFIG.GENERAL.emeraldBootsProtection;
			
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{emeraldHeadProtection, emeraldLeggingsProtection, emeraldChestProtection, emeraldBootsProtection};
    
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
		return Ingredient.ofItems(Items.EMERALD);
	}

	@Override
	public String getName() 
	{
		return "emerald";
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
