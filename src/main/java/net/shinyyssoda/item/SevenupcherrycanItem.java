
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.PepsiModItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SodaModElements.ModElement.Tag
public class SevenupcherrycanItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:sevenupcherrycan")
	public static final Item block = null;
	public SevenupcherrycanItem(SodaModElements instance) {
		super(instance, 156);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PepsiModItemGroup.tab).maxStackSize(64));
			setRegistryName("sevenupcherrycan");
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
