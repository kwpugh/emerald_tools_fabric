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

import java.util.ArrayList;
import java.util.List;

public class ToolRepair extends SpecialCraftingRecipe
{
    private final List<Item> repairItemList = new ArrayList<>();
    private int damageAmount;

    public ToolRepair(Identifier identifier)
    {
        super(identifier);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world)
    {
        return matchStack(inventory).matches();
    }

    @Override
    public ItemStack craft(CraftingInventory inventory)
    {
        if(EmeraldTools.CONFIG.GENERAL.enableGridCrafting)
        {
            MatchStack matchStack = matchStack(inventory);

            if (matchStack.matches())
            {
                ItemStack toolStack = matchStack.getToolStack();
                ItemStack craftStack = toolStack.copy();
                int damage = Math.max(craftStack.getDamage() - damageAmount, 0);
                craftStack.setDamage(damage);

                return craftStack;
            }
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

    private MatchStack matchStack(CraftingInventory inventory)
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
                        return MatchStack.EMPTY;
                    }

                    toolStack = stackToTest;
                    continue;
                }
                else if(repairItemList.contains(itemToTest))
                {
                    if(!materialStack.isEmpty())
                    {
                        return MatchStack.EMPTY;
                    }

                    materialStack = stackToTest;
                    continue;
                }

                return MatchStack.EMPTY;
            }
        }

        return new MatchStack(toolStack, materialStack);
    }

    private void setRepairValues(ToolItem toolItem)
    {
        repairItemList.clear();

        if(toolItem.getMaterial() == ToolMaterials.WOOD)
        {
            repairItemList.add(Items.OAK_PLANKS);
            repairItemList.add(Items.ACACIA_PLANKS);
            repairItemList.add(Items.BIRCH_PLANKS);
            repairItemList.add(Items.DARK_OAK_PLANKS);
            repairItemList.add(Items.JUNGLE_PLANKS);
            repairItemList.add(Items.SPRUCE_PLANKS);
            repairItemList.add(Items.CRIMSON_PLANKS);
            repairItemList.add(Items.WARPED_PLANKS);
            damageAmount = EmeraldTools.CONFIG.GENERAL.woodenRepairAmount;
        }
        else if(toolItem.getMaterial() == ToolMaterials.STONE)
        {
            repairItemList.add(Items.COBBLESTONE);
            repairItemList.add(Items.COBBLED_DEEPSLATE);
            repairItemList.add(Items.TUFF);
            repairItemList.add(Items.ANDESITE);
            repairItemList.add(Items.DIORITE);
            repairItemList.add(Items.GRANITE);
            repairItemList.add(Items.BLACKSTONE);
            repairItemList.add(Items.BASALT);
            damageAmount = EmeraldTools.CONFIG.GENERAL.stoneRepairAmount;
        }
        else if(toolItem.getMaterial() == ToolMaterials.GOLD)
        {
            repairItemList.add(Items.RAW_GOLD);
            repairItemList.add(Items.GOLD_INGOT);
            damageAmount = EmeraldTools.CONFIG.GENERAL.goldRepairAmount;
        }
        else if(toolItem.getMaterial() == ToolMaterials.IRON)
        {
            repairItemList.add(Items.RAW_IRON);
            repairItemList.add(Items.IRON_INGOT);
            damageAmount = EmeraldTools.CONFIG.GENERAL.ironRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.COPPER_TOOL_MATERIAL)
        {
            repairItemList.add(Items.RAW_COPPER);
            repairItemList.add(Items.COPPER_INGOT);
            damageAmount = EmeraldTools.CONFIG.GENERAL.copperRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.STEEL_TOOL_MATERIAL)
        {
            repairItemList.add(ItemInit.STEEL_INGOT);
            damageAmount = EmeraldTools.CONFIG.GENERAL.steelRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.OBSIDIAN_TOOL_MATERIAL)
        {
            repairItemList.add(Items.OBSIDIAN);
            repairItemList.add(Items.CRYING_OBSIDIAN);
            damageAmount = EmeraldTools.CONFIG.GENERAL.obsidianRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.EMERALD_TOOL_MATERIAL)
        {
            repairItemList.add(Items.EMERALD);
            damageAmount = EmeraldTools.CONFIG.GENERAL.emeraldRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.AMETHYST_TOOL_MATERIAL)
        {
            repairItemList.add(Items.AMETHYST_SHARD);
            damageAmount = EmeraldTools.CONFIG.GENERAL.amethystRepairAmount;
        }
        else if(toolItem.getMaterial() == ItemInit.RUBY_TOOL_MATERIAL)
        {
            repairItemList.add(ItemInit.RUBY);
            damageAmount = EmeraldTools.CONFIG.GENERAL.rubyRepairAmount;
        }
    }

    private record MatchStack(ItemStack toolStack, ItemStack materialStack)
    {
        private static final MatchStack EMPTY = new MatchStack(ItemStack.EMPTY, ItemStack.EMPTY);

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
