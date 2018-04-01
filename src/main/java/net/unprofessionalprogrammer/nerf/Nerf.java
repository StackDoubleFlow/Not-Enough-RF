package net.unprofessionalprogrammer.nerf;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.unprofessionalprogrammer.nerf.proxy.CommonProxy;

@Mod(modid = Nerf.modId, name = Nerf.name, version = Nerf.version)
public class Nerf {
	
	public static final String modId = "nerf";
	public static final String name = "Not Enough RF";
	public static final String version = "1.0.0";
	
	@Instance(modId)
	public static Nerf instance;
	
	@SidedProxy(serverSide = "net.unprofessionalprogrammer.nerf.proxy.CommonProxy", clientSide = "net.unprofessionalprogrammer.nerf.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
	
}
