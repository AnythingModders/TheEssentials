package com.bwfcwalshy.theessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Nick implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("nick")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.RED + "Usage: /nick (name)");
			} else if (args.length == 1) {
				player.setDisplayName(args[0]);
				sender.sendMessage(ChatColor.BLUE + "Nick changed to "
						+ ChatColor.GREEN + player.getDisplayName());
				ChatColor.translateAlternateColorCodes('&', args[0]);
			}
		}
		return false;
	}
}
