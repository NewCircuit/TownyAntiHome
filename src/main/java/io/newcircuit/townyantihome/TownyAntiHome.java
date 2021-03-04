package io.newcircuit.townyantihome;

import io.newcircuit.townyantihome.events.OnCommandEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TownyAntiHome extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new OnCommandEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TownyAntiHome]: Plugin is enabled!");
    }

    @Override
    public void onDisable()
    {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TownyAntiHome]: Plugin is disabled!");
        // Plugin shutdown logic
    }
}
