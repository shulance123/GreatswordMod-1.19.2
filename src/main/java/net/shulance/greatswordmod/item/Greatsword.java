package net.shulance.greatswordmod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.Vec3d;

public class Greatsword extends SwordItem {
    public Greatsword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Vec3d lookVec = attacker.getRotationVector();
        Vec3d attackVec = lookVec.multiply(5.00,5.00,5.00);
        Vec3d attackPos = attacker.getPos().add(attackVec);
        return super.postHit(stack, target, attacker);
    }
}
