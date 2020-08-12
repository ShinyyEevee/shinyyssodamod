
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.PepsiModItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SodaModElements.ModElement.Tag
public class MtnDewItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:mtn_dew")
	public static final Item block = null;
	public MtnDewItem(SodaModElements instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(PepsiModItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(7).saturation(6f).setAlwaysEdible().build()));
			setRegistryName("mtn_dew");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}
	}
}
