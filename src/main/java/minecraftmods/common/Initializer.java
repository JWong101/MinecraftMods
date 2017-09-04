package common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface Initializer {

	public void preInit(FMLPreInitializationEvent event);

	public void init(FMLInitializationEvent event);
	
	public void postInit(FMLPostInitializationEvent event);

}
