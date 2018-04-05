package net.unprofessionalprogrammer.nerf;

import javax.annotation.Nonnull;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.unprofessionalprogrammer.nerf.items.NerfMaterial;

public class NerfItems {
	
	@Nonnull
	public static NerfMaterial nerfMaterials = new NerfMaterial();
	
	public static void registerItems(IForgeRegistry<Item> registry) {
		registry.register(nerfMaterials);
	}
	
	
}
