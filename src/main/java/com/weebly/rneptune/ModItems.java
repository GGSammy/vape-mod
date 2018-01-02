package com.weebly.rneptune;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModItems {
	
	public static Item vape;
	
	public static void init() {
		vape = new ItemVape("vape");
	}
	
	
	public static void register() {
		register(vape);
	}
	
	public static void registerRenders() {
		registerRender(vape);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static <K extends IForgeRegistryEntry<K>> K register(K object) {
    
        return (K)GameData.register_impl(object);
    }
}
