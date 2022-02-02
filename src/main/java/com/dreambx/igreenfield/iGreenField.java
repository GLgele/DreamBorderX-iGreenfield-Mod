package com.dreambx.igreenfield;

import com.dreambx.igreenfield.gameObjs.registers.items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Utils.MOD_ID)
@Mod.EventBusSubscriber(modid = Utils.MOD_ID)
public class iGreenField {
    public iGreenField()
    {
        items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
