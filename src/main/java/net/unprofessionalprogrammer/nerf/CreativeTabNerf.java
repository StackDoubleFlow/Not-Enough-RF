package net.unprofessionalprogrammer.nerf;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabNerf extends CreativeTabs {
	
	public CreativeTabNerf() {
		super("tabNerf");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BREWING_STAND);
	}
	
}
