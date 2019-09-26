package com.byuminecraft.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {
	// Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	// Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("GiveMePower").setExecutor(new CommandKit());
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}
