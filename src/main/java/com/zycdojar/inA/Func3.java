package com.zycdojar.inA;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

/**
 * Created by jy on 2019/9/8.
 */
public class Func3 implements Runnable{
    EntityDragon dragon;
    EntityPlayer player;
    public Func3(EntityDragon ed,EntityPlayer ep){
        dragon=ed;player=ep;
    }
    @Override
    public void run() {
        while(!dragon.isDead){
            BlockPos pos = new BlockPos(player.getPosition().getX(),player.getPosition().getY()+5,player.getPosition().getZ());
            dragon.setPortal(pos);
        }
    }
}
