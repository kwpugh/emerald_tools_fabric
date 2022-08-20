package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.items.arrows.AmethystArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.DiamondArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.EmeraldArrowEntity;
import com.kwpugh.emerald_tools.items.arrows.RubyArrowEntity;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class DispenserBehaviorInit
{
    public static void registerBehaviors()
    {
        DispenserBlock.registerBehavior(ItemInit.DIAMOND_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new DiamondArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.EMERALD_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new EmeraldArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.RUBY_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new RubyArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

        DispenserBlock.registerBehavior(ItemInit.AMETHYST_ARROW, new ProjectileDispenserBehavior()
        {
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack)
            {
                PersistentProjectileEntity persistentProjectileEntity = new AmethystArrowEntity(world, position.getX(), position.getY(), position.getZ());
                persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                return persistentProjectileEntity;
            }
        });

    }
}
