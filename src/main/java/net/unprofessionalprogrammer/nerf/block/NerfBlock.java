package net.unprofessionalprogrammer.nerf.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NerfBlock extends Block {

	public NerfBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
