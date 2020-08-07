
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.MemeSodaItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@SodaModElements.ModElement.Tag
public class DirtSodaItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:dirt_soda")
	public static final Item block = null;
	public DirtSodaItem(SodaModElements instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MemeSodaItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(3f).setAlwaysEdible().build()));
			setRegistryName("dirt_soda");
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
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("MizuCosplayz is a meme"));
		}
	}
}
