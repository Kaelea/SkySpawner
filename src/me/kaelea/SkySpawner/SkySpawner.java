package me.kaelea.SkySpawner;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SkySpawner extends JavaPlugin implements Listener {
	public void onEnable(){
		
	}

	public boolean onCommand(CommandSender s, Command cmd){
		if(s instanceof Player cmd.getName().equalsIgnoreCase("sz")){
			Player player;
			player.getWorld().spawnEntity(player.getLocation(),
					EntityType.ZOMBIE);
			player.sendMessage(ChatColor.BLUE
					+ "Spawning a zombie near you");
		}else{
			
		}
		
	}
	
	public void onDisable(){
		
	}
}
