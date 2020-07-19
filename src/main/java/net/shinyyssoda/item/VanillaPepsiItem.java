
package net.shinyyssoda.item;

import net.shinyyssoda.procedures.VanillaPepsiItemIsCraftedsmeltedProcedure;
import net.shinyyssoda.itemgroup.PepsiModItemGroup;
import net.shinyyssoda.SodaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@SodaModElements.ModElement.Tag
public class VanillaPepsiItem extends SodaModElements.ModElement {
	@ObjectHolder("soda:vanillapepsi")
	public static final Item block = null;
	public VanillaPepsiItem(SodaModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(PepsiModItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(7).saturation(6f).setAlwaysEdible().build()));
			setRegistryName("vanillapepsi");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Vanilla Flavored Pepsi"));
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				VanillaPepsiItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
