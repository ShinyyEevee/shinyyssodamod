package net.shinyyssoda.procedures;

import net.shinyyssoda.SodaModElements;
import net.shinyyssoda.SodaMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SodaModElements.ModElement.Tag
public class ValentinesSodaFoodEatenProcedure extends SodaModElements.ModElement {
	public ValentinesSodaFoodEatenProcedure(SodaModElements instance) {
		super(instance, 207);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SodaMod.LOGGER.warn("Failed to load dependency entity for procedure ValentinesSodaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 60, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 9000, (int) 2, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 1000, (int) 4, (false), (false)));
	}
}
