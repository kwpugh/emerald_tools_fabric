package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.init.ItemInit;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

/*
 * Needed to produce client side animation of bow pulling with arrow
 */

public class BowModelPredicates
{
    public static void register()
    {
        ModelPredicateProviderRegistry.register(ItemInit.EMERALD_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.EMERALD_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });



        ModelPredicateProviderRegistry.register(ItemInit.RUBY_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.RUBY_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });



        ModelPredicateProviderRegistry.register(ItemInit.OBSIDIAN_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.OBSIDIAN_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });



        ModelPredicateProviderRegistry.register(ItemInit.STEEL_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.STEEL_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.COPPER_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.COPPER_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.AMETHYST_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.AMETHYST_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.GOLD_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.GOLD_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.IRON_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.IRON_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.DIAMOND_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.DIAMOND_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });


        ModelPredicateProviderRegistry.register(ItemInit.NETHERITE_BOW, new Identifier("pull"), (stack, world, entity, i) ->
        {
            if (entity == null)
            {
                return 0.0F;
            }
            else
            {
                return entity.getActiveItem() != stack ? 0.0F
                        : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });

        ModelPredicateProviderRegistry.register(ItemInit.NETHERITE_BOW, new Identifier("pulling"),
                (stack, world, entity, i) ->
                {
                    return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
                });
    }
}
