package com.kwpugh.emerald_tools.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "emerald_tools")
public class EmeraldToolsConfig extends PartitioningSerializer.GlobalData
{
    public General GENERAL = new General();

    @Config(name = "general")
	public static class General implements ConfigData
	{
		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nBow Zoom Multiplier"
				+"\n- vanilla bow value = .15F"
				+"\n- pretty good value = .45F"
				+"\n- awesome value = .75F"
				+"\n******************************")
		public float bowZoomMultiplier = .45F;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nGlobal Gem Bow Settings"
				+"\n******************************")
		public float projectileSpeed = 6.0F;
		public double projectileDamageFactorFirst = 0.20D;
		public double projectileDamageFactorSecond = 0.5D;
		public float projectileDivergence = 0.0F;


		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nCrafting Grid Repair"
				+"\n- repair amount per item"
				+"\n******************************")
		public boolean enableGridCrafting = true;
		public int woodenRepairAmount = 20;
		public int stoneRepairAmount = 40;
		public int goldRepairAmount = 32;
		public int ironRepairAmount = 60;
		public int diamondRepairAmount = 160;
		public int netheriteRepairAmount = 190;
		public int copperRepairAmount = 60;
		public int steelRepairAmount = 90;
		public int obsidianRepairAmount = 130;
		public int emeraldRepairAmount = 160;
		public int amethystRepairAmount = 180;
		public int rubyRepairAmount = 180;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nAMETHYST TOOL MATERIAL"
    			+"\n******************************")
    	public int amethystDurability = 840;
       	public float amethystMiningSpeed = 8.0F;
       	public float amethystAttackDamage = 1.5F;
       	public int amethystMiningLevel = 3;
       	public int amethystEnchantability = 25;
       	public boolean amethystEnableSilkTouch = true;
       	public boolean amethystEnableInfinity = true;
       	public boolean amethystEnableUnbreakable = true;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nAMETHYST ARMOR MATERIAL"
    			+"\n******************************")
    	public int amethystDurabilityMultiplier = 29;
      	public int amethystArmorEnchantability = 10;
      	public float amethystToughness = 2.0F;
      	public float amethystKnockbackResistance = 0.5F;
		public int amethystHeadProtection = 3;
		public int amethystChestProtection = 8;
		public int amethystLeggingsProtection = 6;
		public int amethystBootsProtection = 3;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nCOPPER TOOL MATERIAL"
    			+"\n******************************")
    	public int copperDurability = 250;
       	public float copperMiningSpeed = 5.5F;
       	public float copperAttackDamage = 1.5F;
       	public int copperMiningLevel = 2;
       	public int copperEnchantability = 18;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nCOPPER ARMOR MATERIAL"
    			+"\n******************************")
    	public int copperDurabilityMultiplier = 24;
      	public int copperArmorEnchantability = 4;
      	public float copperToughness = 1.0F;
      	public float copperKnockbackResistance = 0.5F;
		public int copperHeadProtection = 2;
		public int copperChestProtection = 6;
		public int copperLeggingsProtection = 5;
		public int copperBootsProtection = 2;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nEMERALD TOOL MATERIAL"
    			+"\n******************************")
    	public int emeraldDurability = 725;
       	public float emeraldtMiningSpeed = 8.0F;
       	public float emeraldAttackDamage = 3.0F;
       	public int emeraldMiningLevel = 3;
       	public int emeraldEnchantability = 10;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nEMERALD ARMOR MATERIAL"
    			+"\n******************************")
    	public int emeraldDurabilityMultiplier = 26;
      	public int emeraldArmorEnchantability = 12;
      	public float emeraldToughness = 2.0F;
      	public float emeraldKnockbackResistance = 0.0F;
		public int emeraldHeadProtection = 3;
		public int emeraldChestProtection = 8;
		public int emeraldLeggingsProtection = 6;
		public int emeraldBootsProtection = 3;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY TOOL MATERIAL"
    			+"\n******************************")
    	public int rubyDurability = 960;
       	public float rubyMiningSpeed = 8.0F;
       	public float rubyAttackDamage = 3.0F;
       	public int rubyMiningLevel = 3;
       	public int rubyEnchantability = 10;
       	public boolean rubySpecial = true;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY ARMOR MATERIAL"
    			+"\n******************************")
    	public int rubyDurabilityMultiplier = 29;
      	public int rubyArmorEnchantability = 12;
      	public float rubyToughness = 2.0F;
      	public float rubyKnockbackResistance = 0.0F;
		public int rubyHeadProtection = 3;
		public int rubyChestProtection = 8;
		public int rubyLeggingsProtection = 6;
		public int rubyBootsProtection = 3;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nSTEEL TOOL MATERIAL"
    			+"\n******************************")
    	public int steelDurability = 512;
       	public float steelMiningSpeed = 7.0F;
       	public float steelAttackDamage = 2.0F;
       	public int steelMiningLevel = 2;
       	public int steelEnchantability = 9;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nSTEEL ARMOR MATERIAL"
    			+"\n******************************")
    	public int steelDurabilityMultiplier = 21;
      	public int steelArmorEnchantability = 9;
      	public float steelToughness = 1.0F;
      	public float steelKnockbackResistance = 0.5F;
		public int steelHeadProtection = 2;
		public int steelChestProtection = 6;
		public int steelLeggingsProtection = 5;
		public int steelBootsProtection = 2;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nOBSIDIAN TOOL MATERIAL"
    			+"\n******************************")
    	public int obsidianDurability = 650;
       	public float obsidianMiningSpeed = 5.5F;
       	public float obsidianAttackDamage = 1.5F;
       	public int obsidianMiningLevel = 3;
       	public int obsidianEnchantability = 4;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nOBSIDIAN ARMOR MATERIAL"
    			+"\n******************************")
    	public int obsidianDurabilityMultiplier = 24;
      	public int obsidianArmorEnchantability = 4;
      	public float obsidianToughness = 1.0F;
      	public float obsidianKnockbackResistance = 0.5F;
		public int obsidianHeadProtection = 2;
		public int obsidianChestProtection = 6;
		public int obsidianLeggingsProtection = 5;
		public int obsidianBootsProtection = 2;

       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY STEEL SWORD MATERIAL"
    			+"\n******************************")
    	public int rubySteelDurability = 1102;
       	public float rubySteelMiningSpeed = 8.0F;
       	public float rubySteelAttackDamage = 3.0F;
       	public int rubySteelMiningLevel = 3;
       	public int rubySteelEnchantability = 12;
	}
}