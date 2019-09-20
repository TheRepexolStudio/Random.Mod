package com.zycdojar.Mod.item;

import com.zycdojar.Functions.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by jy on 2019/8/31.
 */
public class ErrorIngot extends Item {
    public ErrorIngot(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        Reference.RegisterStack.add(this);
    }
}
