package com.kwpugh.emerald_tools.materials;


import java.util.function.Supplier;

import com.kwpugh.emerald_tools.init.ModInit;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ModToolMaterials implements ToolMaterial
{
	STEEL(2, 512, 7.0F, 2.0F, 25, () -> {
		return Ingredient.ofItems(ModInit.STEEL_INGOT);
		}),
	   
	EMERALD(3, 725, 8.0F, 3.0F, 25, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),

	RUBY(3, 960, 8.0F, 3.0F, 25, () -> {
		return Ingredient.ofItems(ModInit.RUBY);
		});

   private final int miningLevel;
   private final int itemDurability;
   private final float miningSpeed;
   private final float attackDamage;
   private final int enchantability;
   private final Lazy<Ingredient> repairIngredient;

   private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantibility, Supplier<Ingredient> repairIngredient)
   {
      this.miningLevel = miningLevel;
      this.itemDurability = itemDurability;
      this.miningSpeed = miningSpeed;
      this.attackDamage = attackDamage;
      this.enchantability = enchantibility;
      this.repairIngredient = new Lazy(repairIngredient);
   }

   public int getDurability()
   {
      return this.itemDurability;
   }

   public float getMiningSpeedMultiplier()
   {
      return this.miningSpeed;
   }

   public float getAttackDamage()
   {
      return this.attackDamage;
   }

   public int getMiningLevel()
   {
      return this.miningLevel;
   }

   public int getEnchantability()
   {
      return this.enchantability;
   }

   public Ingredient getRepairIngredient()
   {
      return (Ingredient)this.repairIngredient.get();
   }
}
