package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.recipes.*;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RecipeInit
{
    public static SpecialRecipeSerializer<CopperRepair> COPPER_REPAIR = new SpecialRecipeSerializer<>(CopperRepair::new);
    public static SpecialRecipeSerializer<AmethystRepair> AMETHYST_REPAIR = new SpecialRecipeSerializer<>(AmethystRepair::new);
    public static SpecialRecipeSerializer<EmeraldRepair> EMERALD_REPAIR = new SpecialRecipeSerializer<>(EmeraldRepair::new);
    public static SpecialRecipeSerializer<RubyRepair> RUBY_REPAIR = new SpecialRecipeSerializer<>(RubyRepair::new);
    public static SpecialRecipeSerializer<ObsidianRepair> OBSIDIAN_REPAIR = new SpecialRecipeSerializer<>(ObsidianRepair::new);
    public static SpecialRecipeSerializer<SteelRepair> STEEL_REPAIR = new SpecialRecipeSerializer<>(SteelRepair::new);

    public static void registerRecipes()
    {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "copper_repair"), COPPER_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "amethyst_repair"), AMETHYST_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "emerald_repair"), EMERALD_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "ruby_repair"), RUBY_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "obsidian_repair"), OBSIDIAN_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "steel_repair"), STEEL_REPAIR);
    }
}
