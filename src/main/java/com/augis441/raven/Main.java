package com.augis441.raven;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("RavenPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("RavenPlugin has been disabled!");
    }
}