package com.bwfcwalshy.theessentials;

import org.bukkit.plugin.java.JavaPlugin;

import com.bwfcwalshy.theessentials.commands.AFK;
import com.bwfcwalshy.theessentials.commands.Feed;
import com.bwfcwalshy.theessentials.commands.Fly;
import com.bwfcwalshy.theessentials.commands.GM;
import com.bwfcwalshy.theessentials.commands.Heal;
import com.bwfcwalshy.theessentials.commands.Nick;
import com.bwfcwalshy.theessentials.commands.Test;
import com.bwfcwalshy.theessentials.listener.OPColour;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		
		getCommand("heal").setExecutor(new Heal());
		getCommand("nick").setExecutor(new Nick());
		getCommand("feed").setExecutor(new Feed());
		getCommand("fly").setExecutor(new Fly());
		getCommand("gm").setExecutor(new GM());
		getCommand("afk").setExecutor(new AFK());
		getCommand("test").setExecutor(new Test());
		
		getServer().getPluginManager().registerEvents(new OPColour(), this);
		
	}
	
	public void onDisable(){

	}
}
