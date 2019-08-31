package com.zycdojar.Functions;

import com.zycdojar.Mod.item.ErrorIngot;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by jy on 2019/8/31.
 */
@Mod.EventBusSubscriber
public class itemRegister {
    public static ErrorIngot ei = new ErrorIngot("erroringot");
    public itemRegister(){}
}
