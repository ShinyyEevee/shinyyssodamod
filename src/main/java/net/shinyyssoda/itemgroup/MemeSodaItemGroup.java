
package net.shinyyssoda.itemgroup;

import net.shinyyssoda.item.GrassSodaItem;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SodaModElements.ModElement.Tag
public class MemeSodaItemGroup extends SodaModElements.ModElement {
	public MemeSodaItemGroup(SodaModElements instance) {
		super(instance, 119);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmeme_soda") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrassSodaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
