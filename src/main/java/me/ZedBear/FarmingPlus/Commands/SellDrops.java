package me.ZedBear.FarmingPlus.Commands;

import me.ZedBear.FarmingPlus.Main;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SellDrops implements CommandExecutor {
    private final Main plugin;

    public SellDrops(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only Player can use that command!");
        } else {
            Player player = (Player) sender;
            Economy economy = plugin.getEconomy();

            if (player.hasPermission("farmingplus.selldrops")) {
                if (cmd.getName().equalsIgnoreCase("selldrops")) {
                    int total = 0;
                    if (player.getInventory().contains(plugin.getItemManager().cactus(1))) {
                        total+=plugin.getConfig().getInt("prices.cactus.1");
                        player.getInventory().removeItem(plugin.getItemManager().cactus(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.cactus.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().cactus(2))) {
                        total+=plugin.getConfig().getInt("prices.cactus.2");
                        player.getInventory().removeItem(plugin.getItemManager().cactus(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.cactus.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().cactus(3))) {
                        total+=plugin.getConfig().getInt("prices.cactus.3");
                        player.getInventory().removeItem(plugin.getItemManager().cactus(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.cactus.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().carrot(1))) {
                        total+=plugin.getConfig().getInt("prices.carrot.1");
                        player.getInventory().removeItem(plugin.getItemManager().carrot(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.carrot.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().carrot(2))) {
                        total+=plugin.getConfig().getInt("prices.carrot.2");
                        player.getInventory().removeItem(plugin.getItemManager().carrot(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.carrot.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().carrot(3))) {
                        total+=plugin.getConfig().getInt("prices.carrot.3");
                        player.getInventory().removeItem(plugin.getItemManager().carrot(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.carrot.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().potato(1))) {
                        total+=plugin.getConfig().getInt("prices.potato.1");
                        player.getInventory().removeItem(plugin.getItemManager().potato(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.potato.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().potato(2))) {
                        total+=plugin.getConfig().getInt("prices.potato.2");
                        player.getInventory().removeItem(plugin.getItemManager().potato(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.potato.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().potato(3))) {
                        total+=plugin.getConfig().getInt("prices.potato.3");
                        player.getInventory().removeItem(plugin.getItemManager().potato(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.potato.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().pumpkin(1))) {
                        total+=plugin.getConfig().getInt("prices.pumpkin.1");
                        player.getInventory().removeItem(plugin.getItemManager().pumpkin(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.pumpkin.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().pumpkin(2))) {
                        total+=plugin.getConfig().getInt("prices.pumpkin.2");
                        player.getInventory().removeItem(plugin.getItemManager().pumpkin(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.pumpkin.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().pumpkin(3))) {
                        total+=plugin.getConfig().getInt("prices.pumpkin.3");
                        player.getInventory().removeItem(plugin.getItemManager().pumpkin(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.pumpkin.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().melon(1))) {
                        total+=plugin.getConfig().getInt("prices.melon.1");
                        player.getInventory().removeItem(plugin.getItemManager().melon(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.melon.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().melon(2))) {
                        total+=plugin.getConfig().getInt("prices.melon.2");
                        player.getInventory().removeItem(plugin.getItemManager().melon(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.melon.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().melon(3))) {
                        total+=plugin.getConfig().getInt("prices.melon.3");
                        player.getInventory().removeItem(plugin.getItemManager().melon(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.melon.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().wheatSeeds(1))) {
                        total+=plugin.getConfig().getInt("prices.wheat-seeds.1");
                        player.getInventory().removeItem(plugin.getItemManager().wheatSeeds(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.wheat-seeds.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().wheatSeeds(2))) {
                        total+=plugin.getConfig().getInt("prices.wheat-seeds.2");
                        player.getInventory().removeItem(plugin.getItemManager().wheatSeeds(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.wheat-seeds.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().wheatSeeds(3))) {
                        total+=plugin.getConfig().getInt("prices.wheat-seeds.3");
                        player.getInventory().removeItem(plugin.getItemManager().wheatSeeds(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.wheat-seeds.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().sugarCane(1))) {
                        total+=plugin.getConfig().getInt("prices.sugarcane.1");
                        player.getInventory().removeItem(plugin.getItemManager().sugarCane(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.sugarcane.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().sugarCane(2))) {
                        total+=plugin.getConfig().getInt("prices.sugarcane.2");
                        player.getInventory().removeItem(plugin.getItemManager().sugarCane(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.sugarcane.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().sugarCane(3))) {
                        total+=plugin.getConfig().getInt("prices.sugarcane.3");
                        player.getInventory().removeItem(plugin.getItemManager().sugarCane(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.sugarcane.3"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().netherWart(1))) {
                        total+=plugin.getConfig().getInt("prices.nether_wart.1");
                        player.getInventory().removeItem(plugin.getItemManager().netherWart(1));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.nether_wart.1"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().netherWart(2))) {
                        total+=plugin.getConfig().getInt("prices.nether_wart.2");
                        player.getInventory().removeItem(plugin.getItemManager().netherWart(2));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.nether_wart.2"));
                    }
                    if (player.getInventory().contains(plugin.getItemManager().netherWart(3))) {
                        total+=plugin.getConfig().getInt("prices.nether_wart.3");
                        player.getInventory().removeItem(plugin.getItemManager().netherWart(3));
                        economy.withdrawPlayer(player, plugin.getConfig().getInt("prices.nether_wart.3"));
                    }
                    sender.sendMessage(ChatColor.GREEN + "You sold all drops in your inventory for " + total + "!");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You do not have permission to do that!");
            }
        }
        return true;
    }
}
