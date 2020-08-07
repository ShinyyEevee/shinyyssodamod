package net.shinyyssoda.procedures;

import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

@SodaModElements.ModElement.Tag
public class WolfSodaFoodEatenProcedure extends SodaModElements.ModElement {
	public WolfSodaFoodEatenProcedure(SodaModElements instance) {
		super(instance, 115);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WolfSodaFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WolfSodaFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WolfSodaFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WolfSodaFoodEaten!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.getWorld().isRemote) {
			world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.ambient")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			world.getWorld().playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.ambient")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
