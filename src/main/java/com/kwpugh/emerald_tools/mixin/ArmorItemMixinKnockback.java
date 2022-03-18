package com.kwpugh.emerald_tools.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.kwpugh.emerald_tools.init.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

/*
    Needed to allow armor materials
    to access knockback resistance
 */

@Mixin(ArmorItem.class)
public abstract class ArmorItemMixinKnockback
{
    @Shadow @Final private static UUID[] MODIFIERS;
    @Shadow @Final @Mutable private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    @Shadow @Final protected float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void emeraldToolsConstructor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings, CallbackInfo ci)
    {
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];

        if (material == ItemInit.EMERALD_ARMOR_MATERIAL ||
                material == ItemInit.RUBY_ARMOR_MATERIAL ||
                material == ItemInit.STEEL_ARMOR_MATERIAL ||
                material == ItemInit.OBSIDIAN_ARMOR_MATERIAL ||
                material == ItemInit.COPPER_ARMOR_MATERIAL ||
                material == ItemInit.AMETHYST_ARMOR_MATERIAL)
        {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                    new EntityAttributeModifier(uUID,
                            "Armor knockback resistance",
                            this.knockbackResistance,
                            EntityAttributeModifier.Operation.ADDITION
                    )
            );

            this.attributeModifiers = builder.build();
        }
    }
}