package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AmethystArmorMaterial implements ArmorMaterial
{
	private static int durabilityMultiplier = EmeraldTools.CONFIG.GENERAL.amethystDurabilityMultiplier;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.amethystArmorEnchantability;
	private static float toughness = EmeraldTools.CONFIG.GENERAL.amethystToughness;
	private static float knochback = EmeraldTools.CONFIG.GENERAL.amethystKnockbackResistance;
	private static int amethystHeadProtection = EmeraldTools.CONFIG.GENERAL.amethystHeadProtection;
	private static int amethystChestProtection = EmeraldTools.CONFIG.GENERAL.amethystChestProtection;
	private static int amethystLeggingsProtection = EmeraldTools.CONFIG.GENERAL.amethystLeggingsProtection;
	private static int amethystBootsProtection = EmeraldTools.CONFIG.GENERAL.amethystBootsProtection;
			
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{amethystHeadProtection, amethystLeggingsProtection, amethystChestProtection, amethystBootsProtection};
    
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
		return Ingredient.ofItems(Items.AMETHYST_SHARD);
	}

	@Override
	public String getName() 
	{
		return "amethyst";
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