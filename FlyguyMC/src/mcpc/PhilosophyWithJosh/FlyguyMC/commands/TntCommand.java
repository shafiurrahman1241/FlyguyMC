package mcpc.PhilosophyWithJosh.FlyguyMC.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import mcpc.PhilosophyWithJosh.FlyguyMC.Main;

public class TntCommand implements CommandExecutor
{
	private Main plugin;
	
	public TntCommand(Main plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("flyguy").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command beblockhunter, String label, String[] args)
	{
		return true;
	}
}
