package com.zycdojar.Functions;

import com.zycdojar.Mod.item.ErrorIngot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.fml.common.Mod.*;

/**
 * Created by jy on 2019/8/31.
 */
@EventBusSubscriber
public class itemRegister {
    public static ErrorIngot ei = new ErrorIngot("erroringot");
    @SubscribeEvent
    public static void onItemReg(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(Reference.RegisterStack.toArray(new Item[0]));
        //event.getRegistry().register(ei);
    }
}
