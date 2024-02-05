package me.ryleu.trueinfinity.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings("unused")
@Mixin(InfinityEnchantment.class)
public abstract class InfinityEnchantmentMixin extends Enchantment{
	public InfinityEnchantmentMixin(Rarity weight, EquipmentSlot... slotTypes) {
		super(weight, EnchantmentTarget.BOW, slotTypes);
	}

	@Override()
	public boolean canAccept(Enchantment other) {
		return super.canAccept(other);
	}
}
