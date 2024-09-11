package me.cryptforge.moduleissue;

import net.minestom.server.MinecraftServer;
import net.minestom.server.event.player.AsyncPlayerConfigurationEvent;
import net.minestom.server.instance.Instance;

public class Main {
    public static void main(String[] args) {
        MinecraftServer minecraftServer = MinecraftServer.init();

        final Instance instance = MinecraftServer.getInstanceManager().createInstanceContainer();

        MinecraftServer.getGlobalEventHandler().addListener(AsyncPlayerConfigurationEvent.class, event -> {
            event.setSpawningInstance(instance);
        });

        minecraftServer.start("0.0.0.0", 25565);
    }
}