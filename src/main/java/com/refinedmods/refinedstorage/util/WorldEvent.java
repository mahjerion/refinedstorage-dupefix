package com.refinedmods.refinedstorage.util;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.storage.PrimaryLevelData;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WorldEvent {

    @SubscribeEvent
    public static void onWorldLoad(LevelEvent.Load event) {
        if (event.getLevel().isClientSide()) return;
        if (!(event.getLevel() instanceof ServerLevel world)) return;
        if (!(world.getLevelData() instanceof PrimaryLevelData info)) return;

        MinecraftServer server = world.getServer();

        System.out.println("CTE2 Essentials: Applying Blacklist!");
        server.getCommands().performPrefixedCommand(server.createCommandSourceStack(), "/invsorter bladd sophisticatedbackpacks:backpack");
    }
}
