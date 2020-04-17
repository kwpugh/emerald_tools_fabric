package com.kwpugh.emerald_tools.util;

import org.lwjgl.system.NonnullDefault;

import com.kwpugh.emerald_tools.init.ModInit;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public final class PlayerEquipUtil
{
    @NonnullDefault
    //@SuppressWarnings("ConstantConditions")
    public static <T> T _null() {
        return null;
    }
    public static boolean isPlayerGotWaterBreathing(PlayerEntity player)
    { 
    	ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
		ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
		ItemStack legs = player.getEquippedStack(EquipmentSlot.LEGS);
	    ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
		
	    //Full Set
    	if(		((head.getItem() == ModInit.EMERALD_HELMET && 
    			chest.getItem() == ModInit.EMERALD_CHESTPLATE && 
    			legs.getItem() == ModInit.EMERALD_LEGGINGS && 
    			feet.getItem() == ModInit.EMERALD_BOOTS ||
    	
    			(head.getItem() == ModInit.RUBY_HELMET && 
    			chest.getItem() == ModInit.RUBY_CHESTPLATE && 
    			legs.getItem() == ModInit.RUBY_LEGGINGS && 
    			feet.getItem() == ModInit.RUBY_LEGGINGS)))   )
      	{
      		return true;  		
      	}
    	
        return false;
    } 
} 