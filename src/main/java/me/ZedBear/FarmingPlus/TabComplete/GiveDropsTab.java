package me.ZedBear.FarmingPlus.TabComplete;

import me.ZedBear.FarmingPlus.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GiveDropsTab implements TabCompleter {

    private final Main plugin;

    public GiveDropsTab(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        if(cmd.getName().equalsIgnoreCase("givedrops") && args.length >= 3) {
            if(sender instanceof Player) {
                Player player = (Player) sender;

                List<String> myString = new ArrayList<String>();
                myString.add("potato");
                myString.add("carrot");
                myString.add("cactus");
                myString.add("pumpkin");
                myString.add("melon");
                myString.add("sugarcane");
                myString.add("netherwart");

                return myString;
            }
        }
        return null;
    }
}
