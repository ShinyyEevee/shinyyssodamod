
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.MemeSodaItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SodaModElements.ModElement.Tag
public class GoldSodaItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:gold_soda")
	public static final Item block = null;
	public GoldSodaItem(SodaModElements instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MemeSodaItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(4).saturation(3f).setAlwaysEdible().build()));
			setRegistryName("gold_soda");
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
