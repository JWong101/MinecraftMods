package common;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= ModEntry.MODID, name = ModEntry.NAME, version = ModEntry.VERSION)
public class ModEntry implements Initializer{
	
	
	public static final String MODID = "spawningblockmod";
	
	public static final String NAME = "Spawning Block Mod";
	
	public static final String VERSION = "1.0";
	
	public static Logger LOGGER;
	
	@SidedProxy(clientSide="client.ClientProxy", serverSide="common.ServerProxy")
	public static CommonProxy PROXY;
	
	@Mod.Instance(ModEntry.MODID)
	public static ModEntry ENTRY;

	/* (non-Javadoc)
	 * @see common.Initializer#preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent)
	 */
	@Override
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit(event);
		LOGGER = event.getModLog();
	}

	/* (non-Javadoc)
	 * @see common.Initializer#init(net.minecraftforge.fml.common.event.FMLInitializationEvent)
	 */
	@Override
	@EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.init(event);
	}

	/* (non-Javadoc)
	 * @see common.Initializer#postInit(net.minecraftforge.fml.common.event.FMLInitializationEvent)
	 */
	@Override
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		PROXY.postInit(event);
	}

}
