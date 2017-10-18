package com.ferreusveritas.dynamictrees.proxy;

import net.minecraftforge.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CCProxyBase {

	public static final String CCModId = "ComputerCraft";
	
	public static boolean hasComputerCraft() {
		return Loader.isModLoaded(CCModId) || Loader.isModLoaded(CCModId.toLowerCase());
	}
	
	public CCProxyBase() {}
	
	public void createBlocks() {}
	
	public void createItems() {}
	
	public void registerBlocks(IForgeRegistry<Block> registry) {}
	
	public void registerItems(IForgeRegistry<Item> registry) {}
}