package com.mixology;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MixologyMod.MODID, name = MixologyMod.NAME, version = MixologyMod.VERSION)
public class MixologyMod
{
    public static final Logger LOGGER = LogManager.getLogger(MixologyMod.class);

    public static final String MODID = "mixology";
    public static final String NAME = "Mixology";
    public static final String VERSION = "1.0.0";

//    @EventHandler
//    public void preInit(FMLPreInitializationEvent event)
//    {
//        LOGGER = event.getModLog();
//    }

//    @EventHandler
//    public void init(FMLInitializationEvent event)
//    {
//        // some example code
//        GameRegistry.findRegistry(Block.class).register();
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
//    }
//
//    @SubscribeEvent
//    public static void onRegisterBlocksEvent(@Nonnull final RegistryEvent.Register<Block> event) {
//        event.getRegistry().registerAll(new SolutionBlock());
//
//    }
}
