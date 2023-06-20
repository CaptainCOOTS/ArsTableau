package com.COOTS.arstableau;

import com.COOTS.arstableau.blocks.Registration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value="arstableau")
public class ArsTableau {
    public static final String MOD_ID = "arstableau";
    public static boolean isClient = false;

    public ArsTableau() {
        Registration.register();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    private void doClientStuff(FMLClientSetupEvent event) {
        isClient = true;
    }

}