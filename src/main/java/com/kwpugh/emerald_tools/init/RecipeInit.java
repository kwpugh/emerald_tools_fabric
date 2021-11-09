package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.recipes.*;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RecipeInit
{
    public static SpecialRecipeSerializer<ToolRepair> STONE_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> GOLD_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> IRON_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> COPPER_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> AMETHYST_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> EMERALD_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> RUBY_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> OBSIDIAN_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);
    public static SpecialRecipeSerializer<ToolRepair> STEEL_REPAIR = new SpecialRecipeSerializer<>(ToolRepair::new);

    public static void registerRecipes()
    {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "stone_repair"), STONE_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "gold_repair"), GOLD_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "iron_repair"), IRON_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "copper_repair"), COPPER_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "amethyst_repair"), AMETHYST_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "emerald_repair"), EMERALD_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "ruby_repair"), RUBY_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "obsidian_repair"), OBSIDIAN_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "steel_repair"), STEEL_REPAIR);
    }
}
