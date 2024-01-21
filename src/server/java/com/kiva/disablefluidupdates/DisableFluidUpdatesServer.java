package com.kiva.disablefluidupdates;

import com.fox2code.foxloader.loader.Mod;
import com.fox2code.foxloader.loader.ServerMod;
import com.fox2code.foxloader.registry.CommandCompat;

public class DisableFluidUpdatesServer extends Mod implements ServerMod {
    @Override
    public void onInit() {
        CommandCompat.registerCommand(new CommandReplaceReal());
    }
}
