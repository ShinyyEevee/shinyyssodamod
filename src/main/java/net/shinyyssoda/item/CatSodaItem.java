
package net.shinyyssoda.item;

import net.shinyyssoda.procedures.CatSodaFoodEatenProcedure;
import net.shinyyssoda.itemgroup.MemeSodaItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

@SodaModElements.ModElement.Tag
public class CatSodaItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:cat_soda")
	public static final Item block = null;
	public CatSodaItem(SodaModElements instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MemeSodaItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(4).saturation(3f).setAlwaysEdible().build()));
			setRegistryName("cat_soda");
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
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CatSodaFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
