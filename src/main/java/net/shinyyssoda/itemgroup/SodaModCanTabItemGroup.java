
package net.shinyyssoda.itemgroup;

import net.shinyyssoda.item.CanItem;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SodaModElements.ModElement.Tag
public class SodaModCanTabItemGroup extends SodaModElements.ModElement {
	public SodaModCanTabItemGroup(SodaModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsoda_mod_can_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CanItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
