package com.weebly.rneptune.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemVape extends Item {
	public ItemVape(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
	}
}
