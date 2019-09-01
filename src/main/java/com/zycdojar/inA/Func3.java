package com.zycdojar.inA;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

/**
 * Created by jy on 2019/9/1.
 */
@Mod.EventBusSubscriber
public class Func3 {
    public Func3(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public static void anc(PlayerEvent.ItemPickupEvent event){
        if(event.player.getHealth()<=10.0f){
            event.player.setHealth(20.0f);
        }
    }
}
