package com.kwpugh.emerald_tools.client;

import com.kwpugh.emerald_tools.items.arrows.RubyArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class RubyArrowEntityRenderer extends ProjectileEntityRenderer<RubyArrowEntity>
{
    public static final Identifier TEXTURE = new Identifier("emerald_tools:textures/entity/ruby_arrow.png");

    public RubyArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(RubyArrowEntity entity)
    {
        return TEXTURE;
    }
}
