package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.items.arrows.AmethystArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.RubyArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class AmethystArrowEntityRenderer extends ProjectileEntityRenderer<AmethystArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("emerald_tools:textures/entity/amethyst_arrow.png");

    public AmethystArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(AmethystArrowEntity entity)
    {
        return TEXTURE;
    }
}
