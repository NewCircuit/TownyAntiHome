package jirubizu.townyantihome.events;

import com.palmergames.bukkit.towny.TownyAPI;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OnCommandEvents implements Listener
{
    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event)
    {
        Player player = event.getPlayer();
        try
        {
            if (event.getMessage().contains("/sethome"))
            {
                Town town = TownyAPI.getInstance().getTownBlock((player).getLocation()).getTown();
                Resident resident = TownyAPI.getInstance().getDataSource().getResident(player.getName());
                if (!resident.getTown().equals(town))
                {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage("[TownyAntiHome]: You can not set homes in other towns");
                }
            }
        }
        catch (Exception e)
        {
            //
        }

    }
}
