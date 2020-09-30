package me.cyberdie22.hypixelskyblockremake;

import me.cyberdie22.hypixelskyblockremake.Commands.GiveItemCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class HypixelSkyblockRemake extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[HSR] Hypixel Skyblock Remake loading!");
        // Plugin startup logic

        Objects.requireNonNull(this.getCommand("giveitem")).setExecutor(new GiveItemCommand());



        // Loaded plugin
        Bukkit.getConsoleSender().sendMessage("[HSR] Hypixel Skyblock Remake loaded!");
        Bukkit.getConsoleSender().sendMessage("[HSR] WARNING: PROFILE LIMIT DISABLED, DO NOT DISTRIBUTE");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
