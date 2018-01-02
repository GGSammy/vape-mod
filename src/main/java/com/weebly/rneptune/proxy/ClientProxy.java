package com.weebly.rneptune.proxy;


import com.weebly.rneptune.items.ModItems;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	@Override
	public void init(FMLInitializationEvent e) {
		ModItems.registerRenders();
	}

	
	
	
}
