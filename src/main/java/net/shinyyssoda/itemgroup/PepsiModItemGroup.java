
package net.shinyyssoda.itemgroup;

import net.shinyyssoda.item.PepsiCanItem;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SodaModElements.ModElement.Tag
public class PepsiModItemGroup extends SodaModElements.ModElement {
	public PepsiModItemGroup(SodaModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpepsimod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PepsiCanItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
