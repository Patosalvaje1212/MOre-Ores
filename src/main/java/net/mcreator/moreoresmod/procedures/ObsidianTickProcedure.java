package net.mcreator.moreoresmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresmod.item.ObsidianArmorItem;
import net.mcreator.moreoresmod.MoreoresmodModElements;

import java.util.Map;

@MoreoresmodModElements.ModElement.Tag
public class ObsidianTickProcedure extends MoreoresmodModElements.ModElement {
	public ObsidianTickProcedure(MoreoresmodModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ObsidianTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ObsidianArmorItem.helmet, (int) (1)))
				: false)
				|| ((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ObsidianArmorItem.body, (int) (1)))
						: false))
				|| (((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ObsidianArmorItem.legs, (int) (1)))
						: false)
						|| ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(ObsidianArmorItem.boots, (int) (1)))
								: false)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 5, (int) 0, (false), (false)));
		}
	}
}
