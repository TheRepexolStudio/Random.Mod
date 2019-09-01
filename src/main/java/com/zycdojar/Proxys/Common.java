package com.zycdojar.Proxys;

import com.zycdojar.inA.Func3;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by jy on 2019/8/31.
 */
public class Common {
    public static void preInit(FMLPreInitializationEvent event){
        new Func3();
    }
    public static void init(FMLInitializationEvent event){
    }
    public static void postInit(FMLPostInitializationEvent event){
    }
}
