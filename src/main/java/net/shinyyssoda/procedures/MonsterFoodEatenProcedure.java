package net.shinyyssoda.procedures;

import net.shinyyssoda.SodaModElements;
import net.shinyyssoda.SodaMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SodaModElements.ModElement.Tag
public class MonsterFoodEatenProcedure extends SodaModElements.ModElement {
	public MonsterFoodEatenProcedure(SodaModElements instance) {
		super(instance, 159);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SodaMod.LOGGER.warn("Failed to load dependency entity for procedure MonsterFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 600, (int) 2, (false), (false)));
	}
}
