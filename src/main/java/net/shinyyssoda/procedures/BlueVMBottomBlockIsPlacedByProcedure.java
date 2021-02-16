package net.shinyyssoda.procedures;

import net.shinyyssoda.block.BlueVMTopBlock;
import net.shinyyssoda.SodaModElements;
import net.shinyyssoda.SodaMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

@SodaModElements.ModElement.Tag
public class BlueVMBottomBlockIsPlacedByProcedure extends SodaModElements.ModElement {
	public BlueVMBottomBlockIsPlacedByProcedure(SodaModElements instance) {
		super(instance, 203);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SodaMod.LOGGER.warn("Failed to load dependency x for procedure BlueVMBottomBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SodaMod.LOGGER.warn("Failed to load dependency y for procedure BlueVMBottomBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SodaMod.LOGGER.warn("Failed to load dependency z for procedure BlueVMBottomBlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SodaMod.LOGGER.warn("Failed to load dependency world for procedure BlueVMBottomBlockIsPlacedBy!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlueVMTopBlock.block.getDefaultState(), 3);
	}
}
