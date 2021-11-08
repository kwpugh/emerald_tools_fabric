package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.util.AmethystRepair;
import com.kwpugh.emerald_tools.util.CopperRepair;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RecipeInit
{
    // SAMPLES
    //   public static final SpecialRecipeSerializer<GlobeCraftingRecipe> GLOBE_CRAFTING = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MOD_ID, "globe_crafting"), new SpecialRecipeSerializer<>(GlobeCraftingRecipe::new));
    //   public static SpecialRecipeSerializer<EnderiteShulkerBoxRecipe> ENDERITE_SHULKER_BOX_RECIPE = new SpecialRecipeSerializer<>(EnderiteShulkerBoxRecipe::new);
    //   public static final RecipeSerializer<StackWrappingRecipe> STACK_WRAPPING_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MOD_ID, "stack_wrapping"), new SpecialRecipeSerializer<>(StackWrappingRecipe::new));

    public static SpecialRecipeSerializer<CopperRepair> COPPER_REPAIR = new SpecialRecipeSerializer<>(CopperRepair::new);
    public static SpecialRecipeSerializer<AmethystRepair> AMETHYST_REPAIR = new SpecialRecipeSerializer<>(AmethystRepair::new);

    public static void registerRecipes()
    {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "copper_repair"), COPPER_REPAIR);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(EmeraldTools.MOD_ID, "amethyst_repair"), AMETHYST_REPAIR);
    }
}
