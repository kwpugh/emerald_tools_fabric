package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.items.arrows.EmeraldArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EmeraldArrowEntityRenderer extends ProjectileEntityRenderer<EmeraldArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("emerald_tools:textures/entity/emerald_arrow.png");

    public EmeraldArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(EmeraldArrowEntity entity)
    {
        return TEXTURE;
    }
}
