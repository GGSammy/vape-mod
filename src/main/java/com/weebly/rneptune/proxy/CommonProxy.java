
package com.weebly.rneptune.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {
	 	
	    public void preInit(FMLPreInitializationEvent e);

		public void init(FMLInitializationEvent e);

	   
}
