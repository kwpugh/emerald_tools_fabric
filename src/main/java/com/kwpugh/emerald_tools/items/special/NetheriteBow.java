package com.kwpugh.emerald_tools.items.special;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.pugh_tools.Tools.Bow;

public class NetheriteBow extends Bow
{
	public static float speed = EmeraldTools.CONFIG.GENERAL.projectileSpeedNetherite;
	public static float roll = EmeraldTools.CONFIG.GENERAL.projectileRollNetherite;
	public static float divergence = EmeraldTools.CONFIG.GENERAL.projectileDivergenceNetherite;
	public static double extraDamage = EmeraldTools.CONFIG.GENERAL.projectileExtraDamageNetherite;
	public static double powerBonus = EmeraldTools.CONFIG.GENERAL.projectilePowerDamageBonusNetherite;
	public static float zoomMultiplier = EmeraldTools.CONFIG.GENERAL.bowZoomMultiplierNetherite;
	public static int flameBurnSecond = EmeraldTools.CONFIG.GENERAL.projectileFlameBurnSecondsNetherite;
	public static int dropRange = EmeraldTools.CONFIG.GENERAL.projectileDropRangeNetherite;

	public NetheriteBow(Settings settings)
	{
		super(speed, roll, divergence, extraDamage, powerBonus, zoomMultiplier, flameBurnSecond, dropRange, settings);
	}
}