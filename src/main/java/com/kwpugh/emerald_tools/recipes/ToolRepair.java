package com.kwpugh.emerald_tools.recipes;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.init.RecipeInit;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.*;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
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

    protected MatchResult matchResult(CraftingInventory inventory)
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
                    selectRepairValues(toolItem);

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

                return MatchResult.EMPTY;
            }
        }

        return new MatchResult(toolStack, materialStack);
    }

    public void selectRepairValues(ToolItem toolItem)
    {
        if(toolItem.getMaterial() == ToolMaterials.STONE)
        {
            repairItem = Items.COBBLESTONE;
            damageAmount = EmeraldTools.CONFIG.GENERAL.stoneRepairAmount;
        }
        if(toolItem.getMaterial() == ToolMaterials.GOLD)
        {
            repairItem = Items.RAW_GOLD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.goldRepairAmount;
        }
        if(toolItem.getMaterial() == ToolMaterials.IRON)
        {
            repairItem = Items.RAW_IRON;
            damageAmount = EmeraldTools.CONFIG.GENERAL.ironRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.COPPER_TOOL_MATERIAL)
        {
            repairItem = Items.RAW_COPPER;
            damageAmount = EmeraldTools.CONFIG.GENERAL.copperRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.STEEL_TOOL_MATERIAL)
        {
            repairItem = ItemInit.STEEL_INGOT;
            damageAmount = EmeraldTools.CONFIG.GENERAL.steelRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.OBSIDIAN_TOOL_MATERIAL)
        {
            repairItem = Items.OBSIDIAN;
            damageAmount = EmeraldTools.CONFIG.GENERAL.obsidianRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.EMERALD_TOOL_MATERIAL)
        {
            repairItem = Items.EMERALD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.emeraldRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.AMETHYST_TOOL_MATERIAL)
        {
            repairItem = Items.AMETHYST_SHARD;
            damageAmount = EmeraldTools.CONFIG.GENERAL.amethystRepairAmount;
        }
        if(toolItem.getMaterial() == ItemInit.RUBY_TOOL_MATERIAL)
        {
            repairItem = ItemInit.RUBY;
            damageAmount = EmeraldTools.CONFIG.GENERAL.rubyRepairAmount;
        }
    }

    private record MatchResult(ItemStack toolStack, ItemStack materialStack)
    {
        public static final MatchResult EMPTY = new MatchResult(ItemStack.EMPTY, ItemStack.EMPTY);

        public ItemStack getToolStack()
        {
            return toolStack;
        }

        public boolean matches()
        {
            return !toolStack.isEmpty() && !materialStack.isEmpty();
        }
    }
}
