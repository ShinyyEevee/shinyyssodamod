
package net.shinyyssoda.item;

import net.shinyyssoda.itemgroup.SodaModCanTabItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@SodaModElements.ModElement.Tag
public class PepsiCanPineappleItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:pepsi_can_pineapple")
	public static final Item block = null;
	public PepsiCanPineappleItem(SodaModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SodaModCanTabItemGroup.tab).maxStackSize(64));
			setRegistryName("pepsi_can_pineapple");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A pineapple Pepsi Can"));
		}
	}
}
