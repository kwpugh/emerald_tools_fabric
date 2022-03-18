package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CopperArmorMaterial implements ArmorMaterial
{
	private static int durabilityMultiplier = EmeraldTools.CONFIG.GENERAL.copperDurabilityMultiplier;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.copperArmorEnchantability;
	private static float toughness = EmeraldTools.CONFIG.GENERAL.copperToughness;
	private static float knochback = EmeraldTools.CONFIG.GENERAL.copperKnockbackResistance;
	private static int copperHeadProtection = EmeraldTools.CONFIG.GENERAL.copperHeadProtection;
	private static int copperChestProtection = EmeraldTools.CONFIG.GENERAL.copperChestProtection;
	private static int copperLeggingsProtection = EmeraldTools.CONFIG.GENERAL.copperLeggingsProtection;
	private static int copperBootsProtection = EmeraldTools.CONFIG.GENERAL.copperBootsProtection;
			
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{copperHeadProtection, copperLeggingsProtection, copperChestProtection, copperBootsProtection};
    
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
		return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
	}

	@Override
	public Ingredient getRepairIngredient() 
	{
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}

	@Override
	public String getName() 
	{
		return "copper";
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