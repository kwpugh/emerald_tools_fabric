package com.kwpugh.emerald_tools.materials;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RubyArmorMaterial implements ArmorMaterial
{
	private static int durabilityMultiplier = EmeraldTools.CONFIG.GENERAL.rubyDurabilityMultiplier;
	private static int enchantability = EmeraldTools.CONFIG.GENERAL.rubyArmorEnchantability;
	private static float toughness = EmeraldTools.CONFIG.GENERAL.rubyToughness;
	private static float knochback = EmeraldTools.CONFIG.GENERAL.rubyKnockbackResistance;
	
			
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{3, 6, 8, 3};
    
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
		return Ingredient.ofItems(ItemInit.RUBY);
	}

	@Override
	public String getName() 
	{
		return "ruby";
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
