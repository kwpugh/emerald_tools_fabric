package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.client.ArrowRenderer;
import com.kwpugh.emerald_tools.client.BowModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EmeraldToolsClient implements ClientModInitializer 
{
	@Override
	public void onInitializeClient()
	{
		BowModelPredicates.register();
		ArrowRenderer.register();
	}
}