package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.items.arrows.DiamondArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.RubyArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class DiamondArrowEntityRenderer extends ProjectileEntityRenderer<DiamondArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("emerald_tools:textures/entity/diamond_arrow.png");

    public DiamondArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(DiamondArrowEntity entity)
    {
        return TEXTURE;
    }
}
