package com.kwpugh.emerald_tools.recipes;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.init.RecipeInit;
import net.minecraft.block.Block;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.*;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ToolRepair extends SpecialCraftingRecipe
{
    private Item repairItem;
    private int damageAmount;

    public ToolRepair(Identifier identifier)
    {
        super(identifier);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world)
    {
        return matchResult(inventory).matches();
    }

    @Override
    public ItemStack craft(CraftingInventory inventory)
    {
        MatchResult matchResult = matchResult(inventory);

        if (matchResult.matches())
        {
            ItemStack toolStack = matchResult.getToolStack();
            ItemStack craftStack = toolStack.copy();
            int damage = Math.max(craftStack.getDamage() - damageAmount, 0);
            craftStack.setDamage(damage);

            return craftStack;
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height)
    {
        return width * height >= 2;
    }


    @Override
    public RecipeSerializer<?> getSerializer()
    {
        return RecipeInit.TOOL_REPAIR;
    }

    private MatchResult matchResult(CraftingInventory inventory)
    {
        ItemStack toolStack = ItemStack.EMPTY;
        ItemStack materialStack = ItemStack.EMPTY;

        for (int i = 0; i < inventory.size(); i++)
        {
            ItemStack stackToTest = inventory.getStack(i);

            if (!stackToTest.isEmpty())
            {
                Item itemToTest = stackToTest.getItem();

                if(itemToTest instanceof ToolItem toolItem)
                {
                    setRepairValues(toolItem);

                    if(!toolStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    toolStack = stackToTest;
                    continue;
                }
                else if(itemToTest == repairItem)
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    materialStack = stackToTest;
                    continue;
                }
                else if(BlockTags.PLANKS.contains(Block.getBlockFromItem(itemToTest)))
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    materialStack = stackToTest;
                    continue;
                }
                else if(BlockTags.BASE_STONE_OVERWORLD.contains(Block.getBlockFromItem(itemToTest)))
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    materialStack = stackToTest;
                    continue;
                }

                return MatchResult.EMPTY;
            }
        }

        return new MatchResult(toolStack, materialStack);
    }

    private void setRepairValues(ToolItem toolItem)
    {
        if(toolItem.getMaterial() == ToolMaterials.WOOD)
        {
            damageAmount = EmeraldTools.CONFIG.GENERAL.woodenRepairAmount;
        }
        if(toolItem.getMaterial() == ToolMaterials.STONE)
        {
            damageAmount = EmeraldTools.CONFIG.GENERAL.stoneRepairAmount;
        }
        else if(toolItem.getMaterial() == ToolMaterials.GOLD)
        {
            repairItem = Items.RAW_GOLD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.goldRepairAmount;
        }
        else if(toolItem.getMaterial() == ToolMaterials.IRON)
        {
            repairItem = Items.RAW_IRON;
            damageAmount = EmeraldTools.CONFIG.GENERAL.ironRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.COPPER_TOOL_MATERIAL)
        {
            repairItem = Items.RAW_COPPER;
            damageAmount = EmeraldTools.CONFIG.GENERAL.copperRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.STEEL_TOOL_MATERIAL)
        {
            repairItem = ItemInit.STEEL_INGOT;
            damageAmount = EmeraldTools.CONFIG.GENERAL.steelRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.OBSIDIAN_TOOL_MATERIAL)
        {
            repairItem = Items.OBSIDIAN;
            damageAmount = EmeraldTools.CONFIG.GENERAL.obsidianRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.EMERALD_TOOL_MATERIAL)
        {
            repairItem = Items.EMERALD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.emeraldRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.AMETHYST_TOOL_MATERIAL)
        {
            repairItem = Items.AMETHYST_SHARD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.amethystRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.RUBY_TOOL_MATERIAL)
        {
            repairItem = ItemInit.RUBY;
            damageAmount = EmeraldTools.CONFIG.GENERAL.rubyRepairAmount;
        }
    }

    private record MatchResult(ItemStack toolStack, ItemStack materialStack)
    {
        private static final MatchResult EMPTY = new MatchResult(ItemStack.EMPTY, ItemStack.EMPTY);

        private ItemStack getToolStack()
        {
            return toolStack;
        }

        private boolean matches()
        {
            return !toolStack.isEmpty() && !materialStack.isEmpty();
        }
    }
}
