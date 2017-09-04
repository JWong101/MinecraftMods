package common;

import common.blocks.BlockContainer;
import common.blocks.SpawningBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public abstract class CommonProxy implements Initializer{

	public void preInit(FMLPreInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new SpawningBlock());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> item) {
		item.getRegistry().register(new ItemBlock(BlockContainer.SPAWNING_BLOCK).setRegistryName(BlockContainer.SPAWNING_BLOCK.getRegistryName()));
	}


	

}
