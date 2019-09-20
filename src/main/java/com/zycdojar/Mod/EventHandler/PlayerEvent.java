package com.zycdojar.Mod.EventHandler;

import com.zycdojar.Functions.itemRegister;
import com.zycdojar.inA.Func3;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.Style;
import net.minecraft.world.GameType;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jy on 2019/9/1.
 */
@Mod.EventBusSubscriber
public class PlayerEvent {
    @SubscribeEvent
    public static void WitherEvent(AttackEntityEvent event) {
        EntityWither wither;
        EntityPlayer player;
        if (event.getTarget() instanceof EntityWither) {
            wither = (EntityWither) event.getTarget();
            player = event.getEntityPlayer();
            if (player.getHealth() == 20f) {
                player.setHealth(0f);
            } else {
                player.setGameType(GameType.SURVIVAL);
            }
        }else if(event.getTarget() instanceof EntityDragon){
            EntityDragon entityDragon = (EntityDragon) event.getTarget();
            entityDragon.setPortal(event.getEntityPlayer().getPosition());
            new Func3(entityDragon,event.getEntityPlayer());
        }else{

        }
    }
}
