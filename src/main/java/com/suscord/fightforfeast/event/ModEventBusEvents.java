package com.suscord.fightforfeast.event;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.ModEntityTypes;
import com.suscord.fightforfeast.entity.custom.Rollcat;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = FightforFeast.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ROLLCAT.get(), Rollcat.setAttributes());
    }
}