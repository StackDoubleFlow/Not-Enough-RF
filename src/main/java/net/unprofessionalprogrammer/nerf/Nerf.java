package net.unprofessionalprogrammer.nerf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.unprofessionalprogrammer.nerf.block.NerfBlock;
import net.unprofessionalprogrammer.nerf.items.NerfItem;
import net.unprofessionalprogrammer.nerf.proxy.CommonProxy;

/**
 * Not Enough RF - A Minecraft mod
 * @author Ojas L.
 *
 */

@Mod(modid = "nerf", name = "Not Enough RF")
@EventBusSubscriber
public class Nerf {
	
	/**Nerf logger instance */
	public static Logger logger = LogManager.getLogger("Nrf");
	
	/** Nerf mod instance */
	@Instance("nerf")
	public static Nerf instance;
	
	/** Nerf creative tab */
	public static CreativeTabs creativeTab = new CreativeTabNerf();
	
	/**Nerf proxy instance */
	@SidedProxy(serverSide = "net.unprofessionalprogrammer.nerf.proxy.CommonProxy", clientSide = "net.unprofessionalprogrammer.nerf.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		// Register blocks and tile entities
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		// Register items and itemBlocks
		NerfItems.registerItems(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		// Register models
		registerItemModel(NerfItems.nerfMaterials);
	}
	
	public static void registerItemModel(NerfItem item) {
		//Register each sub-type models
		NonNullList<ItemStack> list = NonNullList.create();
		item.getSubItems(null, list);
		for(ItemStack stack : list) {
			ModelLoader.setCustomModelResourceLocation(item, stack.getMetadata(), new ModelResourceLocation(stack.getItem().getRegistryName(), "inventory"));
			logger.info(item.getRegistryName());
		}
	}
	
	public static void registerBlockModel(NerfBlock block) {
		
	}
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		logger.info("Hello World");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
	
}
