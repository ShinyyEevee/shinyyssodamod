
package net.shinyyssoda.item;

import net.shinyyssoda.procedures.PepsiItemIsCraftedsmeltedProcedure;
import net.shinyyssoda.itemgroup.PepsiModItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;
import java.util.HashMap;

@SodaModElements.ModElement.Tag
public class CocaColaItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:coca_cola")
	public static final Item block = null;
	public CocaColaItem(SodaModElements instance) {
		super(instance, 122);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(PepsiModItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(7).saturation(6f).setAlwaysEdible().build()));
			setRegistryName("coca_cola");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				PepsiItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
