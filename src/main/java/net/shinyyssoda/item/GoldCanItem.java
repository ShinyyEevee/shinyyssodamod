
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.SodaModCanTabItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SodaModElements.ModElement.Tag
public class GoldCanItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:gold_can")
	public static final Item block = null;
	public GoldCanItem(SodaModElements instance) {
		super(instance, 139);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SodaModCanTabItemGroup.tab).maxStackSize(64));
			setRegistryName("gold_can");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
