package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.recipes.ToolRepair;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RecipeInit
{
    public static SpecialRecipeSerializer<ToolRepair> TOOL_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);

    public static void registerRecipes()
    {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "tool_repair"), TOOL_REPAIR);
    }
}
