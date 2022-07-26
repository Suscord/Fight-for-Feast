package com.suscord.fightforfeast.entity;

import com.suscord.fightforfeast.FightforFeastMod;
import com.suscord.fightforfeast.entity.monster.Jawbreakerspider;
import com.suscord.fightforfeast.entity.neutral.Tortetoise;
import com.suscord.fightforfeast.entity.passive.Candyspirit;
import com.suscord.fightforfeast.entity.passive.Rollcat;
import com.suscord.fightforfeast.entity.passive.Fruitjellyslime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFORFEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FightforFeastMod.MOD_ID);

    public static final RegistryObject<EntityType<Candyspirit>> CANDYSPIRIT =
            ENTITY_TYPES.register("candyspirit",
                    () -> EntityType.Builder.of(Candyspirit::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "candyspirit").toString()));

    public static final RegistryObject<EntityType<Jawbreakerspider>> JAWBREAKERSPIDER =
            ENTITY_TYPES.register("jawbreakerspider",
                    () -> EntityType.Builder.of(Jawbreakerspider::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "jawbreakerspider").toString()));

    public static final RegistryObject<EntityType<Fruitjellyslime>> FRUITJELLYSLIME =
            ENTITY_TYPES.register("fruitjellyslime",
                    () -> EntityType.Builder.of(Fruitjellyslime::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.7f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "fruitjellyslime").toString()));

    public static final RegistryObject<EntityType<Rollcat>> ROLLCAT =
            ENTITY_TYPES.register("rollcat",
                    () -> EntityType.Builder.of(Rollcat::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "rollcat").toString()));

    public static final RegistryObject<EntityType<Tortetoise>> TORTETOISE =
            ENTITY_TYPES.register("tortetoise",
                    () -> EntityType.Builder.of(Tortetoise::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "tortetoise").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}