package com.minecraftport.achievementAward;

import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.EventListener;

public class main extends JavaPlugin {

    public final String tag = "[AchievementAward]";

    @Override
    public void onDisable(){
        PluginDescriptionFile desc = this.getDescription();
        System.out.println(tag + " AchievementAward v." + desc.getVersion() + " has been disabled!");
    }

    @Override
    public void onEnable(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new AchieveListener(), this);

        PluginDescriptionFile desc = this.getDescription();
        System.out.println(tag + " AchievementAward v." + desc.getVersion() + " has been enabled!");
    }

}
