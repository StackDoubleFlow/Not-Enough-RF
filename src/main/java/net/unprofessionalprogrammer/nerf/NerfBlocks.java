package net.unprofessionalprogrammer.nerf;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class NerfBlocks {
	
	public static void registerBlocks(IForgeRegistry<Block> registry) {
		
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
	}
	
	public static Block init(Block block, String name) {
		return block.setUnlocalizedName(name).setRegistryName(name);
	}

}
