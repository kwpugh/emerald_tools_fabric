package com.kwpugh.emerald_tools.items;

import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ModSword extends SwordItem
{
	public ModSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings)
	{
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}
}
