package net.unprofessionalprogrammer.nerf.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class NerfMaterial extends NerfItem {
	
	enum NerfMaterials {
		SILICON("silicon");
		String name;
		NerfMaterials(String name) {
			this.name = name;
		}
		Item getItem() {
			return new NerfItem("silicon");
		}
	}
	
	public NerfMaterial() {
		super("nerfMaterial");
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	public int getIconFromDamage(int i) {
		return i;
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		items.add(new ItemStack(NerfMaterials.SILICON.getItem()));
	}
	
}
