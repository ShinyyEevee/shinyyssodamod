
package net.shinyyssoda.itemgroup;

import net.shinyyssoda.block.UnrefinedSteeloreBlock;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SodaModElements.ModElement.Tag
public class SodaModBlockTabItemGroup extends SodaModElements.ModElement {
	public SodaModBlockTabItemGroup(SodaModElements instance) {
		super(instance, 127);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsoda_mod_block_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UnrefinedSteeloreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
