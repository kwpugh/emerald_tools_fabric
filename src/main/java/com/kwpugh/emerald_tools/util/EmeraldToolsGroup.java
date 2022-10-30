package com.kwpugh.emerald_tools.util;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.BlockInit;
import com.kwpugh.emerald_tools.init.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;

public class EmeraldToolsGroup
{
    public static void addGroup()
    {
        // force class run when we want
    }

    public static final ItemGroup EMERALD_TOOLS_GROUP = new FabricItemGroup(new Identifier(EmeraldTools.MOD_ID, "emerald_tools_group"))
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.EMERALD);
        }

        @Override
        protected void addItems(FeatureSet enabledFeatures, Entries entries)
        {
            entries.add(BlockInit.RUBY_BLOCK);
            entries.add(BlockInit.STEEL_BLOCK);

            entries.add(ItemInit.EMERALD_SWORD);
            entries.add(ItemInit.EMERALD_PICKAXE);
            entries.add(ItemInit.EMERALD_AXE);
            entries.add(ItemInit.EMERALD_SHOVEL);
            entries.add(ItemInit.EMERALD_HOE);
            entries.add(ItemInit.EMERALD_HELMET);
            entries.add(ItemInit.EMERALD_CHESTPLATE);
            entries.add(ItemInit.EMERALD_LEGGINGS);
            entries.add(ItemInit.EMERALD_BOOTS);

            entries.add(ItemInit.RUBY);
            entries.add(ItemInit.RUBY_SWORD);
            entries.add(ItemInit.RUBY_STEEL_SWORD);
            entries.add(ItemInit.RUBY_PICKAXE);
            entries.add(ItemInit.RUBY_AXE);
            entries.add(ItemInit.RUBY_SHOVEL);
            entries.add(ItemInit.RUBY_HOE);
            entries.add(ItemInit.RUBY_HELMET);
            entries.add(ItemInit.RUBY_CHESTPLATE);
            entries.add(ItemInit.RUBY_LEGGINGS);
            entries.add(ItemInit.RUBY_BOOTS);

            entries.add(ItemInit.AMETHYST_SWORD);
            entries.add(ItemInit.AMETHYST_PICKAXE);
            entries.add(ItemInit.AMETHYST_AXE);
            entries.add(ItemInit.AMETHYST_SHOVEL);
            entries.add(ItemInit.AMETHYST_HOE);
            entries.add(ItemInit.AMETHYST_HELMET);
            entries.add(ItemInit.AMETHYST_CHESTPLATE);
            entries.add(ItemInit.AMETHYST_LEGGINGS);
            entries.add(ItemInit.AMETHYST_BOOTS);

            entries.add(ItemInit.STEEL_INGOT);
            entries.add(ItemInit.STEEL_SWORD);
            entries.add(ItemInit.STEEL_PICKAXE);
            entries.add(ItemInit.STEEL_AXE);
            entries.add(ItemInit.STEEL_SHOVEL);
            entries.add(ItemInit.STEEL_HOE);
            entries.add(ItemInit.STEEL_HELMET);
            entries.add(ItemInit.STEEL_CHESTPLATE);
            entries.add(ItemInit.STEEL_LEGGINGS);
            entries.add(ItemInit.STEEL_BOOTS);

            entries.add(ItemInit.OBSIDIAN_SWORD);
            entries.add(ItemInit.OBSIDIAN_PICKAXE);
            entries.add(ItemInit.OBSIDIAN_AXE);
            entries.add(ItemInit.OBSIDIAN_SHOVEL);
            entries.add(ItemInit.OBSIDIAN_HOE);
            entries.add(ItemInit.OBSIDIAN_HELMET);
            entries.add(ItemInit.OBSIDIAN_CHESTPLATE);
            entries.add(ItemInit.OBSIDIAN_LEGGINGS);
            entries.add(ItemInit.OBSIDIAN_BOOTS);

            entries.add(ItemInit.COPPER_SWORD);
            entries.add(ItemInit.COPPER_PICKAXE);
            entries.add(ItemInit.COPPER_AXE);
            entries.add(ItemInit.COPPER_SHOVEL);
            entries.add(ItemInit.COPPER_HOE);
            entries.add(ItemInit.COPPER_HELMET);
            entries.add(ItemInit.COPPER_CHESTPLATE);
            entries.add(ItemInit.COPPER_LEGGINGS);
            entries.add(ItemInit.COPPER_BOOTS);

            entries.add(ItemInit.EMERALD_BOW);
            entries.add(ItemInit.RUBY_BOW);
            entries.add(ItemInit.AMETHYST_BOW);
            entries.add(ItemInit.STEEL_BOW);
            entries.add(ItemInit.OBSIDIAN_BOW);
            entries.add(ItemInit.COPPER_BOW);
            entries.add(ItemInit.GOLD_BOW);
            entries.add(ItemInit.IRON_BOW);
            entries.add(ItemInit.DIAMOND_BOW);
            entries.add(ItemInit.NETHERITE_BOW);

            entries.add(ItemInit.EMERALD_ARROW);
            entries.add(ItemInit.RUBY_ARROW);
            entries.add(ItemInit.AMETHYST_ARROW);
            entries.add(ItemInit.DIAMOND_ARROW);

            entries.add(ItemInit.EMERALD_EXCAVATOR);
            entries.add(ItemInit.RUBY_EXCAVATOR);
            entries.add(ItemInit.AMETHYST_EXCAVATOR);
            entries.add(ItemInit.STEEL_EXCAVATOR);
            entries.add(ItemInit.OBSIDIAN_EXCAVATOR);
            entries.add(ItemInit.COPPER_EXCAVATOR);
            entries.add(ItemInit.WOODEN_EXCAVATOR);
            entries.add(ItemInit.GOLD_EXCAVATOR);
            entries.add(ItemInit.IRON_EXCAVATOR);
            entries.add(ItemInit.DIAMOND_EXCAVATOR);
            entries.add(ItemInit.NETHERITE_EXCAVATOR);

            entries.add(ItemInit.EMERALD_HAMMER);
            entries.add(ItemInit.RUBY_HAMMER);
            entries.add(ItemInit.AMETHYST_HAMMER);
            entries.add(ItemInit.STEEL_HAMMER);
            entries.add(ItemInit.OBSIDIAN_HAMMER);
            entries.add(ItemInit.COPPER_HAMMER);
            entries.add(ItemInit.WOODEN_HAMMER);
            entries.add(ItemInit.GOLD_HAMMER);
            entries.add(ItemInit.IRON_HAMMER);
            entries.add(ItemInit.DIAMOND_HAMMER);
            entries.add(ItemInit.NETHERITE_HAMMER);

            entries.add(ItemInit.EMERALD_PAXEL);
            entries.add(ItemInit.RUBY_PAXEL);
            entries.add(ItemInit.AMETHYST_PAXEL);
            entries.add(ItemInit.STEEL_PAXEL);
            entries.add(ItemInit.OBSIDIAN_PAXEL);
            entries.add(ItemInit.COPPER_PAXEL);
            entries.add(ItemInit.WOODEN_PAXEL);
            entries.add(ItemInit.GOLD_PAXEL);
            entries.add(ItemInit.IRON_PAXEL);
            entries.add(ItemInit.DIAMOND_PAXEL);
            entries.add(ItemInit.NETHERITE_PAXEL);

            entries.add(ItemInit.EMERALD_TREEAXE);
            entries.add(ItemInit.RUBY_TREEAXE);
            entries.add(ItemInit.AMETHYST_TREEAXE);
            entries.add(ItemInit.STEEL_TREEAXE);
            entries.add(ItemInit.OBSIDIAN_TREEAXE);
            entries.add(ItemInit.COPPER_TREEAXE);
            entries.add(ItemInit.WOODEN_TREEAXE);
            entries.add(ItemInit.GOLD_TREEAXE);
            entries.add(ItemInit.IRON_TREEAXE);
            entries.add(ItemInit.DIAMOND_TREEAXE);
            entries.add(ItemInit.NETHERITE_TREEAXE);
        }
    };
}
