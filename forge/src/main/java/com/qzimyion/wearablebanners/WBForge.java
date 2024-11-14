package com.qzimyion.wearablebanners;

import net.minecraftforge.fml.common.Mod;

@Mod(WBConstants.MOD_ID)
public class WBForge {

    public WBForge() {

        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        WBConstants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }
}