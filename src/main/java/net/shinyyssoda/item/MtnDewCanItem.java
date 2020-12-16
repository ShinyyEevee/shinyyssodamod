
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.SodaModCanTabItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SodaModElements.ModElement.Tag
public class MtnDewCanItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:mtn_dew_can")
	public static final Item block = null;
	public MtnDewCanItem(SodaModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SodaModCanTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("mtn_dew_can");
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
