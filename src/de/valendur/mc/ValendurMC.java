package de.valendur.mc;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ValendurMC extends JavaPlugin implements Listener {
	public static final String CHAT_PREFIX = ChatColor.AQUA + "Template Plugin";

	private static ValendurMC plugin; 


	@Override
	public void onDisable() {
		
	}

	public static ValendurMC getPlugin() { 
		return plugin;
	}
	
	@Override
	public void onEnable() {
		plugin = this;
		PluginManager pm = getServer().getPluginManager();

		//this.getCommand("example").setExecutor(new ExampleCommand());
		//pm.registerEvents(new ExampleListener(), this);
		
	}

}