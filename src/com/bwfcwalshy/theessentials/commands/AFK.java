package com.bwfcwalshy.theessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AFK implements CommandExecutor {
	
	public boolean isAfk = false;

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("afk")){
			if(isAfk == false){
				Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + sender.getName() + ChatColor.GRAY + " is now afk");
				isAfk = true;
				player.setWalkSpeed(0);
			}else if(isAfk == true){
				Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + sender.getName() + ChatColor.GRAY + " is no longer afk");
				isAfk = false;
				player.setWalkSpeed((float) 0.2);
			}
		}
		return isAfk;
	}
}
