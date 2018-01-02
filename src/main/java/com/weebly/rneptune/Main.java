package com.weebly.rneptune;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main {
	

	public static enum VapeItems {
		VAPE("vape", "itemvape");

		private String unlocalizedName;
		private String registryName;

		VapeItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}

	}

	@SidedProxy(clientSide = "com.weebly.rneptune.ClientProxy", serverSide = "com.weebly.rneptune.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static Main instance = new Main();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);

		ModItems.init();
		ModItems.register();

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		System.out.println();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}

}