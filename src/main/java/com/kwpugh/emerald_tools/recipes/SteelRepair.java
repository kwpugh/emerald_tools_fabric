package com.kwpugh.emerald_tools.recipes;

import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.init.RecipeInit;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class SteelRepair extends SpecialCraftingRecipe
{
    public SteelRepair(Identifier identifier)
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
            ItemStack materialStack = matchResult.getMaterialStack();

            Item materialItem = materialStack.getItem();

            int damageRepair = 10;

            if (materialItem == ItemInit.STEEL_INGOT)
            {
                damageRepair = 30;
            }

            ItemStack craftStack = toolStack.copy();

            int damage = Math.max(craftStack.getDamage() - damageRepair, 0);

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
        return RecipeInit.STEEL_REPAIR;
    }

    protected MatchResult matchResult(CraftingInventory inventory)
    {
        ItemStack toolStack = ItemStack.EMPTY;
        ItemStack materialStack = ItemStack.EMPTY;

        for (int i = 0; i < inventory.size(); i++)
        {
            ItemStack stack = inventory.getStack(i);

            if (!stack.isEmpty())
            {
                Item item = stack.getItem();

                if(item instanceof ToolItem && ((ToolItem) item).getMaterial() == ItemInit.STEEL_TOOL_MATERIAL)
                {
                    if(!toolStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    toolStack = stack;
                    continue;
                }
                else if(item == ItemInit.STEEL_INGOT)
                {
                    if (!materialStack.isEmpty())
                    {
                        return MatchResult.EMPTY;
                    }

                    materialStack = stack;
                    continue;
                }

                return MatchResult.EMPTY;
            }
        }

        return new MatchResult(toolStack, materialStack);
    }

    private record MatchResult(ItemStack toolStack, ItemStack materialStack)
    {
        public static final MatchResult EMPTY = new MatchResult(ItemStack.EMPTY, ItemStack.EMPTY);

        public ItemStack getToolStack()
        {
            return toolStack;
        }

        public ItemStack getMaterialStack()
        {
            return materialStack;
        }

        public boolean matches()
        {
            return !toolStack.isEmpty() && !materialStack.isEmpty();
        }
    }
}
