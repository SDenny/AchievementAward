package com.minecraftport.achievementAward;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

public class AchieveListener implements Listener {

    Server s = Bukkit.getServer();

    String atag = ChatColor.RESET + "" + ChatColor.DARK_RED + "[!] " + ChatColor.RESET;
    ChatColor c = ChatColor.AQUA;

    public void broadcastAchieve(String str){
        Bukkit.getServer().broadcastMessage("\n" + atag + c + str);
    }

    @EventHandler
    public void onAchievementEvent(PlayerAchievementAwardedEvent e){
        Player p = e.getPlayer();
        String n = p.getName();
        Achievement a = e.getAchievement();


        switch (a){
            case ON_A_RAIL:
                s.broadcastMessage("How many people do you know that would make a one-km railroad? " + n + " just did!");
                break;
            case KILL_ENEMY:
                s.broadcastMessage(ChatColor.RED + "First Blood.." + c + "That is, "+ n + "'s first blood.");
                break;
            case FLY_PIG:
                broadcastAchieve(n + " rode a pig off a cliff. This guy is crazy!");
                break;
            case SNIPE_SKELETON:
                broadcastAchieve(n + " took out a skelly from over 50 meter away!");
                break;
            case NETHER_PORTAL:
                broadcastAchieve(n + " built a nether portal!");
                break;
            case GHAST_RETURN:
                broadcastAchieve(n + " just played baseball with a Ghast! What a badass!");
                break;
            case BREW_POTION:
                broadcastAchieve(n + " brewed up some \"liquid win\"!");
                break;
            case END_PORTAL:
                broadcastAchieve(n + " made it to The End!");
                break;
            case THE_END:
                broadcastAchieve(n + " Killed the "+ChatColor.DARK_PURPLE+"Ender Dragon"+c+".");
                break;
            case OVERKILL:
                broadcastAchieve(n + " hit for over 9000!");
                break;
            case SPAWN_WITHER:
                broadcastAchieve(n + " spawned their first wither.. Aww..");
                break;
            case KILL_WITHER:
                broadcastAchieve(n + " killed a wither!");
                break;
            case DIAMONDS_TO_YOU:
                broadcastAchieve(n + " gave away some diamonds. Weirdo..");
                break;
            default:
                break;
        }

    }

}
