package com.kwpugh.emerald_tools.items;

import com.kwpugh.emerald_tools.init.ModInit;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModArmor extends ArmorItem
{
	public ModArmor(ArmorMaterial material, EquipmentSlot slot, Settings settings)
	{
		super(material, slot, settings);
	}
	
	public void onArmorTick(final ItemStack stack, final World world, final PlayerEntity player)
	{
		if(player instanceof PlayerEntity)
		{
			ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
			ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
			ItemStack legs = player.getEquippedStack(EquipmentSlot.LEGS);
		    ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
		    
		    //Full Set
	    	if(		head.getItem() == ModInit.EMERALD_HELMET && 
	    			chest.getItem() == ModInit.EMERALD_CHESTPLATE && 
	    			legs.getItem() == ModInit.EMERALD_LEGGINGS && 
	    			feet.getItem() == ModInit.EMERALD_BOOTS)
	    	{
				player.setAir(300);
	    	}
		}
	}
}
