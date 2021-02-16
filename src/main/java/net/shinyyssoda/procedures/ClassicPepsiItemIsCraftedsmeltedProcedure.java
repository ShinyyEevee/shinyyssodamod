package net.shinyyssoda.procedures;

import net.shinyyssoda.SodaModElements;
import net.shinyyssoda.SodaMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SodaModElements.ModElement.Tag
public class ClassicPepsiItemIsCraftedsmeltedProcedure extends SodaModElements.ModElement {
	public ClassicPepsiItemIsCraftedsmeltedProcedure(SodaModElements instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SodaMod.LOGGER.warn("Failed to load dependency entity for procedure ClassicPepsiItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
