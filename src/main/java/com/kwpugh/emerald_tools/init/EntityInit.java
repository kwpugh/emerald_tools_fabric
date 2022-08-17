package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.arrows.AmethystArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.DiamondArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.EmeraldArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.RubyArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public class EntityInit
{
    public static EntityType<EmeraldArrowEntity> EMERALD_ARROW;
    public static EntityType<RubyArrowEntity> RUBY_ARROW;
    public static EntityType<AmethystArrowEntity> AMETHYST_ARROW;
    public static EntityType<DiamondArrowEntity> DIAMOND_ARROW;

    public static void registerEntities()
    {
        EMERALD_ARROW = register("emerald_arrow", createArrowEntityType(EmeraldArrowEntity::new));
        RUBY_ARROW = register("ruby_arrow", createArrowEntityType(RubyArrowEntity::new));
        AMETHYST_ARROW = register("amethyst_arrow", createArrowEntityType(AmethystArrowEntity::new));
        DIAMOND_ARROW = register("diamond_arrow", createArrowEntityType(DiamondArrowEntity::new));
    }

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> entityType)
    {
        return Registry.register(Registry.ENTITY_TYPE, EmeraldTools.MOD_ID + ":" + s, entityType);
    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory)
    {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }
}