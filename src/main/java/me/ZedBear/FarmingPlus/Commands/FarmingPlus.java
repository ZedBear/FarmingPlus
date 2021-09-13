package me.ZedBear.FarmingPlus.Commands;

import me.ZedBear.FarmingPlus.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FarmingPlus implements CommandExecutor {
    private final Main plugin;

    public FarmingPlus(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("farmingplus")) {
            if (sender.hasPermission("farmingplus.admin")) {
                if (args.length == 0) {
                    //Player only typed '/infinitebuckets' so lets heal them back!
                    sender.sendMessage(ChatColor.RED + "Invalid usage: Use /fp reload!");
                } else {
                    //Player typed something more
                    if (args.length >= 1) {
                        if (args[0].equals("reload")) {
                            plugin.reloadConfig();
                            sender.sendMessage(ChatColor.GREEN + "Configuration Reloaded.");
                        } else {
                            sender.sendMessage(ChatColor.GREEN + "Configuration Reloaded.");
                        }

                    } else {
                        sender.sendMessage(ChatColor.RED + "Incorrect usage. /fp reload!");
                    }
                }
            }
        }
        return true;
    }

}
