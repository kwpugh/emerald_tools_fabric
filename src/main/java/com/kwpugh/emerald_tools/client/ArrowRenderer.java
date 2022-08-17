package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.init.EntityInit;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ArrowRenderer
{
    public static void register()
    {
        EntityRendererRegistry.register(EntityInit.EMERALD_ARROW, EmeraldArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.RUBY_ARROW, RubyArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.AMETHYST_ARROW, AmethystArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.DIAMOND_ARROW, DiamondArrowEntityRenderer::new);
    }
}