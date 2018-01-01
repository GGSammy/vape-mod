package com.weebly.rneptune;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemVape extends Item {
	public ItemVape() {
		setUnlocalizedName(Main.VapeItems.VAPE.getUnlocalizedName());
		setRegistryName(Main.VapeItems.VAPE.getRegistryName());
        this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
