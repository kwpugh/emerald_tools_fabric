package com.kwpugh.emerald_tools.items.areatools;

import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModHammer extends PickaxeItem
{
	public ModHammer(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	boolean obsidianFlag;
	
    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity playerIn)
    {
        if(!playerIn.isSneaking() && playerIn.getMainHandStack().isSuitableFor(world.getBlockState(pos)))
    	{
        	obsidianFlag = (state.getBlock() == Blocks.OBSIDIAN || state.getBlock() == Blocks.CRYING_OBSIDIAN) ? true : false;
        	AreaToolUtil.attemptBreakNeighbors(world, playerIn, 1, "hammer", obsidianFlag);
        }

        return true;
    }
    
	@Override
	public boolean isSuitableFor(BlockState state) 
	{
		if (Items.DIAMOND_PICKAXE.isSuitableFor(state))
		{
			return true;
		}

		return Items.DIAMOND_PICKAXE.getMiningSpeedMultiplier(null, state) > 1.0f;
	}
 
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.emerald_tools.hammer.tip1").formatted(Formatting.GREEN));
	}
}