package com.kwpugh.emerald_tools.items;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.pugh_tools.Tools.Bow;

public class ModBow extends Bow
{
	public static float speed = EmeraldTools.CONFIG.GENERAL.projectileSpeed;
	public static float roll = EmeraldTools.CONFIG.GENERAL.projectileRoll;
	public static float divergence = EmeraldTools.CONFIG.GENERAL.projectileDivergence;
	public static double extraDamage = EmeraldTools.CONFIG.GENERAL.projectileExtraDamage;
	public static double powerBonus = EmeraldTools.CONFIG.GENERAL.projectilePowerDamageBonus;
	public static float zoomMultiplier = EmeraldTools.CONFIG.GENERAL.bowZoomMultiplier;
	public static int flameBurnSecond = EmeraldTools.CONFIG.GENERAL.projectileFlameBurnSeconds;
	public static int dropRange = EmeraldTools.CONFIG.GENERAL.projectileDropRange;

	public ModBow(Settings settings)
	{
		super(speed, roll, divergence, extraDamage, powerBonus, zoomMultiplier, flameBurnSecond, dropRange, settings);
	}
}