package com.zycdojar;

import com.zycdojar.Proxys.Common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static net.minecraftforge.fml.common.Mod.*;

/**
 * Created by jy on 2019/8/31.
 */
@Mod(modid = "redxdttt",name = "redxdttt",version = "des")
public class main {
    @Instance
    public static main instance = new main();
    @SidedProxy(clientSide = "com.zycdojar.Proxys.Client",serverSide = "com.zycdojar.Proxys.Common")
    public static Common proxy;
    public static Logger log;
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        log.info("Execute1");
        log=event.getModLog();
        proxy.preInit(event);
    }
    @EventHandler
    public static void init(FMLInitializationEvent event){
        log.info("Execute2");
        proxy.init(event);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
