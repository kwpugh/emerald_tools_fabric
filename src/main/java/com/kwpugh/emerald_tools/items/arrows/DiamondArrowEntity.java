package com.kwpugh.emerald_tools.items.arrows;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.init.EntityInit;
import com.kwpugh.emerald_tools.init.ItemInit;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class DiamondArrowEntity extends PersistentProjectileEntity
{
    private int duration = 300;
    private AreaEffectCloudEntity cloud;

    public DiamondArrowEntity(EntityType<? extends DiamondArrowEntity> entityType, World world)
    {
        super(entityType, world);
    }

    public DiamondArrowEntity(World world, LivingEntity owner)
    {
        super(EntityInit.DIAMOND_ARROW, owner, world);
    }

    public void tick()
    {
        super.tick();

        if (this.world.isClient && !this.inGround)
        {
            this.world.addParticle(ParticleTypes.INSTANT_EFFECT, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
        }
    }

    protected ItemStack asItemStack()
    {
        return new ItemStack(ItemInit.DIAMOND_ARROW);
    }

    protected void onHit(LivingEntity target)
    {
        super.onHit(target);

        this.setPierceLevel((byte) (this.getPierceLevel() + EmeraldTools.CONFIG.GENERAL.diamondPierceLevel));
        this.setPunch(this.getPunch() + EmeraldTools.CONFIG.GENERAL.diamondPunchLevel);
        target.damage(DamageSource.IN_FIRE, EmeraldTools.CONFIG.GENERAL.diamondExtraDamage);
    }

    public void readCustomDataFromNbt(NbtCompound nbt)
    {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("Duration"))
        {
            this.duration = nbt.getInt("Duration");
        }
    }

    public void writeCustomDataToNbt(NbtCompound nbt)
    {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Duration", this.duration);
    }
}
