package me.ZedBear.FarmingPlus.Commands;

import me.ZedBear.FarmingPlus.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveDrop implements CommandExecutor {

    private final Main plugin;

    public GiveDrop(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().severe("1");
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can execute that command!");
        } else {
            Player player = (((Player) sender).getPlayer());
            if (cmd.getName().equalsIgnoreCase("givedrops")) {
                Bukkit.getLogger().severe("2");
                if (player.hasPermission("farmingplus.give")) {
                    Bukkit.getLogger().severe("3");
                    if (args.length <= 1) {
                        player.sendMessage(ChatColor.RED + "Invalid usage! Use /givedrops <item> <tier>!");
                    } else if (args.length >=3) {
                    player.sendMessage(ChatColor.RED + "Invalid usage! Use /givedrops <item> <tier>!");
                    } else if (args.length == 2) {
                        Bukkit.getLogger().severe("4");
                        int amount = Integer.parseInt(args[1]);
                        if (args[0].equalsIgnoreCase("cactus")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().cactus(tier));
                        } else if (args[0].equalsIgnoreCase("carrot")) {
                            Bukkit.getLogger().severe("5");
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().carrot(tier));
                        } else if (args[0].equalsIgnoreCase("potato")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().potato(tier));
                        } else if (args[0].equalsIgnoreCase("pumpkin")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().pumpkin(tier));
                        } else if (args[0].equalsIgnoreCase("melon")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().melon(tier));
                        } else if (args[0].equalsIgnoreCase("wheat_seeds")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().wheatSeeds(tier));
                        } else if (args[0].equalsIgnoreCase("sugarcane")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().sugarCane(tier));
                        } else if (args[0].equalsIgnoreCase("nether_wart")) {
                            int tier = Integer.parseInt(args[1]);
                            player.getInventory().addItem(plugin.getItemManager().netherWart(tier));
                        }
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to do that!");
                }
            }

        }
     return true;
    }
}
